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
import lk.ijse.moderntech.model.StockModel;
import lk.ijse.moderntech.model.SupplierModel;

/**
 *
 * @author Shamal
 */
public class DashBoardController {

    Connection connection;

    public DashBoardController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public String getDailyIncome() throws SQLException {
        List<String> orderID = getOrderID();
        List<String> total = new ArrayList();
        for (String string : orderID) {
            PreparedStatement stm = connection.prepareStatement("SELECT Total FROM order_detail WHERE Order_ID=?");
            stm.setString(1, string);
            ResultSet rst = stm.executeQuery();
            while (rst.next()) {
                total.add(rst.getString(1));
            }
        }
        return getTotal(total);
    }

    private List<String> getOrderID() throws SQLException {
        String date = getDate();
        PreparedStatement stm = connection.prepareStatement("SELECT Order_ID FROM orders WHERE Date LIKE ?");
        stm.setString(1, "%" + date + "%");
        List<String> orderID = new ArrayList();
        ResultSet rst = stm.executeQuery();
        while (rst.next()) {
            orderID.add(rst.getString(1));
        }
        return orderID;
    }

    private String getDate() {
        Date D1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
        return format1.format(D1);
    }

    private String getTotal(List<String> total) {
        double val = 0;
        for (String string : total) {
            val += Double.valueOf(string);
        }
        return String.valueOf(val);
    }

    public String getrepairCount() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT COUNT(Repair_ID) FROM repair WHERE NOT Repair_status='Paid' OR Repair_status='Repaired'").executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        } else {
            return "0";
        }
    }

    public List<StockModel> getLowStock() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM stock WHERE QTY_onhand<='5'").executeQuery();
        List<StockModel> tempList = new ArrayList();
        if (rst.next()) {
            tempList.add(new StockModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7)
            ));
        }
        return tempList;
    }

    public String getPartDetail(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Part_name,Value FROM part WHERE Part_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        String detail = null;
        if (rst.next()) {
            detail = rst.getString(1);
            detail += "," + rst.getString(2);
        }
        return detail;
    }

    public String getComputerDetail(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Type,Brand FROM computer WHERE Computer_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        String detail = null;
        if (rst.next()) {
            detail = rst.getString(1);
            detail += "," + rst.getString(2);
        }
        return detail;
    }

    public SupplierModel getSupplierDetail(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("Select supplier.Name,supplier.Contact_no From ss Inner Join supplier On ss.Supplier_ID = supplier.Supplier_ID WHERE ss.Stock_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        SupplierModel sup = new SupplierModel();
        if (rst.next()) {
            sup.setName(rst.getString(1));
            sup.setContactNo(rst.getString(2));
        }
        return sup;
    }
}
