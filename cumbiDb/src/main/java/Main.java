/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import db.ConexionDb;

/**
 *
 * @author educu
 */


public class Main {
    
     public static void main(String[] args) throws ClassNotFoundException {
       
        Class.forName("org.sqlite.JDBC");
       
        ConexionDb conexion = new ConexionDb();
       
        String query = "INSERT INTO productos (nombre, temperatura, valorBase) VALUES (\"Stendra\", 15, 5555550);";
      
        
        conexion.ejecutarQuery(query);
        
        
        
       
    }
    
}
