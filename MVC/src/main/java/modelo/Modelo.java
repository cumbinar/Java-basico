/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author educu
 */
public class Modelo {

    private float numeroUno;
    private float numeroDos;
    private float resultado;

    public Modelo(float numeroUno, float numeroDos, float resultado) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
        this.resultado = resultado;
    }

    public float getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(float numeroUno) {
        this.numeroUno = numeroUno;
    }

    public float getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(float numeroDos) {
        this.numeroDos = numeroDos;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    //En el modelo también van las lógicas de generación de valores a los datos
    public void multiplicar() {
        resultado = numeroUno * numeroDos; //lógica del programa (reglas de negocio)
    }
}
