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
import lk.ijse.moderntech.model.WarrantyModel;

/**
 *
 * @author Shamal
 */
public class WarrantyController {
    Connection connection;

    public WarrantyController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<WarrantyModel> getAllWarranty() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM warranty").executeQuery();
        List<WarrantyModel> tempList = new ArrayList();
        
        while(rst.next()){
            tempList.add(new WarrantyModel(
                    rst.getString(1),
                    rst.getString(2)
            ));
        }
        return tempList;
    }

    public WarrantyModel getWarranty(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM warranty WHERE Warranty_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return new WarrantyModel(
                    rst.getString(1),
                    rst.getString(2)
            );
        }
        return null;
    }

    public boolean saveWarranty(String text) throws SQLException {
        String id = getWarrantyID();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO warranty VALUES(?,?)");
        stm.setString(1, id);
        stm.setString(2, text);
        return stm.executeUpdate() > 0;
    }

    private String getWarrantyID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Warranty_ID FROM warranty ORDER BY Warranty_ID DESC LIMIT 1").executeQuery();
        if(rst.next()){
            String tempID = rst.getString(1);
            String[] split = tempID.split("W");
            int id = Integer.valueOf(split[1]);
            id++;
            if(id<10){return "W000"+id;}
            else if(id<100){return "W00"+id;}
            else if(id<1000){return "W0"+id;}
            else{return "W"+id;}
        }else{
            return "W0001";
        }
    }

    public boolean updateWarranty(WarrantyModel warranty) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("UPDATE warranty SET Duration=? WHERE Warranty_ID=?");
        stm.setString(1, warranty.getDuration());
        stm.setString(2, warranty.getWarrantyID());
        return stm.executeUpdate() > 0;
    }

    public boolean deleteWarranty(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM warranty WHERE Warranty_ID=?");
        stm.setString(1, text);
        return stm.executeUpdate() > 0;
    }
    
}
