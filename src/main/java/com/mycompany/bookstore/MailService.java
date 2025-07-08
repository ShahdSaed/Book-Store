/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author shahd
 */
public class MailService {
    public static void send(Book book, String email) {
        System.out.println("Sending e-book: \"" + book.title + "\" to email: " + email);
    }    
}
