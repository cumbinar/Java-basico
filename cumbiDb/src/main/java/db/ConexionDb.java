/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; //La clase que va a recibir los datos de consultas
import java.sql.SQLException;
import java.sql.Statement; //para crear sentencias SQL

/**
 *
 * @author educu
 */
public class ConexionDb {

    private Connection connection;
    
    public ConexionDb(){
        connect(); //abro el archivo .db con la base de datos
    }
    
    private void connect() {
        /**
         * Este método va a ir al archivo .db y cargarlo en un objeto de la
         * clase Connection
         */
        connection = null;
        try {
            String path = "jdbc:sqlite:Cumbi.db"; //nombre de la db a abrir
            connection = DriverManager.getConnection(path); //obtiene la conexion en el objeto connection
        } catch (SQLException e) { //para evitar que el programa se detenga si hay algún error
            System.out.println(e.getMessage());
        }
    }

    public ResultSet ejecutarQuery(String query) {
        /**
         * Este método recibe una query (consulta) en formato string y la
         * ejecuta en la base de datos.
         */
        ResultSet result = null;
        try {
            Statement stmt = connection.createStatement();
            result = stmt.executeQuery(query); //ejecuto la query en la db
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

}
