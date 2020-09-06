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
public class UpdateEmployeeController {

    Connection connection;

    public UpdateEmployeeController() throws ClassNotFoundException, SQLException {
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

    public boolean updateEmployee(EmployeeModel employee) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("UPDATE employee SET Name=?,Contact_no=?,Email=?,Address=?,role=? WHERE Emp_ID=?");
        stm.setString(1, employee.getName());
        stm.setString(2, employee.getContactNo());
        stm.setString(3, employee.getEmail());
        stm.setString(4, employee.getAddress());
        stm.setString(5, employee.getRole());
        stm.setString(6, employee.getEmployeeID());
        return stm.executeUpdate() > 0;
    }
}
