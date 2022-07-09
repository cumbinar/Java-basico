/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.LinkedList;
import java.util.Collections; //para orderar LinkedList

/**
 *
 * @author educu
 */
public class Lista1 {

    public static void main(String[] args) {
        LinkedList<Integer> enteros = new LinkedList<>();

        enteros.add(20);
        enteros.add(59);
        enteros.add(12);
        enteros.add(33);
        enteros.add(62);
        enteros.add(203);
        enteros.add(505);
        enteros.add(124);
        enteros.add(333);
        enteros.add(629);
        enteros.add(9);

        System.out.println("En la posición 2 está el número " + enteros.get(1));
        System.out.println("En la posición 5 está el número " + enteros.get(6));

        System.out.println("La lista de números es:");

        for (int i = 0; i < enteros.size(); i++) {  //recorrer el Array para imprimir
            System.out.print(enteros.get(i) + " , ");
        }

        Collections.sort(enteros); //ordena la lista 

        System.out.println(" ");

        System.out.println("La lista ordenada de números es:");
        for (float n : enteros) {            //Otra forma de recorrer el array para imprimir
            System.out.print(n + ", ");
        }

    }

}
