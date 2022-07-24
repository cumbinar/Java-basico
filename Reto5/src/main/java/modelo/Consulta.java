/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author educu
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
   // public void actualizar(Modelo producto) {
   //     System.out.println("Hola actualizar");
   //     String query = "UPDATE INTO productos (id, nombre,temperatura,valorBase)"
   //             + " VALUES (" + producto.getId() + ",\"" + producto.getNombre()
   //             + "\"," + producto.getTemperatura() + "," + producto.getValorBase()
   //             + ");";

    //    ejecutarQuery(query);
   // 
    
      public void actualizar(Modelo producto) {
        System.out.println("Hola actualizar");
          String query="update productos set"
                + " nombre= '"+producto.getNombre()+ "', temperatura= "+producto.getTemperatura()+" "
                + ",valorBase= "+producto.getValorBase()+ " where id = '"+producto.getId()+ "' ;  ";

        ejecutarQuery(query);
    
      }

    public void eliminar(Modelo producto) {
        String query = "DELETE FROM productos WHERE id=" + producto.getId() + ";";
        ejecutarQuery(query);
    }
    
    

    public ArrayList<Modelo> consultar() {

        String query = "SELECT * FROM productos";
        ResultSet resultado = ejecutarQuery(query);
        ArrayList<Modelo> productos = new ArrayList<>();

        try {
            while (resultado.next()) {
                Modelo modelo = new Modelo();
                modelo.setId(String.valueOf(resultado.getInt("id")));
                modelo.setNombre(resultado.getString("nombre"));
                modelo.setTemperatura(resultado.getDouble("temperatura"));
                modelo.setValorBase(resultado.getDouble("valorBase"));
                productos.add(modelo);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return productos;
    }

}
