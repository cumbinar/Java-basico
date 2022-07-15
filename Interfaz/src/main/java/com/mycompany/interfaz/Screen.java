/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author educu
 */
public class Screen extends JFrame {

    public Screen() {
        setSize(500, 600); //establezco el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); //le digo que cierre el programa cuando de click en cerrar
        setTitle("Mi primera ventanita"); //le coloco titulo a la ventana
        //setBounds(1000, 1000, 500, 200); //establezco tamaño y posición
        setLocationRelativeTo(null); //centro la ventana

        iniciarComponentes();
    }

    /**
     * método que va a agregar componentes a la ventana
     */
    public void iniciarComponentes() {
        //agregamos el panel a la ventana
        JPanel panel = new JPanel(); //se crea un objeto de la clase JPanel
        //se agrega el panel a la clase actual
        this.getContentPane().add(panel);

        panel.setBackground(new Color(15, 192, 180));

        panel.setLayout(null);//deshabilito el layout para poder mover la etiqueta
        //Crear etiqueta
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setLayout(null);
        etiqueta1.setText("===== Calculadora ====");
        etiqueta1.setBounds(30, 10, 400, 50);
        //etiqueta1.setOpaque(true); //dar permisos para cambiar el color de fondo
        //etiqueta1.setBackground(Color.BLACK); //color de fondo negro
        etiqueta1.setForeground(Color.WHITE); //color de la letra
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta1.setFont(new Font("ALGERIAN", 0, 24));
        panel.add(etiqueta1);

        JLabel etiqueta2 = crearEtiqueta(5, 100, "Ingrese número 1: ");
        panel.add(etiqueta2);
        JLabel etiqueta3 = crearEtiqueta(5, 160, "Ingrese número 2: ");
        panel.add(etiqueta3);
        JLabel etiqueta4 = crearEtiqueta(5, 200, "Resultado: ");
        panel.add(etiqueta4);
        JLabel resultado = crearEtiqueta(180, 200, "########");
        panel.add(resultado);

        JLabel imagen = new JLabel(new ImageIcon("D:\\MinTic\\Java-basico\\Interfaz\\src\\main\\java\\com\\mycompany\\interfaz\\Imagenes\\Caro.jpg"));
        imagen.setBounds(100, 400, 250, 100);
        panel.add(imagen);

        JTextField numero1 = new JTextField();
        numero1.setBounds(180, 110, 100, 25);
        panel.add(numero1);

        JTextField numero2 = new JTextField();
        numero2.setBounds(180, 170, 100, 25);
        panel.add(numero2);

        JComboBox lista = new JComboBox();
        lista.addItem("Sumar");
        lista.addItem("Restar");
        lista.addItem("Multiplicar");
        lista.addItem("Dividir");
        lista.setBounds(5, 280, 200, 30);
        lista.setFont(new Font("Arial", 0, 20));
        panel.add(lista);

        JButton botonCalcular = new JButton();
        botonCalcular.setBounds(5, 320, 200, 30);
        botonCalcular.setText("Calcular");
        botonCalcular.setFont(new Font("Arial", 0, 20));
        panel.add(botonCalcular);

        ActionListener ejecucion = new ActionListener() { //crear una clase anonima
            @Override
            public void actionPerformed(ActionEvent e) { //acá va el código que se ejecuta cuando se da click
                //obtener el texto de las cajas de texto 
                float floatNumero1 = Float.parseFloat(numero1.getText());
                float floatNumero2 = Float.parseFloat(numero2.getText());
               
                //obtener la operación seleccionada en el combo box
                int operacion = lista.getSelectedIndex();
                float resultadoOperacion = 0;

                switch (operacion) {
                    case 0:
                        resultadoOperacion = floatNumero1 + floatNumero2;
                        break;
                    case 1:
                        resultadoOperacion = floatNumero1 - floatNumero2;
                        break;
                    case 2:
                        resultadoOperacion = floatNumero1 * floatNumero2;
                        break;
                    case 3:
                        resultadoOperacion = floatNumero1 / floatNumero2;
                        break;
                    default:
                        resultadoOperacion = 0;
                        break;
                }
                //mostrar el resultado en la etiqueta resultado
                resultado.setText(String.valueOf(resultadoOperacion));
            }
        };

        botonCalcular.addActionListener(ejecucion);
    }

    JLabel crearEtiqueta(int x, int y, String texto) {
        JLabel etiqueta = new JLabel();
        etiqueta.setText(texto);
        etiqueta.setBounds(x, y, 400, 50);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setFont(new Font("Arial", 0, 20));

        return etiqueta;
    }

}


 

   
        