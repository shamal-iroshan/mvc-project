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
public class OrderDetailController {

    Connection connection;

    public OrderDetailController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();

    }

    boolean saveOrderDetail(List<OrderDetailModel> list) throws SQLException {
        for (OrderDetailModel orderDetailModel : list) {
            boolean isAdded = AddItem(orderDetailModel);
            if (!isAdded) {
                return false;
            }
        }
        return true;
    }

    private boolean AddItem(OrderDetailModel orderDetailModel) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO order_detail(Order_ID,Part_ID,Computer_ID,QTY,Unitprice,Discount,Total)"
                + " VALUES(?,?,?,?,?,?,?)");
        stm.setString(1, orderDetailModel.getOrderID());
        stm.setString(2, orderDetailModel.getPartID());
        stm.setString(3, orderDetailModel.getComputerID());
        stm.setInt(4, orderDetailModel.getQty());
        stm.setDouble(5, orderDetailModel.getUnitPrice());
        stm.setDouble(6, orderDetailModel.getDiscount());
        stm.setDouble(7, orderDetailModel.getTotal());
        return stm.executeUpdate() > 0;
    }

}
