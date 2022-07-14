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
public class Ventana extends JFrame {
        
    public Ventana(){
        setSize(800,500); //establezco el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE ); //le digo que cierre el programa cuando de click en cerrar
        setTitle("Tienda Cumbi"); //le coloco titulo a la ventana
        //setBounds(1000, 200, 500, 200); //establezco tamaño y posición
        setLocationRelativeTo(null); //centro mi ventana en la pantalla actual
        
        iniciarComponentes();    //llamo al método para iniciar componentes    
    }
    
    /**
     * método que va a agregar componentes a la ventana
     */
    public void iniciarComponentes(){
         //agregamos el panel a la ventana
        JPanel panel = new JPanel(); //se crea un objeto de la clase JPanel
         //se agrega el panel a la clase actual
        this.getContentPane().add(panel);
        
        panel.setBackground(new Color(230,230,230)); //se asigna color de fondo al panel
        
        panel.setLayout(null);//deshabilito el layout para poder mover la etiqueta
        
         //Crear etiqueta 1
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setLayout(null);        
        etiqueta1.setText("  Catálogo"); //texto de la etiqueta
        etiqueta1.setBounds(10,10,200,30); //no se mueve se ubica en las coordenada x=10, y=10, ancho 300px, alto,        
        etiqueta1.setOpaque(true); //dar permisos para cambiar el color de fondo
        etiqueta1.setBackground(Color.BLACK); //color de fondo negro
        etiqueta1.setForeground(Color.YELLOW); //color de la letra
        etiqueta1.setHorizontalAlignment(SwingConstants.LEFT); //justifica a la izquierda
        etiqueta1.setFont(new Font("ARIAL",0,20));  //define fuente y tamaño
        panel.add(etiqueta1);  //agrega la etiqueta al panel
        
         //Crear etiqueta 2
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setLayout(null);        
        etiqueta2.setText("  Comprar");  //texto de la etiqueta
        etiqueta2.setBounds(10,50,200,30); //no se mueve se ubica en las coordenada x=10, y=10, ancho 300px, alto,        
        etiqueta2.setOpaque(true); //dar permisos para cambiar el color de fondo
        etiqueta2.setBackground(Color.BLACK); //color de fondo negro
        etiqueta2.setForeground(Color.YELLOW); //color de la letra
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER); //justifica a la izquierda
        etiqueta2.setFont(new Font("ARIAL",0,20)); //define fuente y tamaño
        panel.add(etiqueta2);
        
          //Crear etiqueta 3
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setLayout(null);        
        etiqueta3.setText("  Pagar  ");  //texto de la etiqueta
        etiqueta3.setBounds(10,90,200,30); //no se mueve se ubica en las coordenada x=10, y=10, ancho 300px, alto,        
        etiqueta3.setOpaque(true); //dar permisos para cambiar el color de fondo
        etiqueta3.setBackground(Color.BLACK); //color de fondo negro
        etiqueta3.setForeground(Color.YELLOW); //color de la letra
        etiqueta3.setHorizontalAlignment(SwingConstants.RIGHT); //justifica a la izquierda
        etiqueta3.setFont(new Font("ARIAL",0,20)); //define fuente y tamaño
        panel.add(etiqueta3); //agrega la etiqueta al panel
    }
    
    
}