package com.libraryMgtSystem;

public class LibraryAdmin {

    public static void main(String[] args) {

        AllBooks allBooks = new AllBooks();

        // Set details for Book 1
        allBooks.b1.setBookId(101);
        allBooks.b1.setBookName("Java Programming");
        allBooks.b1.setAvailable(true);
        allBooks.b1.setPrice(550.00);

        // Get details for Book 1
        int id1 = allBooks.b1.getBookId();
        String name1 = allBooks.b1.getBookName();
        boolean available1 = allBooks.b1.isAvailable();
        double price1 = allBooks.b1.getPrice();

        System.out.println("Book 1 Details");
        System.out.println("Book Id: " + id1);
        System.out.println("Book Name: " + name1);
        System.out.println("Available: " + available1);
        System.out.println("Price: Rs. " + price1);

        System.out.println("----------------------");

        // Set details for Book 2
        allBooks.b2.setBookId(102);
        allBooks.b2.setBookName("Python Programming");
        allBooks.b2.setAvailable(false);
        allBooks.b2.setPrice(450.00);

        // Get details for Book 2
        int id2 = allBooks.b2.getBookId();
        String name2 = allBooks.b2.getBookName();
        boolean available2 = allBooks.b2.isAvailable();
        double price2 = allBooks.b2.getPrice();

        System.out.println("Book 2 Details");
        System.out.println("Book Id: " + id2);
        System.out.println("Book Name: " + name2);
        System.out.println("Available: " + available2);
        System.out.println("Price: Rs. " + price2);
    }
}