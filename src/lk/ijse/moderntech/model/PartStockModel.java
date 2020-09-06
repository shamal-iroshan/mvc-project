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
public class PartStockModel {
    private String name;
    private String qtyOnHand;
    private String sellingPrice;
    private String buyingPrice;

    public PartStockModel(String name, String qtyOnHand, String sellingPrice, String buyingPrice) {
        this.name = name;
        this.qtyOnHand = qtyOnHand;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public PartStockModel() {
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
        return "PartStockModel{" + "name=" + name + ", qtyOnHand=" + qtyOnHand + ", sellingPrice=" + sellingPrice + ", buyingPrice=" + buyingPrice + '}';
    }
    
}
