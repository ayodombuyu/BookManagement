/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagement;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

class Book {
    String title;
    String author;
    int year;
    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year + "\n";
    }
}

class BookManager {
    ArrayList<Book> books = new ArrayList<>();
    
    public void addBook() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter title: ");
        String title = sc.nextLine();
        
        System.out.println("Enter author: ");
        String author = sc.nextLine();
        
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        
        Book book = new Book(title, author, year);
        books.add(book);
        
        
        
        
        
        
        
        
        System.out.println("Book added successfully!");
    }
    
    public void deleteBook() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the title of the book you want to delete: ");
        String title = sc.nextLine();
        
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equalsIgnoreCase(title)) {
                books.remove(i);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        
        System.out.println("Book not found!");
    }
    
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found!");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString());
            }
        }
    }
}

public class BookManagement {
    public static void main(String[] args) {
        
     
        
        Scanner sc = new Scanner(System.in);
        BookManager bm = new BookManager();
        int choice;
        
        do {
            System.out.println("1. Add book\n2. Delete book\n3. Display books\n4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
                case 1:
                    bm.addBook();
                    break;
                case 2:
                    bm.deleteBook();
                    break;
                case 3:
                    bm.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            
            System.out.println();
            
        } while(choice != 4);
    }
}







