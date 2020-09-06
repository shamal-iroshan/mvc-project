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
import lk.ijse.moderntech.model.PartModel;

/**
 *
 * @author Shamal
 */
public class AddPartController {
    Connection connection;

    public AddPartController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
        
    }

    public String getPartID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Part_ID FROM part ORDER BY Part_ID DESC LIMIT 1").executeQuery();
        if(rst.next()){
            String tempID = rst.getString(1);
            String[] split = tempID.split("P");
            int id = Integer.valueOf(split[1]);
            id++;
            if(id<10){return "P000"+id;}
            else if(id<100){return "P00"+id;}
            else if(id<1000){return "P0"+id;}
            else{return "P"+id;}
        }else{
            return "P0001";
        }
        
    }

    public List<String> getWarranty() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Duration  FROM warranty").executeQuery();
        List<String> tempList = new ArrayList();
        while(rst.next()){
            tempList.add(rst.getString(1));
        }
        return tempList;
    }

    public boolean savePart(PartModel part) throws SQLException {
        String warranty = getWarrantyID(part.getWarrantyID());
        PreparedStatement stm = connection.prepareStatement("INSERT INTO part VALUES(?,?,?,?,?,?)");
        stm.setString(1, part.getPartID());
        stm.setString(2, warranty);
        stm.setString(3, part.getPartName());
        stm.setString(4, part.getValue());
        stm.setString(5, part.getBrand());
        stm.setString(6, part.getDescription());
        return stm.executeUpdate() > 0;
    }

    private String getWarrantyID(String warrantyID) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Warranty_ID FROM warranty WHERE Duration =?");
        stm.setString(1, warrantyID);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }
    
}
