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

    public static void main(String[] args) {
        HashSet<Integer> conjuntoNumeros = new HashSet<Integer>();  // se crea el conjunto
        conjuntoNumeros.add (20);
        conjuntoNumeros.add (25);
        conjuntoNumeros.add (30);
        conjuntoNumeros.add (20); // este no lo agrega ya esta repetido
        conjuntoNumeros.add (90);
        
        System.out.println(conjuntoNumeros);
        
    }
}
