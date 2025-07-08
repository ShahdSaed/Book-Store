/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author Shahd
 */
public class ShippingService {
    public static void send(Book book, String address) {
        System.out.println("Shipping paper-book: \"" + book.title + "\" to address: " + address);
    } 
}
