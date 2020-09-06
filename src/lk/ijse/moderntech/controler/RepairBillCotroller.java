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
import java.util.Date;
import lk.ijse.moderntech.db.DBConnection;
import lk.ijse.moderntech.model.RepairDetailModel;
import lk.ijse.moderntech.model.RepairModel;

/**
 *
 * @author Shamal
 */
public class RepairBillCotroller {

    Connection connection;

    public RepairBillCotroller() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public RepairModel getRepair(String text) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM repair WHERE Repair_ID=?");
        stm.setString(1, text);
        ResultSet rst = stm.executeQuery();
        RepairModel repair = new RepairModel();
        if (rst.next()) {
            repair.setRepairID(rst.getString(1));
            repair.setEmployeeID(rst.getString(2));
            repair.setCustomerID(rst.getString(3));
            repair.setRepairStatus(rst.getString(4));
            repair.setRepairDescription(rst.getString(5));
            repair.setPrice(rst.getString(6));
        }
        return repair;
    }

    public boolean updaterepair(RepairModel model) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("UPDATE repair SET Repair_status=?,Repair_description=?,Price=? WHERE Repair_ID=?");
        stm.setString(1, model.getRepairStatus());
        stm.setString(2, model.getRepairDescription());
        stm.setString(3, model.getPrice());
        stm.setString(4, model.getRepairID());
        return stm.executeUpdate() > 0;
    }

    public boolean addBill(RepairModel model, RepairDetailModel detail) throws SQLException {
        try {
            connection.setAutoCommit(false);
            PreparedStatement stm = connection.prepareStatement("UPDATE repair SET Repair_status=?,Repair_description=?,Price=? WHERE Repair_ID=?");
            stm.setString(1, model.getRepairStatus());
            stm.setString(2, model.getRepairDescription());
            stm.setString(3, model.getPrice());
            stm.setString(4, model.getRepairID());
            boolean updated = stm.executeUpdate() > 0;
            if(updated){
                PreparedStatement stm2 = connection.prepareStatement("INSERT INTO repair_detail VALUES(?,?,?,?,?)");
                stm2.setString(1, detail.getRepairID());
                stm2.setString(2, getDateTime());
                stm2.setString(3, detail.getPrice());
                stm2.setString(4, detail.getDiscount());
                stm2.setString(5, detail.getTotal());
                boolean saved  = stm2.executeUpdate() > 0;
                if(saved){
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
        } finally {
            connection.setAutoCommit(true);
        }
    }

    private String getDateTime() {
        Date D1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
        String datetime = format1.format(D1);
        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");
        datetime = datetime + " " + format2.format(D1);
        return datetime;
    }

}
