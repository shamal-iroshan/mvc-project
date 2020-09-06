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
public class RepairDetailModel {
    private String repairID;
    private String dateTime;
    private String price;
    private String discount;
    private String total;

    public RepairDetailModel() {
    }

    public RepairDetailModel(String repairID, String dateTime, String price, String discount, String total) {
        this.repairID = repairID;
        this.dateTime = dateTime;
        this.price = price;
        this.discount = discount;
        this.total = total;
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
     * @return the dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the discount
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "RepairDetailModel{" + "repairID=" + repairID + ", dateTime=" + dateTime + ", price=" + price + ", discount=" + discount + ", total=" + total + '}';
    }
    
}
