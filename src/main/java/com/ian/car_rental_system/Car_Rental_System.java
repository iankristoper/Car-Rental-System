package com.ian.car_rental_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author Ian Tagano
 */


public class Car_Rental_System 
{
    
    private static List<Car> cars = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) 
    {
        int choice;
        
        do
        {
            System.out.println("\nCar Rental System Menu:");
            System.out.println("1. Add New Car");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Display Car Information");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch(choice)
            {
                case 1:
                    addNewCar();
                    break;
                    
                case 2:
                    rentCar();
                    break;
                    
                case 3:
                    returnCar();
                    break;
                    
                case 4:
                    displayCarInformation();
                    break; 
                    
                case 5:
                    System.out.println("Exiting the system...");
                    
                default:
                    System.out.println("Invalid choice. Please try again");
                    break;
            }
            
        }while(choice != 5);
    }
    
    
    //methods for adding new car
    private static void addNewCar()
    {
        System.out.print("Enter car make: ");
        String make = scanner.next();
        System.out.print("Enter car model: ");
        String model = scanner.next();
        System.out.print("Enter car year: ");
        int year = scanner.nextInt();
        System.out.print("Enter car mileage: ");
        double mileage = scanner.nextDouble();
        
        
        Car car = new Car(make, model, year, mileage);
        cars.add(car);
        System.out.println("Car added successfully");
    }
    
    //methods for renting car 
    private static void rentCar()
    {
        System.out.print("Enter car index to rent: ");
        int index = scanner.nextInt();
        
        if(index >= 0 && index < cars.size())
        {
            Car car = cars.get(index);
            car.rentCar();
            System.out.println("Car rented successfully");
        }
        else 
        {
            System.out.println("Invalid index");
        }
    }
    
    //methods for returning the car 
    private static void returnCar()
    {
        System.out.println("Enter car index to return: ");
        int index = scanner.nextInt();
        
        if(index >= 0 && index < cars.size())
        {
            Car car = cars.get(index);
            car.returnCar();
            System.out.println("Car returned successfully");
        }
        else 
        {
            System.out.println("Invalid car index");
        }
    }
    
    //methods for displaying car information
    private static void displayCarInformation()
    {
        for(int i = 0; i < cars.size(); ++i)
        {
            System.out.println("Car " + i + ": " + cars.get(i));
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
