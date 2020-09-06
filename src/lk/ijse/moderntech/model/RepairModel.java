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
public class RepairModel {
    private String repairID;
    private String employeeID;
    private String customerID;
    private String repairStatus;
    private String repairDescription;
    private String Price;

    public RepairModel() {
    }

    public RepairModel(String repairID, String employeeID, String customerID, String repairStatus, String repairDescription, String Price) {
        this.repairID = repairID;
        this.employeeID = employeeID;
        this.customerID = customerID;
        this.repairStatus = repairStatus;
        this.repairDescription = repairDescription;
        this.Price = Price;
    }

    /**
     * @return the repairID
     */
    public String getRepairID() {
        return repairID;
    }

    /**
     * @param repairID the repairID to set
     */
    public void setRepairID(String repairID) {
        this.repairID = repairID;
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
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the repairStatus
     */
    public String getRepairStatus() {
        return repairStatus;
    }

    /**
     * @param repairStatus the repairStatus to set
     */
    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    /**
     * @return the repairDescription
     */
    public String getRepairDescription() {
        return repairDescription;
    }

    /**
     * @param repairDescription the repairDescription to set
     */
    public void setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
    }

    /**
     * @return the Price
     */
    public String getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "RepairModel{" + "repairID=" + repairID + ", employeeID=" + employeeID + ", customerID=" + customerID + ", repairStatus=" + repairStatus + ", repairDescription=" + repairDescription + ", Price=" + Price + '}';
    }
    
}
