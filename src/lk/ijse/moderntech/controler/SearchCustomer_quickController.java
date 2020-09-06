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
import lk.ijse.moderntech.model.CustomerModel;

/**
 *
 * @author Shamal
 */
public class SearchCustomer_quickController {

    Connection connection;

    public SearchCustomer_quickController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<CustomerModel> getAllCustomer() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM customer").executeQuery();
        List<CustomerModel> tempLIst = new ArrayList();

        while (rst.next()) {
            tempLIst.add(new CustomerModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            ));
        }
        return tempLIst;
    }

    public List<CustomerModel> getCustomer(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM customer WHERE Name LIKE ?");
        stm.setString(1, "%"+text+"%");
        ResultSet rst = stm.executeQuery();
        List<CustomerModel> tempLIst = new ArrayList();

        while (rst.next()) {
            tempLIst.add(new CustomerModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            ));
        }
        return tempLIst;
    }
}
