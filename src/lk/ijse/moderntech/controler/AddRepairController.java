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
import lk.ijse.moderntech.model.RepairModel;

/**
 *
 * @author Shamal
 */
public class AddRepairController {
    Connection connection;

    public AddRepairController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public String getRepairID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Repair_ID FROM repair ORDER BY Repair_ID DESC LIMIT 1").executeQuery();
        if(rst.next()){
            String tempID = rst.getString(1);
            String[] split = tempID.split("R");
            int id = Integer.valueOf(split[1]);
            id++;
            if(id<10){return "R000"+id;}
            else if(id<100){return "R00"+id;}
            else if(id<1000){return "R0"+id;}
            else{return "R"+id;}
        }else{
            return "R0001";
        }
    }

    public List<String> loadAllCustomers() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Customer_ID FROM customer").executeQuery();
        List<String> tempList = new ArrayList();
        if(rst.next()){
            tempList.add(rst.getString(1));
        }
        return tempList;
    }

    public List<String> loadAllEmployee() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Emp_ID FROM employee WHERE role='Repairman'").executeQuery();
        List<String> tempList = new ArrayList();
        if(rst.next()){
            tempList.add(rst.getString(1));
        }
        return tempList;
    }

    public String getCustomer(String cusID) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Name FROM customer WHERE Customer_ID=?");
        stm.setString(1, cusID);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }

    public String getEmployee(String toString) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Name FROM employee WHERE Emp_ID=?");
        stm.setString(1, toString);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }

    public boolean saveRepair(RepairModel repair) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO repair VALUES(?,?,?,?,?,?)");
        stm.setString(1, repair.getRepairID());
        stm.setString(2, repair.getEmployeeID());
        stm.setString(3, repair.getCustomerID());
        stm.setString(4, repair.getRepairStatus());
        stm.setString(5, repair.getRepairDescription());
        stm.setString(6, repair.getPrice());
        return stm.executeUpdate() > 0;
    }
    
}
