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
import lk.ijse.moderntech.model.CustomerModel;

/**
 *
 * @author Shamal
 */
public class AddCustomer_quickController {

    Connection connection;

    public AddCustomer_quickController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public String getCustomerID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Customer_ID FROM customer ORDER BY Customer_ID DESC LIMIT 1").executeQuery();
        if (rst.next()) {
            String tempID = rst.getString(1);
            String[] split = tempID.split("C");
            int id = Integer.valueOf(split[1]);
            id++;
            if (id < 10) {
                return "C000" + id;
            } else if (id < 100) {
                return "C00" + id;
            } else if (id < 1000) {
                return "C0" + id;
            } else {
                return "C" + id;
            }
        } else {
            return "C0001";
        }
    }

    public boolean saveCustomer(CustomerModel customer) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO customer VALUES(?,?,?,?)");
        stm.setString(1, customer.getCustomerID());
        stm.setString(2, customer.getName());
        stm.setString(3, customer.getContactNo());
        stm.setString(4, customer.getAddress());
        return stm.executeUpdate() > 0;
    }

}
