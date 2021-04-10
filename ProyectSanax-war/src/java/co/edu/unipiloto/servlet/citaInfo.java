/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.usuario.entity.Cita;
import co.edu.unipiloto.usuario.entity.Usuariosnuevos;
import co.edu.unipiloto.usuario.session.CitaFacadeLocal;
import co.edu.unipiloto.usuario.session.SitioFacadeLocal;
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
@WebServlet(name = "citaInfo", urlPatterns = {"/citaInfo"})
public class citaInfo extends HttpServlet {

    @EJB
    private SitioFacadeLocal sitioFacade;

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
            String action = request.getParameter("action");          
            String faseStr = request.getParameter("fase");
            String fechaStr = request.getParameter("fecha");
            String horaStr = request.getParameter("hora");
            String iduserStr = request.getParameter("iduser");
            
            Integer iduser=0;
            
            if (iduserStr != null && !iduserStr.equals("")) {
                iduser = Integer.parseInt(iduserStr);
            }

            // System.out.println(fechaStr+" "+ horaStr+" "+ idStr + " " + faseStr);
              Usuariosnuevos user = null;
              
            if (request.getParameter("action").equals("Add")) {
                for (Usuariosnuevos us : usuariosnuevosFacade.findAll()) {
                    if (us.getId() == iduser) {
                        user = us; 
                        break;
                    }
                }
                
                if (user == null) {
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"No se ha asignado la cita correctamente\");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/AgendarInfo.jsp\" />");
                } else {
                    Cita cita = new Cita(fechaStr, horaStr, faseStr, sitioFacade.find(1), user);
                    citaFacade.create(cita);
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"Se ha asignado la cita correctamente \");\n" + "</script>");
                    mostrarMenu(out);
                }
            }
            //System.out.println(nuevcita.getFase()+" "+nuevcita.getFecha()+" "+ nuevcita.getHora()+" "+ nuevcita.getIdcita());
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
