/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.usuario.entity.CitaPK;
import co.edu.unipiloto.usuario.session.CitaFacadeLocal;
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
@WebServlet(name = "ConsuInf", urlPatterns = {"/ConsuInf"})
public class ConsuInf extends HttpServlet {

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
            
            String action = request.getParameter("action");           
            String buscarStr = request.getParameter("buscar");
            String idStr = request.getParameter("id");
            Integer buscar = 0;
            Integer id = 0;
            
            
            if (buscarStr != null && !buscarStr.equals("")) {
                buscar = Integer.parseInt(buscarStr);
            }
            if (idStr != null && !idStr.equals("")) {
                id = Integer.parseInt(idStr);
            }
            
            CitaPK pk = new CitaPK(buscar,id);
            System.out.println(id + " " + buscar);
             
            if (request.getParameter("action").equals("Search")) {
                citaFacade.consultarCita(pk);
            }
            
            //Poner boton cancelar e ir a menu con un form que solo contenga las 2 clases de cancelar y menu
            
            request.setAttribute("buscarCita", pk);
            //request.setAttribute("row", citaFacade.findAll());
            request.getRequestDispatcher("ConsultarInfo.jsp").forward(request,response);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConsuInf</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConsuInf at " + request.getContextPath() + "</h1>");
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