/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.moderntech.model;

import java.util.List;

/**
 *
 * @author Shamal
 */
public class OrderModel {
    private String orderID;
    private String CustomerID;
    private List<OrderDetailModel> list;

    public OrderModel(String orderID, String CustomerID, List<OrderDetailModel> list) {
        this.orderID = orderID;
        this.CustomerID = CustomerID;
        this.list = list;
    }

    public OrderModel() {
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

    /**
     * @return the CustomerID
     */
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * @param CustomerID the CustomerID to set
     */
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * @return the list
     */
    public List<OrderDetailModel> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<OrderDetailModel> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "OrderModel{" + "orderID=" + orderID + ", CustomerID=" + CustomerID + ", list=" + list + '}';
    }
    
}
