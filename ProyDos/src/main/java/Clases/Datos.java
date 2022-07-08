/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author educu
 */
public class Datos {

    public static void calcularNombreMasLargo() {
        System.out.println("cuantos hombres y mujeres quiere ingresar");

        Scanner in = new Scanner(System.in);
        int cantidad = in.nextInt();

        ArrayList<Hombre> hombres = new ArrayList<>();
        ArrayList<Mujer> mujeres = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del hombre " + (i + 1));
            String nombre = in.next();
            System.out.println("Ingrese la edad del hombre " + (i + 1));
            int edad = in.nextInt();
            hombres.add(new Hombre(nombre, edad));
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre de la mujer " + (i + 1));
            String nombre = in.next();
            System.out.println("Ingrese la edad de la mujer " + (i + 1));
            int edad = in.nextInt();
            mujeres.add(new Mujer(nombre, edad));
        }

        int maximaLongitud = 0;
        boolean esHombre = false;
        int indiceMayorLongitud = 0;

        for (int i = 0; i < cantidad; i++) {
            int longitudNombre = hombres.get(i).getNombre().length(); //Andres
            if (longitudNombre > maximaLongitud) { //true
                indiceMayorLongitud = i; //0
                esHombre = true; 
                maximaLongitud = longitudNombre; //6
            }
            
            longitudNombre = mujeres.get(i).getNombre().length(); //Esperanza
            if (longitudNombre > maximaLongitud) { //9 > 6 ? true
                indiceMayorLongitud = i; //0
                esHombre = false; 
                maximaLongitud = longitudNombre; //9
            }
        }
        if (esHombre) { // if (esHombre == true)
            System.out.println("la mayor longitud la tiene el hombre de nombre "
                    + hombres.get(indiceMayorLongitud).getNombre());
        } else {
            System.out.println("la mayor longitud la tiene la mujer de nombre "
                    + mujeres.get(indiceMayorLongitud).getNombre());
        }
    }
}