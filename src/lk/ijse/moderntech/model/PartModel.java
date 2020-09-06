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
public class PartModel {
    private String partID;
    private String warrantyID;
    private String partName;
    private String value;
    private String brand;
    private String Description;

    public PartModel() {
    }

    public PartModel(String partID, String warrantyID, String partName, String value, String brand, String Description) {
        this.partID = partID;
        this.warrantyID = warrantyID;
        this.partName = partName;
        this.value = value;
        this.brand = brand;
        this.Description = Description;
    }

    /**
     * @return the partID
     */
    public String getPartID() {
        return partID;
    }

    /**
     * @param partID the partID to set
     */
    public void setPartID(String partID) {
        this.partID = partID;
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
     * @return the partName
     */
    public String getPartName() {
        return partName;
    }

    /**
     * @param partName the partName to set
     */
    public void setPartName(String partName) {
        this.partName = partName;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
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
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "PartModel{" + "partID=" + partID + ", warrantyID=" + warrantyID + ", partName=" + partName + ", value=" + value + ", brand=" + brand + ", Description=" + Description + '}';
    }
    
}
