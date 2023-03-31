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


import java.sql.*;
import java.util.Scanner;

public class Test {
    public static void main(String arg[])
    {
        String url = "jdbc:mysql://localhost/book"; // Contains the database name after the port number
        String username = "root";
        String password = "";

        Scanner keyboard = new Scanner(System.in);

        try {        Connection connection = null;

            // below two lines are used for connectivity.
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

           Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;

            // Display a menu to the user to choose what action they want to perform
            int choice;
            do {
                System.out.println("BOOK MANAGEMENT SYSTEM");
                System.out.println("----------------------");
                System.out.println("1. View all books");
                System.out.println("2. Add a book");
                System.out.println("3. Modify a book");
                System.out.println("4. Delete a book");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = keyboard.nextInt();
                keyboard.nextLine(); // consume the newline character after nextInt()

                switch (choice) {
                    case 1:
                        // View all books
                        resultSet = statement.executeQuery("SELECT * FROM book");
                        while (resultSet.next()) {
                            String isbn = resultSet.getString("isbn").trim();
                            String title = resultSet.getString("title").trim();
                            String author = resultSet.getString("author").trim();
                            String publisher = resultSet.getString("publisher").trim();
                            String genre = resultSet.getString("genre").trim();
                            int numberOfPages = resultSet.getInt("number_of_pages");
                            double price = resultSet.getDouble("price");

                            System.out.println("ISBN : " + isbn + "     Title : " + title + "       author: " + author +
                                    "       Publisher: " + publisher + "        Genre: " + genre +
                                    "       Number of Pages: " + numberOfPages + "        Price: " + price);
                        }
                        resultSet.close();
                        break;

                    case 2:
                        // Add a book
                        System.out.print("Enter isbn: ");
                        String isbn = keyboard.nextLine();

                        System.out.print("Enter title: ");
                        String title = keyboard.nextLine();

                        System.out.print("Enter author: ");
                        String author = keyboard.nextLine();

                        System.out.print("Enter publisher: ");
                        String publisher = keyboard.nextLine();

                        System.out.print("Enter genre: ");
                        String genre = keyboard.nextLine();

                        System.out.print("Enter number of pages: ");
                        int numberOfPages = keyboard.nextInt();

                        System.out.print("Enter price: ");
                        double price = keyboard.nextDouble();

                        String insertQuery = "INSERT INTO book(isbn, title, author, publisher, genre, number_of_pages, price) " +
                                "VALUES('" + isbn + "', '" + title + "', '" + author + "', '" + publisher + "', '" + genre + "', " + numberOfPages + ", " + price + ")";
                        statement.executeUpdate(insertQuery);

                        System.out.println("Book has been added successfully.");
                        break;

                    case 3:
                        // Modify a book
                        System.out.print("Enter isbn of the book you want to modify: ");
                        isbn = keyboard.nextLine();

                        System.out.print("Enter new title: ");
                        title = keyboard.nextLine();

                        System.out.print("Enter new author: ");
                        author = keyboard.nextLine();

                        System.out.print("Enter new publisher: ");
                        publisher = keyboard.nextLine();

                        System.out.print("Enter new genre: ");
                        genre = keyboard.nextLine();

                        System.out.print("Enter new number of pages: ");
                        numberOfPages = keyboard.nextInt();

                        System.out.print("Enter new price: ");
                        price = keyboard.nextDouble();

                        String updateQuery = "UPDATE book SET title='" + title + "', author='" + author + "', publisher='" + publisher + "', genre='" + genre + "', number_of_pages=" + numberOfPages + ", price=" + price + " WHERE isbn='" + isbn + "'";
                        int rowsUpdated = statement.executeUpdate(updateQuery);

                        if (rowsUpdated == 1) {
                            System.out.println("Book has been modified successfully.");
                        } else {
                            System.out.println("Book with ISBN " + isbn + " not found.");
                        }
                        break;

                    case 4:
                        // Delete a book
                        System.out.print("Enter isbn of the book you want to delete: ");
                        isbn = keyboard.nextLine();

                        String deleteQuery = "DELETE FROM book WHERE isbn='" + isbn + "'";
                        int rowsDeleted = statement.executeUpdate(deleteQuery);

                        if (rowsDeleted == 1) {
                            System.out.println("Book has been deleted successfully.");
                        } else {
                            System.out.println("Book with ISBN " + isbn + " not found.");
                        }
                        break;
                }
            }while(choice < 5);
        } catch (Exception ex) {

        }
    }
}