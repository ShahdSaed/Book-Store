/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

import java.time.Year;
import java.util.*;

/**
 *
 * @author Haneen
 */
public class BookStore {
    private Map<String, Book> inventory = new HashMap<>();
    public Map<String, Book> getInventory(){
        return inventory;
    }
    public void add(Book book){
        inventory.put(book.getISBN(), book);
        System.out.println("Book added: " + book.getTitle());
    }
    
    public List<Book> remove(int maxYears){
        List<Book> removedBooks = new ArrayList<>();
        int currentYear = Year.now().getValue();
        for(Book book : inventory.values()){
            if(currentYear - book.getYear() > maxYears){
                removedBooks.add(book);
            }
        }
        for(Book book : removedBooks){
            inventory.values().remove(book);
        }
        System.out.println("Rmoved " + removedBooks.size() + " old books.");
        return removedBooks;
    }
    
    public double buy(String ISBN, int quantity, String email, String address){
        Book book = inventory.get(ISBN);
        if(book == null){
            throw new RuntimeException("Book not found.");
        }
        return book.buy(quantity, email, address);
    }
}
