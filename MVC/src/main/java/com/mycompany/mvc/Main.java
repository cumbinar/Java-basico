/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mvc;

import modelo.Modelo;
import vista.Vista;
import controlador.Controlador;
/**
 *
 * @author educu
 */
public class Main {

    public static void main(String[] args) {
        Modelo model = new Modelo(0,0,0);
        Vista view = new Vista();
        
        Controlador ctrl = new Controlador(view, model);
        view.setVisible(true);
        
    }
}
