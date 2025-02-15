package org.example;

import java.sql.Date;

public class CarRental {

    // define the properties
    private int customerId = 0;
    private int carId = 0;
    private int noOfDays =0;
    private Date ReturnDate = null;
    private Date RentalDate = null;

    // define the constructor

    public CarRental() {
    }

    public CarRental(int customerId, int carId, int noOfDays, Date ReturnDate, Date RentalDate) {
        this.customerId = customerId;
        this.carId = carId;
        this.noOfDays = noOfDays;
        this.RentalDate = RentalDate;
    }

    // define the getter and setter() methord

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCarId() {
        return this.carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getNoOfDays() {
        return this.noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public Date getReturnDate() {
        return this.ReturnDate;
    }

    public void setReturnDate(Date ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public Date getRentalDate() {
        return this.RentalDate;
    }

    public void setRentalDate(Date RentalDate) {
        this.RentalDate = RentalDate;
    }


    // define the toString() methord

    @Override
    public String toString() {
        return "{" +
            " customerId='" + getCustomerId() + "'" +
            ", carId='" + getCarId() + "'" +
            ", noOfDays='" + getNoOfDays() + "'" +
            ", ReturnDate='" + getReturnDate() + "'" +
            ", RentalDate='" + getRentalDate() + "'" +
            "}";
    }



}
