/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;
import java.util.LinkedList;


/**
 *
 * @author educu
 */
public class Lista1 {
    public static void main(String[] args) {
        LinkedList<Integer> enteros =  new LinkedList<>();
        
        enteros.add(20);
        enteros.add(50);
        enteros.add(12);
        enteros.add(33);
        enteros.add(62);
        
        System.out.println("En la posición 2 está el número " + enteros.get(1));
    }
    
}
