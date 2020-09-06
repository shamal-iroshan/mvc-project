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
import lk.ijse.moderntech.db.DBConnection;
import lk.ijse.moderntech.model.SupplierModel;

/**
 *
 * @author Shamal
 */
public class AddSupplierController {
    Connection connection;

    public AddSupplierController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public String getSupplierID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Supplier_ID FROM supplier ORDER BY Supplier_ID DESC LIMIT 1").executeQuery();
        if(rst.next()){
            String tempID = rst.getString(1);
            String[] split = tempID.split("S");
            int id = Integer.valueOf(split[1]);
            id++;
            if(id<10){return "S000"+id;}
            else if(id<100){return "S00"+id;}
            else if(id<1000){return "S0"+id;}
            else{return  "S"+id;}
        }else{
            return "S0001";
        }
    }

    public boolean saveSupplier(SupplierModel supplier) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO supplier VALUES(?,?,?,?)");
        stm.setString(1, supplier.getSupplierID());
        stm.setString(2, supplier.getName());
        stm.setString(3, supplier.getContactNo());
        stm.setString(4, supplier.getDetail());
        return stm.executeUpdate() > 0;
    }
    
}
