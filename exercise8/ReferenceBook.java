
package oop.exercise8;

import java.util.Scanner;


public class ReferenceBook extends Book{
    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String id, String title, double basePrice, String publisher) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    @Override
    public double calculatePrice(){
        return getBasePrice() * 1.2;
    }
    
    @Override
    public void displayDetails(){
        System.out.println("Reference Book ID: " + getId());
        System.out.println("Reference Text Book Title: " + getTitle());
        System.out.println("Publisher: " + publisher);
        System.out.println("Calculate Price: " + calculatePrice());       
    }
    
    @Override
    public void updateBook(String id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Updating Reference Book with id: " + id);
        System.out.println("Book new!");
        super.update();
        System.out.println("Enter new Publisher: ");
        publisher = scanner.nextLine();
    
    }   
}
