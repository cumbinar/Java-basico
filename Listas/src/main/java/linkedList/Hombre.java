/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedList;

/**
 *
 * @author educu
 */
public class Hombre extends Humano implements accionesHumanas{
   
    private String nombre;

    public Hombre(String nombre, String cedula) {
        super(cedula);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void trabajar(){
        System.out.println("El Hombre está trabajando");
    }
    
    @Override
    public void estudiar(){
        System.out.println("El Hombre está estudiando");
    }
    
    
}
