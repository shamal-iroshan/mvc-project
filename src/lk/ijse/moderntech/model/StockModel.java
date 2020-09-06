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
public class StockModel {
    private String StockID;
    private String PartID;
    private String ComputerID;
    private String QTYonhand;
    private String buyingPrice;
    private String profitPrecentage;
    private String SellingPricel;

    public StockModel() {
    }

    public StockModel(String StockID, String PartID, String ComputerID, String QTYonhand, String buyingPrice, String profitPrecentage, String SellingPricel) {
        this.StockID = StockID;
        this.PartID = PartID;
        this.ComputerID = ComputerID;
        this.QTYonhand = QTYonhand;
        this.buyingPrice = buyingPrice;
        this.profitPrecentage = profitPrecentage;
        this.SellingPricel = SellingPricel;
    }

    /**
     * @return the StockID
     */
    public String getStockID() {
        return StockID;
    }

    /**
     * @param StockID the StockID to set
     */
    public void setStockID(String StockID) {
        this.StockID = StockID;
    }

    /**
     * @return the PartID
     */
    public String getPartID() {
        return PartID;
    }

    /**
     * @param PartID the PartID to set
     */
    public void setPartID(String PartID) {
        this.PartID = PartID;
    }

    /**
     * @return the ComputerID
     */
    public String getComputerID() {
        return ComputerID;
    }

    /**
     * @param ComputerID the ComputerID to set
     */
    public void setComputerID(String ComputerID) {
        this.ComputerID = ComputerID;
    }

    /**
     * @return the QTYonhand
     */
    public String getQTYonhand() {
        return QTYonhand;
    }

    /**
     * @param QTYonhand the QTYonhand to set
     */
    public void setQTYonhand(String QTYonhand) {
        this.QTYonhand = QTYonhand;
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

    /**
     * @return the profitPrecentage
     */
    public String getProfitPrecentage() {
        return profitPrecentage;
    }

    /**
     * @param profitPrecentage the profitPrecentage to set
     */
    public void setProfitPrecentage(String profitPrecentage) {
        this.profitPrecentage = profitPrecentage;
    }

    /**
     * @return the SellingPricel
     */
    public String getSellingPricel() {
        return SellingPricel;
    }

    /**
     * @param SellingPricel the SellingPricel to set
     */
    public void setSellingPricel(String SellingPricel) {
        this.SellingPricel = SellingPricel;
    }

    @Override
    public String toString() {
        return "StockModel{" + "StockID=" + StockID + ", PartID=" + PartID + ", ComputerID=" + ComputerID + ", QTYonhand=" + QTYonhand + ", buyingPrice=" + buyingPrice + ", profitPrecentage=" + profitPrecentage + ", SellingPricel=" + SellingPricel + '}';
    }

    
}
