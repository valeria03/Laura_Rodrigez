/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poyecto_rodirguezlaura;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-107
 */
@WebServlet(name = "ServletExamen", urlPatterns = {"/resultados"})
public class ServletExamen extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Evaluacion e=new Evaluacion();
        e.setNombre(request.getParameter("nombre"));
        e.setCalificaion(request.getParameter("califiacion"));
     
        DAOEvaluacion dao=new DAOEvaluacion();
       
        try {
            dao.guardar(e);
              out.println("Usuario guardado");
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
      
}
}
     
       