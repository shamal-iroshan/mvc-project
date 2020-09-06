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
public class UpdateRepairController {

    Connection connection;

    public UpdateRepairController() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public List<RepairModel> getAllRepair() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM repair WHERE NOT Repair_status='Paid'").executeQuery();
        List<RepairModel> tempList = new ArrayList();
        while (rst.next()) {
            tempList.add(new RepairModel(
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

    public boolean updateRepair(RepairModel model) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("UPDATE repair SET Repair_status=?,Repair_description=?,Price=? WHERE Repair_ID=?");
        stm.setString(1, model.getRepairStatus());
        stm.setString(2, model.getRepairDescription());
        stm.setString(3, model.getPrice());
        stm.setString(4, model.getRepairID());
        return stm.executeUpdate() > 0;
    }

    public RepairModel getRepair(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM repair WHERE Repair_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();

        if (rst.next()) {
            RepairModel model = new RepairModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            );
            return model;
        }
        return null;
    }

}
