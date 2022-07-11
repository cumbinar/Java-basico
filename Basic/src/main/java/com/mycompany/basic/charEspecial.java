/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic;

/**
 *
 * @author educu
 */
public class charEspecial {

    public static void main(String[] args) {
        String nombre = "Cumbi";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre es: \n" + nombre); //\n salto de linea
        System.out.println("Mi nombre es: \t" + nombre);  //escribir linea con tabulador
        System.out.println("Mi nombre es: \b"+ nombre); // retoceso, elimina un espacio
        System.out.println("Mi nombre es: \b\b"+ nombre); // retoceso, elimina dos espacios
        System.out.println("mi nombre es: \'"+ nombre + "\'"); //variable escrita en comillas simples
        System.out.println("Mi nombre es: \"" + nombre + "\""); //variable escrita en comillas dobles
    }

}
