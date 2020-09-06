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
public class SupplierModel {
    private String supplierID;
    private String name;
    private String contactNo;
    private String detail;

    public SupplierModel() {
    }

    public SupplierModel(String supplierID, String name, String contactNo, String detail) {
        this.supplierID = supplierID;
        this.name = name;
        this.contactNo = contactNo;
        this.detail = detail;
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
     * @return the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "SupplierModel{" + "supplierID=" + supplierID + ", name=" + name + ", contactNo=" + contactNo + ", detail=" + detail + '}';
    }
    
}
