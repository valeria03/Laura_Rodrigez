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
         System.out.println("Probaremos todas las operaciones sql");
        Evaluacion u=new Evaluacion();
        
       ;
        u.setNombre("Ana");
        u.setCalificaion("ana2");
 
        
     DAOUsuario daou=new DAOUsuario();
     daou.guardar(u);
    }
    
}
