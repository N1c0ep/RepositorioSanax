/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.usuario.entity.Usuariosnuevos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import co.edu.unipiloto.usuario.session.UsuariosnuevosFacadeLocal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolás Estévez
 */
@WebServlet(name = "ActInfo", urlPatterns = {"/ActInfo"})
public class ActInfo extends HttpServlet {
    //Usuariosnuevos user;

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
     * @throws java.text.ParseException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            HttpSession objsession = request.getSession(false);
            String user = (String) objsession.getAttribute("id1");

            Usuariosnuevos us = usuariosnuevosFacade.find(Integer.parseInt(user));
           
            String action = request.getParameter("action");
            String firstName = request.getParameter("firstname");
            String lastName = request.getParameter("lastname");
            String localidad = request.getParameter("location");
            String direccion = request.getParameter("direccion");
            String correo = request.getParameter("email");
            String telefonoStr = request.getParameter("telephone");
            String Fechanacimiento = request.getParameter("birth");
            String tipo = request.getParameter("tipo");
//            String idStr = request.getParameter("id");
//            Integer id = 0;
            if (request.getParameter("action").equals("Actualizar")) {

                
//            if (idStr != null && !idStr.equals("")) {
//                id = Integer.parseInt(idStr);
//            }
                if (firstName != null && !firstName.equals("")) {
                    us.setNombre(firstName);
                }
                else{
                    us.setNombre(us.getNombre());
                }
                if (lastName != null && !lastName.equals("")) {
                    us.setApellido(lastName);
                }
                else{
                    us.setApellido(us.getApellido());
                }
                if (localidad != null && !localidad.equals("")) {
                    us.setLocalidad(localidad);
                }
                else{
                    us.setLocalidad(us.getLocalidad());
                }
                if (direccion != null && !direccion.equals("")) {
                    us.setDireccion(direccion);
                }
                else{
                    us.setDireccion(us.getDireccion());
                }
                if (correo != null && !correo.equals("")) {
                    us.setCorreo(correo);
                }
                else{
                   us.setCorreo(us.getCorreo());
                }
                if (telefonoStr != null && !telefonoStr.equals("")) {
                    us.setTelefono(telefonoStr);
                }
                else{
                    us.setTelefono(us.getTelefono());
                    System.out.println(us.getTelefono());
                }
                if (Fechanacimiento != null && !Fechanacimiento.equals("")) {
                    DateFormat fechaHora = new SimpleDateFormat("yyyy/MM/dd");
                    Date convertido = fechaHora.parse(Fechanacimiento);
                    us.setFecha(convertido);
                }
                else{
                    us.setFecha(us.getFecha());
                }
                if (tipo != null && !tipo.equals("")) {
                    us.setTipoDocumento(tipo);
                }
                else{
                    us.setTipoDocumento(us.getTipoDocumento());
                }
                usuariosnuevosFacade.edit(us);
                out.print("<script type=\"text/javascript\">\n" + " alert(\"Se ha modifica la cita correctamente \");\n" + "</script>");
                mostrarMenu(out);
            }

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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ActInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ActInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
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
