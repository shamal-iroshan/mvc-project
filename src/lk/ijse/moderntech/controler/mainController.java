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
import java.text.SimpleDateFormat;
import java.util.Date;
import lk.ijse.moderntech.db.DBConnection;

/**
 *
 * @author Shamal
 */
public class mainController {

    Connection connection;

    public mainController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    private String getLoginID() throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Login_ID FROM login_detail ORDER BY Login_ID DESC LIMIT 1");
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        } else {
            return null;
        }
    }

    private String getDateTime() {
        Date D1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
        String datetime = format1.format(D1);
        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");
        datetime = datetime + " " + format2.format(D1);
        return datetime;
    }

    public boolean setLogoutTime(String empID) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("UPDATE login_detail SET Logout_datetime=? WHERE Login_ID=?");
        stm.setString(1, getDateTime());
        stm.setString(2, getLoginID());
        int rst = stm.executeUpdate();

        return rst > 0;
    }
}
