/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.usuario.entity.Administrador;
import co.edu.unipiloto.usuario.entity.Cita;
import co.edu.unipiloto.usuario.entity.DistribuidorVacunas;
import co.edu.unipiloto.usuario.entity.PersonalVacunacion;
import co.edu.unipiloto.usuario.entity.Usuariosnuevos;
import co.edu.unipiloto.usuario.session.AdministradorFacadeLocal;
import co.edu.unipiloto.usuario.session.DistribuidorVacunasFacadeLocal;
import co.edu.unipiloto.usuario.session.PersonalVacunacionFacadeLocal;
import co.edu.unipiloto.usuario.session.UsuariosnuevosFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jorge_j3qr4sd
 */
@WebServlet(name = "registroInfo", urlPatterns = {"/registroInfo"})
public class registroInfo extends HttpServlet {

    @EJB
    private AdministradorFacadeLocal administradorFacade;

    @EJB
    private PersonalVacunacionFacadeLocal personalVacunacionFacade;

    @EJB
    private DistribuidorVacunasFacadeLocal distribuidorVacunasFacade;

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            // String action = request.getParameter("action");
            // String correo = request.getParameter("email");
            String contrasena = request.getParameter("contra");
            String id = request.getParameter("id1");
            String lista = request.getParameter("lista");
            HttpSession objsession = request.getSession(true);

            Integer ids = Integer.parseInt(id);
            objsession.setAttribute("id1", id);

            String user = (String) objsession.getAttribute("id1");

            //if (request.getParameter("action").equals("Login")) {
            //}
            if (request.getParameter("lista").equals("Usuario de vacunacion")) {

                Usuariosnuevos us = usuariosnuevosFacade.find(Integer.parseInt(user));
                if (usuariosnuevosFacade.find(ids) == null) {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Su usuario no existe, no se ha podido loguear\");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/index.html\" />");
                } else if (!contrasena.equals(us.getContrasena())) {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Contraseña incorrecta\");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/index.html\" />");
                } else {
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/UsuarioVacunacion.jsp\" />");
                }
            } else if (request.getParameter("lista").equals("Distribuidor de vacunas")) {
                DistribuidorVacunas dist = distribuidorVacunasFacade.find(Integer.parseInt(user));
                if (distribuidorVacunasFacade.find(ids) == null) {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Su usuario no existe, no se ha podido loguear\");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/index.html\" />");
                } else if (!contrasena.equals(dist.getContrasena())) {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Contraseña incorrecta\");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/index.html\" />");
                } else {
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/DistribuidorVacuna.jsp\" />");
                }
            } else if (request.getParameter("lista").equals("Personal de vacunacion")) {
                PersonalVacunacion per = personalVacunacionFacade.find(Integer.parseInt(user));
                if (personalVacunacionFacade.find(ids) == null) {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Su usuario no existe, no se ha podido loguear\");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/index.html\" />");
                } else if (!contrasena.equals(per.getContrasena())) {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Contraseña incorrecta\");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/index.html\" />");
                } else {
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/PersonalVacunacion.jsp\" />");
                }
            } else if (request.getParameter("lista").equals("Representante de sitio")) {
                Administrador ad = administradorFacade.find(Integer.parseInt(user));
                if (administradorFacade.find(ids) == null) {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Su usuario no existe, no se ha podido loguear\");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/index.html\" />");
                } else if (!contrasena.equals(ad.getContrasena())) {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Contraseña incorrecta\");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/index.html\" />");
                } else {
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/RepresentanteSitio.jsp\" />");
                }
            }
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
