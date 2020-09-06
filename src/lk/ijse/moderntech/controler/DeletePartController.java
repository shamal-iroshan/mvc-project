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
public class DeletePartController {
    Connection connection;

    public DeletePartController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<PartModel> getPart() throws SQLException {
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

    public PartModel getpartByID(String text) throws SQLException {
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

    public boolean deletePart(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM part WHERE Part_ID=?");
        stm.setString(1, text);
        return stm.executeUpdate() > 0;
    }
}
