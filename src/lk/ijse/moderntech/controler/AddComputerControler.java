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
import lk.ijse.moderntech.model.ComputerModel;
import lk.ijse.moderntech.model.SpecModel;

/**
 *
 * @author Shamal
 */
public class AddComputerControler {

    Connection connection;

    public AddComputerControler() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public String getComputerID() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM computer ORDER BY Computer_ID DESC LIMIT 1").executeQuery();
        if (rst.next()) {
            String tempID = rst.getString(1);
            String[] split = tempID.split("C");
            int id = Integer.valueOf(split[1]);
            id++;
            if (id < 10) {
                return "C000" + id;
            } else if (id < 100) {
                return "C00" + id;
            } else if (id < 1000) {
                return "C0" + id;
            } else {
                return "C" + id;
            }
        } else {
            return "C0001";
        }
    }

    public List<String> getWarranty() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT Duration FROM warranty").executeQuery();
        List<String> tempList = new ArrayList();
        while (rst.next()) {
            tempList.add(rst.getString(1));
        }
        return tempList;
    }

    public List<SpecModel> getSpecs() throws SQLException {
        ResultSet rst = connection.prepareStatement("SELECT * FROM spec").executeQuery();
        List<SpecModel> tempList = new ArrayList();
        while (rst.next()) {
            tempList.add(new SpecModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
            ));
        }
        return tempList;
    }

    public String getSpecID(String part, String value) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Spec_ID FROM spec WHERE Part=? AND Value=?");
        stm.setString(1, part);
        stm.setString(2, part);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

    public boolean saveComputer(ComputerModel computer, List<String> list) throws SQLException {
        try {
            connection.setAutoCommit(false);
            String warrantyID = getWarrantyID(computer.getWarrantyID());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO computer VALUES(?,?,?,?,?)");
            stm.setString(1, computer.getComputerID());
            stm.setString(2, warrantyID);
            stm.setString(3, computer.getType());
            stm.setString(4, computer.getBrand());
            stm.setString(5, computer.getDescription());
            boolean saved = stm.executeUpdate() > 0;
            if (saved) {
                boolean saved2 = false;
                for (String string : list) {
                    PreparedStatement stm2 = connection.prepareStatement("INSERT INTO computer_spec VALUES(?,?)");
                    stm2.setString(1, computer.getComputerID());
                    stm2.setString(2, string);
                    saved2 = stm2.executeUpdate() > 0;
                    if (!saved2) {
                        break;
                    }
                }
                if (saved2) {
                    connection.commit();
                    return true;
                } else {
                    connection.rollback();
                    return false;
                }
            } else {
                connection.rollback();
                return false;
            }
        } finally {
            connection.setAutoCommit(true);
        }
    }

    private String getWarrantyID(String warrantyID) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("SELECT Warranty_ID FROM warranty WHERE Duration=?");
        stm.setString(1, warrantyID);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }

}
