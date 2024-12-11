
package oop.exercise8;

import java.util.Scanner;


public class TextBook extends Book{
    String subject;

    public TextBook() {
    }

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    @Override
    public double calculatePrice(){
        return getBasePrice() * 1.1;
    }
    
    
    @Override
    public void displayDetails(){
        System.out.println("Text Book ID: " + getId());
        System.out.println("Text Book Title: " + getTitle());
        System.out.println("Subject: " + subject);
        System.out.println("Calculate Price: " + calculatePrice());       
    }
    
    @Override
    public void updateBook(String id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Updating Text Book with id: " + id);
        System.out.println("Book new!");
        super.update();
        System.out.println("Enter new Subject: ");
        subject = scanner.nextLine();
        
        
        
        
    }
    

    
    
    
    
    
    
}
