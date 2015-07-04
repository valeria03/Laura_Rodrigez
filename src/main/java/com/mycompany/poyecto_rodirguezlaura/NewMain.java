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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("sql");
        Evaluacion e =new Evaluacion();
        
       ;
        e.setNombre("Ana");
        e.setCalificaion("7");
 
        
     DAOEvaluacion daou=new DAOEvaluacion();
     daou.guardar(e);
    }
    
}
