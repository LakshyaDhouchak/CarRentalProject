package org.example;

public class CarDetails {
    
    // define the properties
    private int carID =0;
    private String carName = null;
    private String carDescripution = null;
    private boolean isAvailable = false;
    private int carPricePerDay = 0;
    private String carColour = null;
    private String carNumberPlate = null;


    // define the constructor

    public CarDetails() {
    }

    public CarDetails(int carID, String carName, String carDescripution, int carPricePerDay, String carColour, String carNumberPlate) {
        this.carID = carID;
        this.carName = carName;
        this.carDescripution = carDescripution;
        this.carPricePerDay = carPricePerDay;
        this.carColour = carColour;
        this.carNumberPlate = carNumberPlate;
    }


    // define the getter() and setter() methord

    public int getCarID() {
        return this.carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarDescripution() {
        return this.carDescripution;
    }

    public void setCarDescripution(String carDescripution) {
        this.carDescripution = carDescripution;
    }

    public boolean isIsAvailable() {
        return this.isAvailable;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getCarPricePerDay() {
        return this.carPricePerDay;
    }

    public void setCarPricePerDay(int carPricePerDay) {
        this.carPricePerDay = carPricePerDay;
    }

    public String getCarColour() {
        return this.carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getCarNumberPlate() {
        return this.carNumberPlate;
    }

    public void setCarNumberPlate(String carNumberPlate) {
        this.carNumberPlate = carNumberPlate;
    }
    

    // define the toString() methord

    @Override
    public String toString() {
        System.out.println("      CAR DETAILS");
        return "{" +
            " carID='" + getCarID() + "'" +
            ", carName='" + getCarName() + "'" +
            ", carDescripution='" + getCarDescripution() + "'" +
            ", isAvailable='" + isIsAvailable() + "'" +
            ", carPricePerDay='" + getCarPricePerDay() + "'" +
            ", carColour='" + getCarColour() + "'" +
            ", carNumberPlate='" + getCarNumberPlate() + "'" +
            "}";
    }


    


}
