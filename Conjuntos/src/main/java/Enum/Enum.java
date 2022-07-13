/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enum;

/**
 *
 * @author educu
 */
public class Enum {
    enum continentes{Asia, Europa, America, Oceania, Africa};
    
    
    public static void main(String[] args) {
        
        continentes continente;
        
        continente = continentes.Africa;
        System.out.println(continente);
        
        continente = continentes.Europa;
        System.out.println(continente);
        
        continente = continentes.America;
        System.out.println(continente);
        
        continente = continentes.Oceania;
        System.out.println(continente);
        
        continente = continentes.Asia;
        System.out.println(continente);
              
        //continente = continentes.USA; esto produce un error ya que no está en el num
    }
}
