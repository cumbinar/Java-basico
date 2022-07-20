/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author educu
 */
public class Consulta {
    
    private ConexionDb conexion;
    
    public Consulta(ConexionDb conexion){
        this.conexion = conexion;
    }
    
    public void insertarRegistro(String nombre, float temperatura, int valorBase) {
        String query = "INSERT INTO productos (nombre, temperatura, valorBase) "
                + "VALUES (\"" + nombre + "\", " + temperatura + ", " + valorBase + ");";
        
        conexion.ejecutarQuery(query);
    }

}

