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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lk.ijse.moderntech.db.DBConnection;
import lk.ijse.moderntech.model.ComputerStockModel;
import lk.ijse.moderntech.model.OrderModel;
import lk.ijse.moderntech.model.PartStockModel;

/**
 *
 * @author Shamal
 */
public class PurchaseBillController {

    Connection connection;

    public PurchaseBillController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public String getOrderID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Order_ID from orders ORDER BY Order_ID DESC LIMIT 1").executeQuery();
        if (rst.next()) {
            String tempId = rst.getString(1);
            String[] split = tempId.split("B");
            int id = Integer.valueOf(split[1]);
            id++;
            if (id < 10) {
                return "B000" + id;
            } else if (id < 100) {
                return "B00" + id;
            } else if (id < 1000) {
                return "B0" + id;
            } else {
                return "B" + id;
            }
        }
        return "B0001";
    }

    public List<String> getCustomerID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Customer_ID FROM customer").executeQuery();
        List<String> tempList = new ArrayList();

        while (rst.next()) {
            tempList.add(rst.getString(1));
        }
        return tempList;
    }

    public String getCustomerName(String id) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Name FROM customer WHERE Customer_ID=?");
        stm.setString(1, id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

    public PartStockModel getPartDetails(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("Select part.Part_name,stock.QTY_onhand,stock.Selling_price,stock.BuyingPrice\n"
                + "From part Inner Join stock On stock.Part_ID = part.Part_ID WHERE part.Part_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new PartStockModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            );
        }
        return null;
    }

    public ComputerStockModel getComputerDetail(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("Select computer.Brand,computer.Description,stock.QTY_onhand,stock.Selling_price,stock.BuyingPrice\n"
                + "From stock Inner Join computer On stock.Computer_ID = computer.Computer_ID WHERE computer.Computer_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new ComputerStockModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            );
        }
        return null;
    }

    public boolean saveOrder(OrderModel order) throws SQLException, ClassNotFoundException {
        try {
            connection.setAutoCommit(false);
            PreparedStatement stm = connection.prepareStatement("INSERT INTO orders VALUES(?,?,?)");
            stm.setString(1, order.getOrderID());
            stm.setString(2,getDateTime());
            stm.setString(3, order.getCustomerID());
            boolean saved1 = stm.executeUpdate() > 0;
            if(saved1){
                boolean isAdded = new OrderDetailController().saveOrderDetail(order.getList());
                if(isAdded){
                    boolean updateStock = new StockController().updateStock(order.getList());
                    if(updateStock){
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
            }else{
                connection.rollback();
                return false;
            }
        } finally {
            connection.setAutoCommit(true);
        }
    }

    private String getDateTime() {
        Date d1 = new Date();
        String datetime;
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
        datetime = format1.format(d1);

        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");
        datetime += " "+format2.format(d1);
        
        return datetime;
    }
}
