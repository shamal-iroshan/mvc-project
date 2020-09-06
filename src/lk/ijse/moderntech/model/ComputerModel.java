/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.model;

/**
 *
 * @author Shamal
 */
public class ComputerModel {
    private String computerID;
    private String warrantyID;
    private String type;
    private String brand;
    private String description;

    public ComputerModel() {
    }

    public ComputerModel(String computerID, String warrantyID, String type, String brand, String description) {
        this.computerID = computerID;
        this.warrantyID = warrantyID;
        this.type = type;
        this.brand = brand;
        this.description = description;
    }

    /**
     * @return the computerID
     */
    public String getComputerID() {
        return computerID;
    }

    /**
     * @param computerID the computerID to set
     */
    public void setComputerID(String computerID) {
        this.computerID = computerID;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ComputerModel{" + "computerID=" + computerID + ", warrantyID=" + warrantyID + ", type=" + type + ", brand=" + brand + ", description=" + description + '}';
    }
    
}
