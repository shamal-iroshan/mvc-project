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
import lk.ijse.moderntech.model.StockModel;

/**
 *
 * @author Shamal
 */
public class DeleteStockController {

    Connection connection;

    public DeleteStockController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<StockModel> getAllItems() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM stock").executeQuery();
        List<StockModel> list = new ArrayList();
        while (rst.next()) {
            list.add(new StockModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7)
            ));
        }
        return list;
    }

    public StockModel getStock(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM stock WHERE Stock_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new StockModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7)
            );
        }
        return null;
    }

    public boolean deleteStock(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM stock WHERE Stock_ID=?");
        stm.setString(1, text);
        return stm.executeUpdate() > 0;
    }

}
