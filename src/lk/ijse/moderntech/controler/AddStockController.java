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
import java.util.ArrayList;
import java.util.List;
import lk.ijse.moderntech.db.DBConnection;
import lk.ijse.moderntech.model.SSModel;
import lk.ijse.moderntech.model.StockModel;

/**
 *
 * @author Shamal
 */
public class AddStockController {
    Connection connection;

    public AddStockController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public String getStockID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Stock_ID FROM stock ORDER BY Stock_ID DESC LIMIT 1").executeQuery();
        if(rst.next()){
            String tempID = rst.getString(1);
            String[] split = tempID.split("S");
            int id = Integer.valueOf(split[1]);
            id++;
            if(id<10){return "S000"+id;}
            else if(id<100){return "S00"+id;}
            else if(id<1000){return "S0"+id;}
            else {return "S"+id;}
        }else{
            return "S0001";
        }
    }

    public List<String> getSupplier() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Supplier_ID FROM supplier").executeQuery();
        List<String> tempList = new ArrayList();
        while(rst.next()){
            tempList.add(rst.getString(1));
        }
        return tempList;
    }

    public boolean saveStock(StockModel stock, SSModel ss) throws SQLException {
        try{
            connection.setAutoCommit(false);
            PreparedStatement stm = connection.prepareStatement("INSERT INTO stock VALUES(?,?,?,?,?,?,?)");
            stm.setString(1, stock.getStockID());
            stm.setString(2, stock.getPartID());
            stm.setString(3, stock.getComputerID());
            stm.setString(4, stock.getQTYonhand());
            stm.setString(5, stock.getBuyingPrice());
            stm.setString(6, stock.getProfitPrecentage());
            stm.setString(7, stock.getSellingPricel());
            boolean saved1 = stm.executeUpdate() > 0;
            if(saved1){
                PreparedStatement stm2 = connection.prepareStatement("INSERT INTO ss VALUES(?,?)");
                stm2.setString(1, ss.getStockID());
                stm2.setString(2, ss.getSupplierID());
                boolean saved2 = stm2.executeUpdate() > 0;
                if(saved2){
                    connection.commit();
                    return true;
                }else{
                    connection.rollback();
                    return false;
                }
            }else{
                connection.rollback();
                return false;
            }
        }finally{
            connection.setAutoCommit(true);
        }
    }
    
}
