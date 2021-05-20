/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import co.edu.unipiloto.usuario.entity.PersonalVacunacion;
import co.edu.unipiloto.usuario.entity.Sitio;
import co.edu.unipiloto.usuario.session.PersonalVacunacionFacadeLocal;
import co.edu.unipiloto.usuario.session.SitioFacadeLocal;
import static java.lang.Integer.parseInt;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Fabian
 */
@WebServlet(name = "PersonalVL", urlPatterns = {"/PersonalVL"})
public class PersonalVL extends HttpServlet {

    @EJB
    private SitioFacadeLocal sitioFacade;

    @EJB
    private PersonalVacunacionFacadeLocal personalVacunacionFacade;

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
            PersonalVacunacion pv = personalVacunacionFacade.find(Integer.parseInt(user));
            
             String action = request.getParameter("action");
             String sitio = request.getParameter("sitio");
             
             int idsitio= parseInt(sitio);
             Sitio st=sitioFacade.find(idsitio);
             if (request.getParameter("action").equals("Asignar")) {
                     pv.setIdSitio(st);
                }
             personalVacunacionFacade.edit(pv);
             out.print("<script type=\"text/javascript\">\n" + " alert(\"Se ha modifica la informacion correctamente \");\n" + "</script>");
             mostrarMenu(out);   
             }
       
        }
    public void mostrarMenu(PrintWriter out){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userInfo</title>");           
            out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/menuInfo3.jsp\" />");
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

    


