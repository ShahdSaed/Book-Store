/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author Shahd
 */
public abstract class Book {
    protected String ISBN;
    protected String title;
    protected int year;
    protected double price;
    protected String author;

    public Book(String ISBN, String title, int year, double price, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    
    public abstract boolean isAvailable(int quantity);
    public abstract double buy(int quantity, String email, String address);
}

