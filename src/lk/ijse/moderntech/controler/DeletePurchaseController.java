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
import lk.ijse.moderntech.model.PurchaseModel;

/**
 *
 * @author Shamal
 */
public class DeletePurchaseController {
    Connection connection;

    public DeletePurchaseController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<PurchaseModel> loadPurchase() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM purchase").executeQuery();
        List<PurchaseModel> tempList = new ArrayList();
        while(rst.next()){
            tempList.add(new PurchaseModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            ));
        }
        return tempList;
    }

    public boolean deletePurchase(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("DELETE FROM purchase WHERE purchase_ID=?");
        stm.setString(1, text);
        return stm.executeUpdate() > 0;
    }

    public PurchaseModel getPurchase(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM purchase WHERE Purchase_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return new PurchaseModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5)
            );
        }
        return null;
    }
    
}
