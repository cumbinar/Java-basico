/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedList;

import linkedList.Mujer;

/**
 *
 * @author educu
 */
public class Principal {
    public static void main(String[] args) {
      Mujer filomena = new Mujer("Filomena", "34596804"); 
       
      filomena.agregarCursos( "java");
      filomena.agregarCursos( "python");
      filomena.agregarCursos( "javaScript");
      filomena.agregarCursos( "pastuso");
      
      filomena.mostrarCursos();
    }

}   

