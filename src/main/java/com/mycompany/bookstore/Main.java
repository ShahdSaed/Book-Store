/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookstore;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Shahd
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookStore store = new BookStore();
        
        store.add(new PaperBook("111", "Java Basics", 2018, 150.0, "Ali Ahmed", 5));
        store.add(new EBook("112", "Python for All", 2020, 90.0, "Sara Mohamed", "PDF"));
        store.add(new ShowcaseBook("113", "C++ Demo Book", 2010, 0.0, "Youssef Ali"));
        store.add(new PaperBook("114", "Data Structures", 2017, 120.0, "Fatma Nabil", 3));
        store.add(new EBook("115", "Web Development", 2023, 100.0, "Hassan Adel", "EPUB"));

        while (true) {
            System.out.println("\nWelcome to SmartBooks");
            System.out.println("1. Add a Paper-Book");
            System.out.println("2. Add an E-Book");
            System.out.println("3. Add a Showcase-Book");
            System.out.println("4. Buy a Book");
            System.out.println("5. Remove Outdated Books");
            System.out.println("6. Show all books");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1 ->  {
                    System.out.print("Enter ISBN: ");
                    String isbn = input.nextLine();
                    System.out.print("Enter title: ");
                    String title = input.nextLine();
                    System.out.print("Enter year: ");
                    int year = input.nextInt();
                    System.out.print("Enter price: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter author: ");
                    String author = input.nextLine();
                    System.out.print("Enter stock quantity: ");
                    int stock = input.nextInt();
                    Book paper = new PaperBook(isbn, title, year, price, author, stock);
                    store.add(paper);
                }
                case 2 ->  {
                    System.out.print("Enter ISBN: ");
                    String isbn = input.nextLine();
                    System.out.print("Enter title: ");
                    String title = input.nextLine();
                    System.out.print("Enter year: ");
                    int year = input.nextInt();
                    System.out.print("Enter price: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter author: ");
                    String author = input.nextLine();
                    String fileType = "";
                    do{
                        System.out.print("Enter file type (PDF/EPUB): ");
                        fileType = input.nextLine();
                    }while(!"PDF".equals(fileType) && !"EPUB".equals(fileType));
                    Book ebook = new EBook(isbn, title, year, price, author, fileType);
                    store.add(ebook);
                }
                case 3 ->  {
                    System.out.print("Enter ISBN: ");
                    String isbn = input.nextLine();
                    System.out.print("Enter title: ");
                    String title = input.nextLine();
                    System.out.print("Enter year: ");
                    int year = input.nextInt();
                    System.out.print("Enter price: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter author: ");
                    String author = input.nextLine();
                    Book demo = new ShowcaseBook(isbn, title, year, price, author);
                    store.add(demo);
                }
                case 4 ->  {
                    System.out.print("Enter ISBN to buy: ");
                    String isbn = input.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter email: ");
                    String email = input.nextLine();
                    System.out.print("Enter address: ");
                    String address = input.nextLine();
                    try {
                        double total = store.buy(isbn, qty, email, address);
                        System.out.println("Total price: " + total);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                }
                case 5 ->  {
                    System.out.print("Remove books older than how many years? ");
                    int years = input.nextInt();
                    input.nextLine();
                    List<Book> removed = store.remove(years);
                    for (Book b : removed) {
                        System.out.println("- " + b.title + " by " + b.author + " (" + b.year + ")");
                    }
                    break;
                }
                case 6 ->  {
                    Map<String, Book> inventory = store.getInventory();
                    if(inventory == null){
                        System.out.println("No books in inventory.");
                    } else{
                        System.out.println("All books in inventory.");
                        for (Book b : inventory.values()) {
                            System.out.println("- " + b.title + " by " + b.author + " (" + b.year + ")");
                        }
                    }
                    break;
                }
                case 7 ->  {
                    System.out.println("Thanks for using SmartBooks! Goodbye.");
                    input.close();
                    return;
                }
                default -> 
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
