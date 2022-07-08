/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author educu
 */
public class Ejercicio {

    public static void calcularMedia() {
        System.out.println("cuantos números quiere ingresar");

        Scanner in = new Scanner(System.in);
        int cantidad = in.nextInt();

        ArrayList<Float> numeros = new ArrayList<Float>();

        float sumaNumeros = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el número " + (i + 1));
            float numero = in.nextFloat();
            sumaNumeros = sumaNumeros + numero;
            numeros.add(numero);
        }

        System.out.println("la media de los números es igual a " + (sumaNumeros / cantidad));

    }
}
