/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author educu
 */
public class Etiqueta {
    private int x;
    private int y;
    private String titulo;

    public Etiqueta(int x, int y, String titulo) {
        this.x = x;
        this.y = y;
        this.titulo = titulo;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}


 

   
        