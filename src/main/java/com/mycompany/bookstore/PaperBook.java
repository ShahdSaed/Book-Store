/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author Shahd
 */
public class PaperBook extends Book{
    private int stock;
    
    public PaperBook(String ISBN, String title, int year, double price, String author, int stock) {
        super(ISBN, title, year, price, author);
        this.stock = stock;
    }

    public int getStock(){
        return stock;
    }
    @Override
    public boolean isAvailable(int quantity) {
        return quantity <= stock;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if(isAvailable(quantity)){
            stock -= quantity;
            ShippingService.send(this, address);
            return this.price * quantity;
       }
        throw new RuntimeException("Not enough stock available.");
    }
}
