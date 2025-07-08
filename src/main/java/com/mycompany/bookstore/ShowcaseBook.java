/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author Shahd
 * 
 */
public class ShowcaseBook extends Book{
    public ShowcaseBook(String ISBN, String title, int year, double price, String author) {
        super(ISBN, title, year, price, author);
    }

    @Override
    public boolean isAvailable(int quantity) {
        return false;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        throw new RuntimeException("This book is for display only and cannot be sold");
    }
}
