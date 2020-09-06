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
public class SpecModel {
    private String spec_ID;
    private String part;
    private String value;

    public SpecModel(String spec_ID, String part, String value) {
        this.spec_ID = spec_ID;
        this.part = part;
        this.value = value;
    }

    public SpecModel() {
    }

    /**
     * @return the spec_ID
     */
    public String getSpec_ID() {
        return spec_ID;
    }

    /**
     * @param spec_ID the spec_ID to set
     */
    public void setSpec_ID(String spec_ID) {
        this.spec_ID = spec_ID;
    }

    /**
     * @return the part
     */
    public String getPart() {
        return part;
    }

    /**
     * @param part the part to set
     */
    public void setPart(String part) {
        this.part = part;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SpecModel{" + "spec_ID=" + spec_ID + ", part=" + part + ", value=" + value + '}';
    }
    
}
