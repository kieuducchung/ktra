
package oop.exercise8;
import java.util.Scanner;


public abstract class Book implements Ibook{
    private String id;
    private String title; 
    private double basePrice;

    public Book() {
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    
    
    @Override
    public abstract double calculatePrice();
    
    @Override 
    public abstract void displayDetails();
    
    @Override
    public abstract void updateBook(String id);
    
    public void update(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new title: ");
        title = scanner.nextLine();
        System.out.println("Enter new Base Price");
        basePrice = scanner.nextDouble();
        scanner.nextLine();
        
        
    }
    
    
    
    
    
}
