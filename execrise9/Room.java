
package oop.execrise9;
import java.util.Scanner;

public abstract class Room implements IRoom  {
    private String id;
    private String name;
    private double baseCost;

    public Room() {
    }

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }
    Scanner scanner = new Scanner(System.in);

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    
    @Override
    public abstract double calculateCost();
    
    @Override
    public abstract void displayDetails();
    
    @Override
    public abstract void updateRoom(String id);
    
    public void update(){
        System.out.println("Enter new name: ");
        name = scanner.nextLine();
        System.out.println("Enter new Base Cost: ");
        baseCost = scanner.nextDouble();
        scanner.nextLine();
    }

    
    
}
