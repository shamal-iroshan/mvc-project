/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lk.ijse.moderntech.db.DBConnection;
import lk.ijse.moderntech.model.PurchaseModel;

/**
 *
 * @author Shamal
 */
public class MakePurchaseController {
    Connection connection;

    public MakePurchaseController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public String getPurchaseID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Purchase_ID FROM purchase ORDER BY Purchase_ID DESC LIMIT 1").executeQuery();
        if(rst.next()){
            String tempID = rst.getString(1);
            String[] split = tempID.split("P");
            int id  = Integer.valueOf(split[1]);
            id++;
            if(id<10){return "P000"+id;}
            if(id<100){return "P00"+id;}
            if(id<1000){return "P0"+id;}
            else{return "P"+id;}
        }else{
            return "P0001";
        }
    }

    public List<String> getSupplierID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Supplier_ID FROM supplier").executeQuery();
        List<String> tempList = new ArrayList();
        while(rst.next()){
            tempList.add(rst.getString(1));
        }
        return tempList;
    }

    public String getDate() {
        Date D1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
        return format1.format(D1);
    }

    public boolean savePurchase(PurchaseModel purchase) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO purchase VALUES(?,?,?,?,?)");
        stm.setString(1, purchase.getPurchaseID());
        stm.setString(2, purchase.getEmployeeID());
        stm.setString(3, purchase.getSupplierID());
        stm.setString(4, purchase.getAmount());
        stm.setString(5, purchase.getPurchaseDate());
        return stm.executeUpdate() > 0;
    }

}
