/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.usuario.entity.Usuariosnuevos;
import co.edu.unipiloto.usuario.session.UsuariosnuevosFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jorge_j3qr4sd
 */
@WebServlet(name = "ConfirmacionCod", urlPatterns = {"/ConfirmacionCod"})
public class ConfirmacionCod extends HttpServlet {

    @EJB
    private UsuariosnuevosFacadeLocal usuariosnuevosFacade;

    
    
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        int id= Integer.parseInt(request.getParameter("id"));
        String contraseña= request.getParameter("contra");
        String contraseña2= request.getParameter("contra2");
        int codigo= Integer.parseInt(request.getParameter("codigo"));
        Usuariosnuevos us = usuariosnuevosFacade.find(id);
        
        
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if (request.getParameter("action").equals("confirmar")) {

                if (us == null) {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Ese usuario no se encuentra digite otro id \");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/Recupera.jsp\" />");
                } else if (codigo == us.getAleatorio()) {
                    if (!contraseña.equals(contraseña2)) {
                        out.print("<script type=\"text/javascript\">\n" + " alert(\"La contraseñas no coinciden, ingrese una nueva \");\n" + "</script>");
                        out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/Codigo.jsp\" />");
                    } else {
                        us.setContrasena(contraseña);
                        usuariosnuevosFacade.edit(us);
                    }
                } else {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Codigo de confirmación no equivale al enviado, ingrese el correcto \");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/Codigo.jsp\" />");
                }
            }
            out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/index.html\" />");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConfirmacionCod</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConfirmacionCod at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
