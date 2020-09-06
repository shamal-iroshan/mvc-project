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
public class PurchaseModel {
    private String purchaseID;
    private String employeeID;
    private String supplierID;
    private String amount;
    private String purchaseDate;

    public PurchaseModel() {
    }

    public PurchaseModel(String purchaseID, String employeeID, String supplierID, String amount, String purchaseDate) {
        this.purchaseID = purchaseID;
        this.employeeID = employeeID;
        this.supplierID = supplierID;
        this.amount = amount;
        this.purchaseDate = purchaseDate;
    }

    /**
     * @return the purchaseID
     */
    public String getPurchaseID() {
        return purchaseID;
    }

    /**
     * @param purchaseID the purchaseID to set
     */
    public void setPurchaseID(String purchaseID) {
        this.purchaseID = purchaseID;
    }

    /**
     * @return the employeeID
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the supplierID
     */
    public String getSupplierID() {
        return supplierID;
    }

    /**
     * @param supplierID the supplierID to set
     */
    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the purchaseDate
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * @param purchaseDate the purchaseDate to set
     */
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "PurchaseModel{" + "purchaseID=" + purchaseID + ", employeeID=" + employeeID + ", supplierID=" + supplierID + ", amount=" + amount + ", purchaseDate=" + purchaseDate + '}';
    }
    
    
}
