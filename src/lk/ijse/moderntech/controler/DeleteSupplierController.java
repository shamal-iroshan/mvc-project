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
import lk.ijse.moderntech.model.SupplierModel;

/**
 *
 * @author Shamal
 */
public class DeleteSupplierController {

    Connection connection;

    public DeleteSupplierController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<SupplierModel> getAllSuppliers() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM supplier").executeQuery();
        List<SupplierModel> tempList = new ArrayList();
        while (rst.next()) {
            tempList.add(new SupplierModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            ));
        }
        return tempList;
    }

    public boolean deleteSupplier(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM supplier WHERE Supplier_ID=?");
        stm.setString(1, text);
        return stm.executeUpdate() > 0;
    }
}
