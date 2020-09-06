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
import lk.ijse.moderntech.model.SpecModel;

/**
 *
 * @author Shamal
 */
public class ManageSpecController {
    Connection connection;

    public ManageSpecController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<SpecModel> getAllSpecs() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM spec").executeQuery();
        List<SpecModel> tempList = new ArrayList();
        while(rst.next()){
            tempList.add(new SpecModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
            ));
        }
        return tempList;
    }

    public boolean saveSpec(SpecModel spec) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO spec VALUES(?,?,?)");
        stm.setString(1, getSpecID());
        stm.setString(2, spec.getPart());
        stm.setString(3, spec.getValue());
        return stm.executeUpdate() > 0;
    }
    
    private String getSpecID() throws SQLException{
        ResultSet rst = connection.prepareStatement("SELECT Spec_ID FROM spec ORDER BY Spec_ID DESC LIMIT 1").executeQuery();
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }

    public boolean deleteSpec(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM spec WHERE Spec_ID=?");
        stm.setString(0, text);
        return stm.executeUpdate() > 0;
    }
}
