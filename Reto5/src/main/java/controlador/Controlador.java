/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author educu
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Gui;
import modelo.Consulta;

public class Controlador  implements ActionListener {
    
    private Modelo modelo;
    private Gui vista;

    public Controlador(Modelo modelo, Gui vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.botonAgregar.addActionListener(this);
    }
    
  
    @Override
    public void actionPerformed(ActionEvent e) {
        //cargar los datos en el modelo
        modelo.setId(vista.textoId.getText());
        modelo.setNombre(vista.textoNombre.getText());
        modelo.setTemperatura(Double.parseDouble(vista.textoTemperatura.getText()));
        modelo.setValorBase(Double.parseDouble(vista.textoValorBase.getText()));
        Consulta consulta = new Consulta();
        consulta.registrar(modelo);
    } 
}

