package org.example;

public class CarRental {

    // define the properties
    private CustomerDetails customer =null;
    private CarDetails car =null;
    private int noOfDays =0;

    // define the constructor

    public CarRental() {
    }

    public CarRental(CustomerDetails customer, CarDetails car, int noOfDays) {
        this.customer = customer;
        this.car = car;
        this.noOfDays = noOfDays;
    }


    // define the getter() and setter() methord

    public CustomerDetails getCustomer() {
        return this.customer;
    }

    public void setCustomer(CustomerDetails customer) {
        this.customer = customer;
    }

    public CarDetails getCar() {
        return this.car;
    }

    public void setCar(CarDetails car) {
        this.car = car;
    }

    public int getNoOfDays() {
        return this.noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }


    // define the toString() methord

    @Override
    public String toString() {
        return "{" +
            " customer='" + getCustomer() + "'" +
            ", car='" + getCar() + "'" +
            ", noOfDays='" + getNoOfDays() + "'" +
            "}";
    }


    
}
