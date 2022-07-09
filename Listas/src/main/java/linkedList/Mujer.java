/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedList;
import java.util.LinkedList;
/**
 *
 * @author educu
 */
public class Mujer extends Humano implements accionesHumanas{
    
    private String nombre;
    private LinkedList<String> cursos;

    public Mujer(String nombre, String cedula) {
        super(cedula);
        this.nombre = nombre;
        cursos = new LinkedList();
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<String> getCursos() {
        return cursos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCursos(LinkedList<String> cursos) {
        this.cursos = cursos;
    }
    
    public void agregarCursos(String curso){
        cursos.add(curso);
    }
    
    public void mostrarCursos(){
        System.out.println("Los Cursos son");
        
        for(String curso:cursos){
            System.out.println(curso);
        }
    }
    @Override
    public void trabajar(){
        System.out.println("La Mujer está trabajando");
    }
    
    @Override
    public void estudiar(){
        System.out.println("La Mujer está estudiando");
    }
    
    
}
