/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenarHashSet;

/**
 *
 * @author educu
 */
import java.util.*;
public class example{
    //Una forma de ordenar un HashSet es primero convertirlo en una lista y luego ordenarlo.
    //Agregaremos los elementos del conjunto a la lista y luego usaremos la función sort() para ordenarlos.
     public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();

        // Using add() method
        number.add(3);
        number.add(6);
        number.add(4);
        
        // converting HashSet to arraylist
        ArrayList<Integer> al = new ArrayList<>(number);
        
        // sorting the list and then printing
        Collections.sort(al);
        System.out.println("Sorted list: ");
        for(int x: al) {
            System.out.print(x + " ");
        }
        
        
        //Crear el HashSet
        HashSet<String> palabras = new HashSet<>();
        //Agregar con add()
        
        palabras.add("Eduardo");
        palabras.add("Pirulino");
        palabras.add("Morrongoy");
        palabras.add("Gualterino");
        palabras.add("Pasto Rico");
        
         // converting HashSet to arraylist
        ArrayList<String> ordenarPalabras = new ArrayList<>(palabras);
        
        // sorting the list and then printing
        Collections.sort(ordenarPalabras);
         System.out.println("");
        System.out.println(ordenarPalabras);
            
    }
}