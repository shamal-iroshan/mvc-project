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
import lk.ijse.moderntech.model.LoginDetailModel;

/**
 *
 * @author Shamal
 */
public class LoginReportController {
    Connection connection;

    public LoginReportController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<String> getEmployee() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Emp_ID FROM employee").executeQuery();
        List<String> tempList = new ArrayList();
        
        while(rst.next()){
            tempList.add(rst.getString(1));
        }
        return tempList;
    }

    public List<LoginDetailModel> getLog(String id) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM login_detail WHERE Emp_ID = ?");
        stm.setString(1, id);
        ResultSet rst = stm.executeQuery();
        List<LoginDetailModel> tempList = new ArrayList();
        while(rst.next()){
            tempList.add(new LoginDetailModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            ));
        }
        return tempList;
    }
    
}
