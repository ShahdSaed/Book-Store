/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author Shahd
 */
public class EBook extends Book{
    private String fileType;

    public EBook(String ISBN, String title, int year, double price, String author, String fileType) {
        super(ISBN, title, year, price, author);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    @Override
    public boolean isAvailable(int quantity) {
        return true;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        MailService.send(this, email);
        return this.price * quantity;
    }
}
