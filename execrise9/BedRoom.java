
package oop.execrise9;

import java.util.Scanner;

public class BedRoom extends Room {
    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(String id, String name, double baseCost, int numberOfBeds) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    
    @Override
    public double calculateCost(){
        if(numberOfBeds >= 3){
            return getBaseCost() * 1.1;
        }
        return getBaseCost();
    }
    
    @Override
    public void displayDetails(){
        System.out.println("Bed room Details: ");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Number Of Beds: " + getNumberOfBeds());
        System.out.println("Cost: " + calculateCost());
    }
    @Override
    public void updateRoom(String id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Updating Room with Id : " + id);
        System.out.println("Room new !");
        super.update();
        System.out.println("Enter new number Of Beds");
        numberOfBeds = scanner.nextInt();
        scanner.nextLine();
       
    }
    
    
    
    
    
    
}
