package org.example;

import java.util.ArrayList;


public class CustomerDetails {
    
    // define the properties
    private int customerID =0;
    private String customerName = null;
    private int customerMobileNumber =0;
    private String customerEmailNo = null;
    private String passward = null;
    private Boolean isRentedCar = false;



    // define the constructor

    public CustomerDetails() {
    }

    public CustomerDetails(int customerID, String customerName, int customerMobileNumber, String customerEmailNo,String passward) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerMobileNumber = customerMobileNumber;
        this.customerEmailNo = customerEmailNo;
        this.passward = passward;
    }


    // define the getter and setterMethord

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerMobileNumber() {
        return this.customerMobileNumber;
    }

    public void setCustomerMobileNumber(int customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public String getCustomerEmailNo() {
        return this.customerEmailNo;
    }

    public void setCustomerEmailNo(String customerEmailNo) {
        this.customerEmailNo = customerEmailNo;
    }

    public Boolean isIsRentedCar() {
        return this.isRentedCar;
    }

    public Boolean getIsRentedCar() {
        return this.isRentedCar;
    }

    public void setIsRentedCar(Boolean isRentedCar) {
        this.isRentedCar = isRentedCar;
    }

    

    public String getPassward() {
        return this.passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }


    // define the toString() methord

    @Override
    public String toString() {
        System.out.println("      CUSTOMER DETAILS");
        return "{" +
            " customerID='" + getCustomerID() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", customerMobileNumber='" + getCustomerMobileNumber() + "'" +
            ", customerEmailNo='" + getCustomerEmailNo() + "'" +
            ", isRentedCar='" + isIsRentedCar() + "'" +
            "}";
    }


}
