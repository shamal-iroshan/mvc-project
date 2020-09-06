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
public class CustomerModel {

    private String customerID;
    private String name;
    private String contactNo;
    private String Address;

    public CustomerModel() {
    }

    public CustomerModel(String customerID, String name, String contactNo, String Address) {
        this.customerID = customerID;
        this.name = name;
        this.contactNo = contactNo;
        this.Address = Address;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "CustomerModel{" + "customerID=" + customerID + ", name=" + name + ", contactNo=" + contactNo + ", Address=" + Address + '}';
    }
    
}
