/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conjuntos;
import java.util.HashSet;

/**
 *
 * @author educu
 */
public class Conjuntos {
    // En los conjuntos no se repiten objetos
    //los elementos no tienen orden y el conjunto no se puede indexar
    public static void main(String[] args) {
        HashSet<Integer> conjuntoNumeros = new HashSet<Integer>();  // se crea el conjunto
        conjuntoNumeros.add (20);
        conjuntoNumeros.add (25);
        conjuntoNumeros.add (30);
        conjuntoNumeros.add (20); // este no lo agrega ya esta repetido
        conjuntoNumeros.add (90);
        conjuntoNumeros.add (120);
        conjuntoNumeros.add (90); // este no lo agrega ya esta repetido
        
        System.out.println(conjuntoNumeros);  //no se imprime en el orden de igreso
        System.out.println(conjuntoNumeros);  //no se imprime en el orden de igreso
        System.out.println(conjuntoNumeros);  //no se imprime en el orden de igreso
        
          for (int elemento : conjuntoNumeros) {  //forma de recorrer el conjunto
            System.out.println("Este es numero " + elemento); //no se imprime en el orden de ingreso
        }
        
        
    }
    
    
}
