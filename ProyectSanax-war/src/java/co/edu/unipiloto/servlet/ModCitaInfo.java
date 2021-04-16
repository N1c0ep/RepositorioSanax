/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.usuario.entity.Cita;
import co.edu.unipiloto.usuario.session.CitaFacadeLocal;
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
 * @author dlpol
 */
@WebServlet(name = "ModCitaInfo", urlPatterns = {"/ModCitaInfo"})
public class ModCitaInfo extends HttpServlet {
    
    @EJB
    private CitaFacadeLocal citaFacade;

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
            
            HttpSession objsession = request.getSession(false);
            String cita = (String) objsession.getAttribute("id1");
            String action = request.getParameter("action");
            
            Cita ci = citaFacade.find(Integer.parseInt(cita));
            
            String faseStr = request.getParameter("fase");
            String fechaStr = request.getParameter("fecha");
            String horaStr = request.getParameter("hora");
            
            if (faseStr != null && !faseStr.equals("")) {
                ci.setFase(faseStr);
            }
            else{
                ci.setFase(ci.getFase());
            }
            if (fechaStr != null && !fechaStr.equals("")) {
                ci.setFecha(fechaStr);
            }
            else{
                ci.setFecha(ci.getFecha());
            }
            if (horaStr != null && !horaStr.equals("")) {
                ci.setHora(horaStr);
            }
            else{
                ci.setHora(ci.getHora());
            }
            citaFacade.edit(ci);
            mostrarMenu(out);
        }
    }
    public void mostrarMenu(PrintWriter out){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userInfo</title>");           
            out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/menuInfo.jsp\" />");
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet userInfo at " + request.getContextPath() + "</h1>");
            //out.println("<h1>Ha sido registrado con exito, felicitaciones<h1/>");
            out.println("</body>");
            out.println("</html>");
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
