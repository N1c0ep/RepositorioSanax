/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.usuario.entity.Cita;
import co.edu.unipiloto.usuario.entity.Usuariosnuevos;
import co.edu.unipiloto.usuario.session.CitaFacadeLocal;
import co.edu.unipiloto.usuario.session.UsuariosnuevosFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "ConsuInf", urlPatterns = {"/ConsuInf"})
public class ConsuInf extends HttpServlet {

    @EJB
    private UsuariosnuevosFacadeLocal usuariosnuevosFacade;

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
            String user = (String) objsession.getAttribute("id1");

            //Integer lo=Integer.parseInt(user);            
            String action = request.getParameter("action");
            //String idStr = request.getParameter("id");
            if (request.getParameter("action").equals("Cancelar")) {
                mostrarMenu2(out);
            } else if (request.getParameter("action").equals("Menu")) {
                mostrarMenu(out);
            } else {
                Usuariosnuevos us = usuariosnuevosFacade.find(Integer.parseInt(user));

                Cita cita = null;
                ArrayList<Cita> lista = new ArrayList<>();
                //if (request.getParameter("action").equals("Search")) {
                for (Cita c : citaFacade.findAll()) {
                    if (c.getIdentificacion().getId() == us.getId()) {
                        cita = c;
                        lista.add(cita);
                    }
                }
                    // }
                    //System.out.println(lista.get(0) + "///////////////////////////////" + lista.get(1));
                    request.setAttribute("rows", lista);
                    request.getRequestDispatcher("ConsultarInfo.jsp").forward(request, response);
                    mostrarMenu(out);              
            }
       //System.out.println(cita.getFase() +" "+ cita.getFecha() +" "+ cita.getIdCita() +" "+ cita.getHora() );
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
    
     public void mostrarMenu2(PrintWriter out){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userInfo</title>");           
            out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/CancelarInfo.jsp\" />");
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
