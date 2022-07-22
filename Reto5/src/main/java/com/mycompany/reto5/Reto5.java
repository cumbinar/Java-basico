/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto5;

import controlador.Controlador;
import vista.Gui;
import modelo.Modelo;

/**
 *
 * @author educu
 */
public class Reto5 {

   
         public static void main(String[] args) throws ClassNotFoundException {
        
        Class.forName("org.sqlite.JDBC");
        
        Gui vista = new Gui();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo,vista);
        vista.setVisible(true);        
    }
   }

