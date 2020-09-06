/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import lk.ijse.moderntech.db.DBConnection;
import lk.ijse.moderntech.model.OrderDetailModel;

/**
 *
 * @author Shamal
 */
public class StockController {

    Connection connection;

    public StockController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    boolean updateStock(List<OrderDetailModel> list) throws SQLException {
        for (OrderDetailModel orderDetailModel : list) {
            if (orderDetailModel.getPartID() != null) {
                PreparedStatement stm = connection.prepareStatement("UPDATE stock SET QTY_onhand=(QTY_onhand-?) WHERE Part_ID=?");
                stm.setInt(1, orderDetailModel.getQty());
                stm.setString(2, orderDetailModel.getPartID());
                if (!(stm.executeUpdate() > 0)) {
                    return false;
                }

            } else if (orderDetailModel.getComputerID() != null) {
                PreparedStatement stm = connection.prepareStatement("UPDATE stock SET QTY_onhand=(QTY_onhand-?) WHERE Computer_ID=?");
                stm.setInt(1, orderDetailModel.getQty());
                stm.setString(2, orderDetailModel.getComputerID());
                if (!(stm.executeUpdate() > 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean updateItem(OrderDetailModel orderDetailModel) throws SQLException {
        if (orderDetailModel.getPartID() != null) {
            PreparedStatement stm = connection.prepareStatement("SELECT QTY_onhand FROM stock WHERE Part_ID=?");
            stm.setString(1, orderDetailModel.getPartID());

        } else if (orderDetailModel.getComputerID() != null) {

        }
        return false;
    }

}
