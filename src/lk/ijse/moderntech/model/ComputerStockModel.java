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
public class ComputerStockModel {
    private String Brand;
    private String description;
    private String qtyOnHand;
    private String sellingPrice;
    private String buyingPrice;

    public ComputerStockModel() {
    }

    public ComputerStockModel(String Brand, String description, String qtyOnHand, String sellingPrice, String buyingPrice) {
        this.Brand = Brand;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    /**
     * @return the Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
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

    /**
     * @return the qtyOnHand
     */
    public String getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * @param qtyOnHand the qtyOnHand to set
     */
    public void setQtyOnHand(String qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    /**
     * @return the sellingPrice
     */
    public String getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * @return the buyingPrice
     */
    public String getBuyingPrice() {
        return buyingPrice;
    }

    /**
     * @param buyingPrice the buyingPrice to set
     */
    public void setBuyingPrice(String buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    @Override
    public String toString() {
        return "ComputerStockModel{" + "Brand=" + Brand + ", description=" + description + ", qtyOnHand=" + qtyOnHand + ", sellingPrice=" + sellingPrice + ", buyingPrice=" + buyingPrice + '}';
    }
    
    
}
