/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Student
 */
public class Login1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre;
        String apellido;

        //recuperamos los datos del formulario
        nombre = request.getParameter("NOMBRE");
        apellido = request.getParameter("APELLIDO");

        HttpSession sesion = request.getSession();
        sesion.setAttribute("usSesion", nombre);
        sesion.setAttribute("claveSesion", apellido);

        response.setContentType("text/html");
        //Mostramos los  valores en el cliente
        PrintWriter out = response.getWriter();

        out.println("<a href=\"/PracticaSession/catalogo.jsp\"> Link al catalogo del carrito  </a>");
        out.println("<br>");
        out.println("ID de la sesi&oacute;n: " + sesion.getId());
    }
    
}
