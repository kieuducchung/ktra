
package oop.execrise9;
import java.util.Scanner;


public class MeetingRoom extends Room {
    private int capacity;

    public MeetingRoom() {}

    public MeetingRoom(String id, String name, double baseCost, int capacity) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override 
    public double calculateCost(){
        if(capacity > 50){
            return getBaseCost() * 1.2;
        }
        return getBaseCost();
    }
    
    @Override
    public void displayDetails(){
        System.out.println("Meeting room Details: ");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Cost: " + calculateCost());
    }
    @Override
    public void updateRoom(String id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Updating Room with Id : " + id);
        System.out.println("Room new !");
        super.update();
        System.out.println("Enter new Capacity");
        capacity = scanner.nextInt();
        scanner.nextLine();
       
    }
    
    
    
    
}
