/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapas;
import java.util.HashMap;

/**
 *
 * @author educu
 */
public class principal {
    public static void main(String[] args) {
        
        HashMap<String, Integer> calendario = new HashMap<>();
        
        calendario.put("Enero", 31);
        calendario.put("Febrero", 28);
        calendario.put("Marzo", 31);
        calendario.put("Abril", 30);
        
        for (String llave: calendario.keySet()){
            System.out.println(llave);  // no imprime en orden de entrada
            System.out.println(calendario.get(llave));
        }
        
        
    }
    
}
