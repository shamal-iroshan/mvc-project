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
public class UpdatePartController {
    Connection connection;

    public UpdatePartController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<String>  getWarranty() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Duration FROM warranty").executeQuery();
        List<String> tempList = new ArrayList();
        while(rst.next()){
            tempList.add(rst.getString(1));
        }
        return tempList;
    }

    public List<PartModel> getParts() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM part").executeQuery();
        List<PartModel> tempLIst = new ArrayList();
        while(rst.next()){
            tempLIst.add(new PartModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));
        }
        return tempLIst;
    }

    public PartModel getParts(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM part WHERE Part_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return new PartModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4), 
                    rst.getString(5),
                    rst.getString(6)
            );
        }
        return null;
    }

    public boolean updatePart(PartModel part) throws SQLException {
        String warrantyID = getWarrantyID(part.getWarrantyID());
        PreparedStatement stm = connection.prepareStatement("UPDATE part SET Warranty_ID=?,Part_name=?,Value=?,Brand=?,Description=? WHERE Part_ID=?");
        stm.setString(1, warrantyID);
        stm.setString(2, part.getPartName());
        stm.setString(3, part.getValue());
        stm.setString(4, part.getBrand());
        stm.setString(5, part.getDescription());
        stm.setString(6, part.getPartID());
        return stm.executeUpdate() > 0;
    }

    private String getWarrantyID(String warrantyID) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Warranty_ID FROM warranty WHERE Duration=?");
        stm.setString(1, warrantyID);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }
    
}
