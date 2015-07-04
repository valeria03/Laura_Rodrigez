/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poyecto_rodirguezlaura;

/**
 *
 * @author T-107
 */
public class Evaluacion {
    
    String nombre;
    Float calificaion;

    Evaluacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getCalificaion() {
        return calificaion;
    }

    public void setCalificaion(Float calificaion) {
        this.calificaion = calificaion;
    }

    public Evaluacion(String nombre, Float calificaion) {
        this.nombre = nombre;
        this.calificaion = calificaion;
    }
}
