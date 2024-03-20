package com.ian.car_rental_system;

/**
 *
 * @author Ian Tagano
 */


public class Car 
{
    //private attirbutes for data hiding
    private String make;
    private String model;
    private int year;
    private double mileage;
    private boolean available;
    private String rentalHistory;
    
    
    //constructor methods for initiating initial values 
    public Car(String make, String model, int year, double mileage)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.available = true;
        this.rentalHistory = "";
    }
    
    
    
    //getters for accessing the data inside
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getMileage() {
        return mileage;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public String getRentalHistory() {
        return rentalHistory;
    }
    
    
    
    //methods for the system 
    public void rentCar()
    {
        if(available)
        {
            available = false;
            rentalHistory = rentalHistory + "Rented";
        }
        else 
        {
            System.out.println("Car not available for renting");
        }
    }
    
    public void returnCar()
    {
        if(!available)
        {
            available = true;
            rentalHistory = rentalHistory + "Returned";
        }
        else 
        {
            System.out.println("Car is already available");
        }
    }
    
    
    @Override
    public String toString() 
    {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", available=" + available +
                '}';
    }
}
