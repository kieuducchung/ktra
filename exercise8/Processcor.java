
package oop.exercise8;
import java.util.Scanner;

public class Processcor {

    
    public static void main(String[] args) {
        BookList booklist = new BookList();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("---Menu---");
            System.out.println("1. Add new textbook. ");
            System.out.println("2. Add new reference book. ");
            System.out.println("3. Update book by id. ");
            System.out.println("4. Delete book by id. ");
            System.out.println("5. Find book by id. ");
            System.out.println("6. Display all books. ");
            System.out.println("7. Find the most expensive book. ");
            System.out.println("8. Count the total number of TextBooks and ReferenceBooks separately in the book list.");
            System.out.println("9. Exit!");
            int choice;
            System.out.println("Moi ban nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    System.out.println("Enter TexT Book ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter Base Price: ");
                    double basePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter Subject: ");
                    String subject = scanner.nextLine();
                    booklist.addBook(new TextBook(subject, id, title, basePrice));
                    break;
                case 2:
                    System.out.println("Enter Reference Book ID: ");
                    id = scanner.nextLine();
                    System.out.println("Enter Title: ");
                    title = scanner.nextLine();
                    System.out.println("Enter Base Price: ");
                    basePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter Publisher: ");
                    String publisher = scanner.nextLine();
                    booklist.addBook(new ReferenceBook(id, title, basePrice, publisher));
                    break;
                case 3: 
                    System.out.println("Enter Book ID to update: ");
                    id = scanner.nextLine();
                    booklist.updateBook(id);
                    break;                    
                case 4: 
                    System.out.println("Enter Book id to delete: ");
                    id = scanner.nextLine();
                    booklist.deleteBookByid(id);
                    break;                   
                case 5:
                    System.out.println("Enter Book id to find: ");
                    id = scanner.nextLine();
                    Book foundbook = booklist.findBookByID(id);
                    if(foundbook != null){
                        foundbook.displayDetails();
                    }else{
                        System.out.println("Book not found!");
                    }
                    break;
                case 6:
                    booklist.displayAllBook();
                    break;
                case 7:
                    Book MostExpensive = booklist.findMostExpensiveBook();
                    if(MostExpensive != null){
                        MostExpensive.displayDetails();
                    }else{
                        System.out.println("Khong co sach.");
                    }
                    break;
                case 8:
                    booklist.countBooks();
                    break;
                case 9:
                    System.out.println("Ket thuc chuong triinh....");
                    scanner.close();
                    return;
                default:
                    System.out.print("Du lieu khong hop le! Thu lai: ");
                           
            }
                
       }
        
    }
    
}
