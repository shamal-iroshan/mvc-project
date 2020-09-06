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
public class LoginDetailModel {
    private String loginID;
    private String empID;
    private String login;
    private String logout;

    public LoginDetailModel() {
    }

    public LoginDetailModel(String loginID, String empID, String login, String logout) {
        this.loginID = loginID;
        this.empID = empID;
        this.login = login;
        this.logout = logout;
    }

    /**
     * @return the loginID
     */
    public String getLoginID() {
        return loginID;
    }

    /**
     * @param loginID the loginID to set
     */
    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    /**
     * @return the empID
     */
    public String getEmpID() {
        return empID;
    }

    /**
     * @param empID the empID to set
     */
    public void setEmpID(String empID) {
        this.empID = empID;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the logout
     */
    public String getLogout() {
        return logout;
    }

    /**
     * @param logout the logout to set
     */
    public void setLogout(String logout) {
        this.logout = logout;
    }

    @Override
    public String toString() {
        return "LoginDetailModel{" + "loginID=" + loginID + ", empID=" + empID + ", login=" + login + ", logout=" + logout + '}';
    }
    
}
