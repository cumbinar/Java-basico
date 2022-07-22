/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author educu
 */
public class Consulta extends ConexionDb {

    public Consulta() {
        super();
    }

    public void registrar(Modelo producto) {

        String query = "INSERT INTO productos (id, nombre,temperatura,valorBase)"
                + " VALUES (" + producto.getId() + ",\"" + producto.getNombre()
                + "\"," + producto.getTemperatura() + "," + producto.getValorBase()
                + ");";

        ejecutarQuery(query);
    }

}
