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
public class OrderDetailModel {
    private String orderID;
    private String partID;
    private String computerID;
    private int qty;
    private double unitPrice;
    private double discount;
    private double Total;

    public OrderDetailModel() {
    }

    public OrderDetailModel(String orderID, String partID, String computerID, int qty, double unitPrice, double discount, double Total) {
        this.orderID = orderID;
        this.partID = partID;
        this.computerID = computerID;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.Total = Total;
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
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "OrderDetailModel{" + "orderID=" + orderID + ", partID=" + partID + ", computerID=" + computerID + ", qty=" + qty + ", unitPrice=" + unitPrice + ", discount=" + discount + ", Total=" + Total + '}';
    }

    
}
