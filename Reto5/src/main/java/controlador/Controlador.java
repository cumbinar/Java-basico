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
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import modelo.Modelo;
import vista.Gui;
import modelo.Consulta;

public class Controlador implements ActionListener {

    private Modelo modelo;
    private Gui vista;

    public Controlador(Modelo modelo, Gui vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.botonAgregar.addActionListener(this);
        this.vista.botonEliminar.addActionListener(this);
        this.vista.botonConsultar.addActionListener(this);
        this.vista.botonActualizar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //cargar los datos en el modelo

        Consulta consulta = new Consulta();
        if (e.getSource() == vista.botonAgregar) { //obtengo la fuente del evento (que boton fue accionado)
            modelo.setId(vista.textoId.getText());
            modelo.setNombre(vista.textoNombre.getText());
            modelo.setTemperatura(Double.parseDouble(vista.textoTemperatura.getText()));
            modelo.setValorBase(Double.parseDouble(vista.textoValorBase.getText()));
            consulta.registrar(modelo);
        } else if (e.getSource() == vista.botonEliminar) {
            modelo.setId(vista.textoId.getText());
            modelo.setNombre("");
            modelo.setTemperatura(0);
            modelo.setValorBase(0);
            consulta.eliminar(modelo);
        } else if (e.getSource() == vista.botonConsultar) {
            ArrayList<Modelo> modelos = consulta.consultar();
            var modeloTabla = (DefaultTableModel) vista.table.getModel();
            modeloTabla.setRowCount(0);
            for (Modelo producto : modelos) {
                modeloTabla.addRow(new Object[]{producto.getId(), producto.getNombre(),
                producto.getTemperatura(), producto.getValorBase()});
            }
        } else if (e.getSource() == vista.botonActualizar){
          modelo.setId(vista.textoId.getText());
            modelo.setNombre(vista.textoNombre.getText());
            modelo.setTemperatura(Double.parseDouble(vista.textoTemperatura.getText()));
            modelo.setValorBase(Double.parseDouble(vista.textoValorBase.getText()));
            consulta.actualizar(modelo);
        }
    }
}
