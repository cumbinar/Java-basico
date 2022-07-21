/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Vista;
import modelo.Modelo;

/**
 *
 * @author educu
 */
public class Controlador implements ActionListener{
    private Vista view;
    private Modelo model;
    
    // en el controlador va el código que se ejecutaría al pulsar el boton

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this); //los elementos de la vista deben ser publicos
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
         //capturar la información de textoNumero1 y pasarlo a atributo del modelo correspondiente
         model.setNumeroUno(Float.parseFloat(view.textNumeroUno.getText()));
         model.setNumeroDos(Float.parseFloat(view.txtNumeroDos.getText()));
         
         model.multiplicar();
         
         view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
    
}
