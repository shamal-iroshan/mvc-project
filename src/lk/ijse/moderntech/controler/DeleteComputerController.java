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
import lk.ijse.moderntech.model.ComputerModel;

/**
 *
 * @author Shamal
 */
public class DeleteComputerController {
    Connection connection;

    public DeleteComputerController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<ComputerModel> getAllComputers() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM computer").executeQuery();
        List<ComputerModel> tempList = new ArrayList();
        while(rst.next()){
            tempList.add(new ComputerModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            ));
        }
        return tempList;
    }

    public boolean deleteComputer(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM computer WHERE Computer_ID=?");
        stm.setString(1, text);
        return stm.executeUpdate() > 0;
    }
    
}
