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
import java.text.SimpleDateFormat;
import java.util.Date;
import lk.ijse.moderntech.db.DBConnection;
import lk.ijse.moderntech.model.UserModel;

/**
 *
 * @author Shamal
 */
public class LoginController {

    Connection connection;

    public LoginController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public boolean checkLogin(UserModel user) throws NoSuchAlgorithmException, SQLException {
        String password = SHA(user.getPassword(), "SHA-512");
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM user WHERE User_name=? AND Password=?");
        stm.setString(1, user.getUserName());
        stm.setString(2, password);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            PreparedStatement stm2 = connection.prepareStatement("INSERT INTO login_detail(Login_ID,EMP_ID,Login_datetime) values(?,?,?)");
            stm2.setString(1, getLoginID());
            stm2.setString(2, rst.getString(1));
            stm2.setString(3, getDateTime());

            boolean saved = stm2.executeUpdate() > 0;
            if (saved) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
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

    private String getDateTime() {
        Date D1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
        String datetime = format1.format(D1);
        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");
        datetime = datetime + " " + format2.format(D1);
        return datetime;
    }

    private String getLoginID() throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Login_ID FROM login_detail ORDER BY Login_ID DESC LIMIT 1");
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            String lid = rst.getString(1);
            String[] split = lid.split("L");
            int id = Integer.parseInt(split[1]);
            id++;
            if (id < 10) {
                return "L000" + id;
            } else if (id < 100) {
                return "L00" + id;
            } else if (id < 1000) {
                return "L0" + id;
            } else {
                return "L" + id;
            }
        } else {
            return "L0001";
        }
    }

    public String getEmpID(UserModel log) throws NoSuchAlgorithmException, SQLException {
        String password = SHA(log.getPassword(), "SHA-1");
        PreparedStatement stm = connection.prepareStatement("SELECT Emp_ID FROM user WHERE User_name=? AND Password=?");
        stm.setString(1, log.getUserName());
        stm.setString(2, password);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return rst.getString(1);
        }else{
            return null;
        }
    }
}
