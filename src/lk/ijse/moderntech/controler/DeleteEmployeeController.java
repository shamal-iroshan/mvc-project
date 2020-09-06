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
import lk.ijse.moderntech.model.EmployeeModel;

/**
 *
 * @author Shamal
 */
public class DeleteEmployeeController {
    
    Connection connection;

    public DeleteEmployeeController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<EmployeeModel> getEmployees() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM employee").executeQuery();
        List<EmployeeModel> tempList = new ArrayList();
        
        while(rst.next()){
            tempList.add(new EmployeeModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            ));
        }
        return tempList;
    }

    public EmployeeModel getEmployee(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM employee WHERE Emp_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        EmployeeModel emp = new EmployeeModel();
        if(rst.next()){
            emp.setEmployeeID(rst.getString(1));
            emp.setName(rst.getString(2));
            emp.setContactNo(rst.getString(3));
            emp.setEmail(rst.getString(4));
            emp.setAddress(rst.getString(5));
            emp.setRole(rst.getString(6));
        }
        return emp;
    }

    public boolean deleteEmployee(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM employee WHERE Emp_ID=?");
        stm.setString(1, text);
        return stm.executeUpdate() > 0;
    }
}
