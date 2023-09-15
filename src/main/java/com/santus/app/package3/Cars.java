
package com.santus.app.package3;


public class Cars {
    
    String make = "Volkswagen";
    String enginetype = "patrol";
    int mileage = 20000;
    int year = 2023;
    
    public Cars (){}
    

    public Cars(String make, String enginetype, int mileage, int year) {
        this.make = make;
        this.enginetype = enginetype;
        this.mileage = mileage;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cars{" + "make=" + make + ", enginetype=" + enginetype + ", mileage=" + mileage + ", year=" + year + '}';
    }
    
    
    
    
    
    
    
    
}
