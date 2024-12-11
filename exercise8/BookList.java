
package oop.exercise8;
import java.util.ArrayList;


public class BookList {
    private ArrayList<Book> BookList = new ArrayList<>();
    
    public void addBook(Book book){
        BookList.add(book);
    }
    
    public Book findBookByID(String id){
        for(Book book : BookList){
            if(book.getId().equals(id)){
                return book;
            }           
        }
        return null;
    }
    
    public void updateBook(String id){
        Book book = findBookByID(id);
        if(book != null){
            book.updateBook(id);
            System.out.println("Book co id la " + id + " da duoc update thanh cong");
        }else{
            System.out.println("Book co id la " + id + " khong co trong danh sach");
        }
    }
    

    
    public Boolean deleteBookByid(String id){
        Book book = findBookByID(id);
        if(book != null){
            BookList.remove(book);
            System.out.println("Book co id la " + id + " da duoc xoa thanh cong");
            return true;
        }else{
            System.out.println("Book co id la " + id + " khong co trong danh sach");
            return false;
        }
    }
    
    public void displayAllBook(){
        if(BookList.isEmpty()){
            System.out.println("Danh sach hien dang trong!");
            return;
        }else{
            System.out.println("Book List!!");
            for(Book book : BookList){
                book.displayDetails();
                System.out.println("-----------------------");
            }
        }
    }
    
    public Book findMostExpensiveBook(){
        Book MostExpensive = null;
        double maxPrice = 0;
        for(Book book : BookList){
            double Price = book.calculatePrice();
            if(Price > maxPrice){
                maxPrice = Price;
                MostExpensive = book;
            }
        }
        return MostExpensive;        
    }
    
    public void countBooks(){
        int TextBooks = 0;
        int ReferenceBooks = 0;
        for(Book book : BookList){
            if(book instanceof TextBook){
                TextBooks++;
            }else if(book instanceof ReferenceBook){
                ReferenceBooks++;
            }
        }
        System.out.println("Text Book: " + TextBooks);
        System.out.println("Reference Book: " +ReferenceBooks);    
    }
    
    
}
