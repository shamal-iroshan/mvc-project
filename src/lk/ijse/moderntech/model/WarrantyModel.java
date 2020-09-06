/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.model;

import java.sql.Connection;
import java.sql.SQLException;
import lk.ijse.moderntech.db.DBConnection;

/**
 *
 * @author Shamal
 */
public class WarrantyModel {
    private String warrantyID;
    private String duration;

    public WarrantyModel() {
    }

    public WarrantyModel(String warrantyID, String duration) {
        this.warrantyID = warrantyID;
        this.duration = duration;
    }

    /**
     * @return the warrantyID
     */
    public String getWarrantyID() {
        return warrantyID;
    }

    /**
     * @param warrantyID the warrantyID to set
     */
    public void setWarrantyID(String warrantyID) {
        this.warrantyID = warrantyID;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "WarrantyModel{" + "warrantyID=" + warrantyID + ", duration=" + duration + '}';
    }
    
}
