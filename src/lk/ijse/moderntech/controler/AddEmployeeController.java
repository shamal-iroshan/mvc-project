/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.controler;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.moderntech.db.DBConnection;
import lk.ijse.moderntech.model.EmployeeModel;
import lk.ijse.moderntech.model.UserModel;

/**
 *
 * @author Shamal
 */
public class AddEmployeeController {

    Connection connection;

    public AddEmployeeController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public String getEmployeeID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Emp_ID from employee ORDER BY Emp_ID DESC LIMIT 1").executeQuery();
        if (rst.next()) {
            String tempid = rst.getString(1);
            String[] split = tempid.split("E");
            int id = Integer.valueOf(split[1]);
            id++;
            if (id < 10) {
                return "E000" + id;
            } else if (id < 100) {
                return "E00" + id;
            } else if (id < 1000) {
                return "E0" + id;
            } else {
                return "E" + id;
            }
        } else {
            return "E0001";
        }
    }

    public boolean saveEmployee(EmployeeModel employee, UserModel user) throws SQLException, NoSuchAlgorithmException {
        try {
            connection.setAutoCommit(false);
            PreparedStatement stm = connection.prepareStatement("INSERT INTO employee VALUES(?,?,?,?,?,?)");
            stm.setString(1, employee.getEmployeeID());
            stm.setString(2, employee.getName());
            stm.setString(3, employee.getContactNo());
            stm.setString(4, employee.getEmail());
            stm.setString(5, employee.getAddress());
            stm.setString(6, employee.getRole());
            boolean saved1 = stm.executeUpdate() > 0;

            if (saved1) {
                String password = SHA(user.getPassword(), "SHA-1");
                PreparedStatement stm2 = connection.prepareStatement("INSERT INTO user VALUES(?,?,?)");
                stm2.setString(1, employee.getEmployeeID());
                stm2.setString(2, user.getUserName());
                stm2.setString(3, password);
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
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public String SHA(String passwordToHash, String type) throws NoSuchAlgorithmException {
        String generatedPassword = null;

        MessageDigest md = MessageDigest.getInstance(type);
        byte[] bytes = md.digest(passwordToHash.getBytes());
        BigInteger no = new BigInteger(1, bytes);
        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }
        generatedPassword = hashtext;
        return generatedPassword;
    }
}
