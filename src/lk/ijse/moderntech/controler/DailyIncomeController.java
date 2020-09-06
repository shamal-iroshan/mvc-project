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

/**
 *
 * @author Shamal
 */
public class DailyIncomeController {

    Connection connection;

    public DailyIncomeController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<String> getOrderDetail(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("Select COUNT(DISTINCT orders.Order_ID),SUM(order_detail.Total)"
                + " From orders Inner Join order_detail On order_detail.Order_ID = orders.Order_ID WHERE orders.Date LIKE ?");
        stm.setString(1, "%" + text + "%");
        ResultSet rst = stm.executeQuery();

        List<String> temp = new ArrayList();

        if (rst.next()) {
            temp.add(rst.getString(1));
            temp.add(rst.getString(2));
            return temp;
        }
        return null;
    }

    public List<String> getRepairDetail(String text) throws SQLException {
        List<String> temp = new ArrayList();
        PreparedStatement stm = connection.prepareStatement("SELECT COUNT(DISTINCT Repair_ID),SUM(Total) FROM repair_detail WHERE Date_time LIKE ?");
        stm.setString(1, "%" + text + "%");
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            temp.add(rst.getString(1));
            temp.add(rst.getString(2));
            return temp;
        }
        return null;
    }

}
