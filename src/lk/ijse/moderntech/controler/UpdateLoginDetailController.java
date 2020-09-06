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
import java.sql.SQLException;
import lk.ijse.moderntech.db.DBConnection;
import lk.ijse.moderntech.model.UserModel;

/**
 *
 * @author Shamal
 */
public class UpdateLoginDetailController {

    Connection connection;

    public UpdateLoginDetailController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public boolean updateUser(UserModel user, String text) throws SQLException, NoSuchAlgorithmException {
        String password = SHA(user.getPassword(), "SHA-512");
        PreparedStatement stm = connection.prepareStatement("UPDATE user SET User_name=?,Password=? WHERE Emp_ID=?");
        stm.setString(1, user.getUserName());
        stm.setString(2, password);
        stm.setString(3, text);
        return stm.executeUpdate() > 0;
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
