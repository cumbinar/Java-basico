/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arreglo;

import java.util.ArrayList;

/**
 *
 * @author educu
 */
public class Arreglo {

    public static void main(String[] args) {
        System.out.println("Arreglo impreso en forma descendente");
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for(int i = 1; i <= 10; i ++){
            numeros.add(i);
        }
        
        for (int i = 9; i >= 0; i --){
            System.out.print(numeros.get(i)+ " , ");
           
        }
        
        System.out.println("Arreglo impreso en forma Ascendente");
        
        for (int i =0; i< 10; i ++){
        
        System.out.print(numeros.get(i)+ " , ");
        }
    }
}
