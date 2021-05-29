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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "userInfo", urlPatterns = {"/userInfo"})
public class userInfo extends HttpServlet {
    Usuariosnuevos user;
    @EJB
    public UsuariosnuevosFacadeLocal usuariosnuevosFacade;

    
    
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
            Date convertido;
            String action = request.getParameter("action");
            String firstName = request.getParameter("firstname");
            String lastName = request.getParameter("lastname");           
            String localidad = request.getParameter("location");
            String direccion = request.getParameter("direccion");
            String correo = request.getParameter("email");
            String telefonoStr = request.getParameter("telephone");
            String Fechanacimiento = request.getParameter("birth");
            String año = Fechanacimiento.replaceAll("/", "-");
            String contrasena = request.getParameter("contra");
            String confirmacion = request.getParameter("confirma");
            String tipo = request.getParameter("tipo");
            String comorbilidad = request.getParameter("comor");
            String prof = request.getParameter("profesion");
            DateFormat fechaHora = new SimpleDateFormat("yyyy/MM/dd");
            convertido = fechaHora.parse(Fechanacimiento);
            int dosis = 0;
            int age = Period.between(LocalDate.parse(año, DateTimeFormatter.ofPattern("y-M-d")), LocalDate.now()).getYears();
            String idStr = request.getParameter("id");
            Integer id = 0;

            if (idStr != null && !idStr.equals("")) {
                id = Integer.parseInt(idStr);
            }

            if (!contrasena.equals(confirmacion)) {
                out.print("<script type=\"text/javascript\">\n" + " alert(\"Contraseñas no coinciden\");\n" + "</script>");
                out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/Registrarse.jsp\" />");
            } else if (age >= 80 || prof.equals("Doctor") || prof.equals("Medico") || prof.equals("Enfermero") || prof.equals("Enfermera") || prof.equals("Auxiliares de enfermeria") || prof.equals("Personal de vacunacion")) {
                user = new Usuariosnuevos(id, firstName, lastName, correo, convertido, localidad, telefonoStr, contrasena, tipo, direccion, dosis, prof, "Fase 1, etapa 1");

                if (request.getParameter("action").equals("Add")) {
                    usuariosnuevosFacade.create(user);
                    mostrarMenu(out);
                }
            } else if ((age <= 79 && age >= 60) || prof.equals("Medico interno") || prof.equals("Estudiante de medicina")) {
                user = new Usuariosnuevos(id, firstName, lastName, correo, convertido, localidad, telefonoStr, contrasena, tipo, direccion, dosis, prof, "Fase 1, etapa 2");

                if (request.getParameter("action").equals("Add")) {
                    usuariosnuevosFacade.create(user);
                    mostrarMenu(out);
                }
            } else if (((age <= 59 && age >= 16) && (prof.equals("Docente") || prof.equals("ICBF") || prof.equals("Fuerza militar") || prof.equals("Policia"))) && (comorbilidad.equals("Hipertenso") || comorbilidad.equals("Diabetes") || comorbilidad.equals("Insuficiencia renal") || comorbilidad.equals("VIH") || comorbilidad.equals("Cancer") || comorbilidad.equals("Tuberculosis") || comorbilidad.equals("EPOC") || comorbilidad.equals("ASMA") || comorbilidad.equals("Obesidad") || comorbilidad.equals("Necesita transplante de organos"))) {
                user = new Usuariosnuevos(id, firstName, lastName, correo, convertido, localidad, telefonoStr, contrasena, tipo, direccion, dosis, prof, "Fase 1, etapa 3");

                if (request.getParameter("action").equals("Add")) {
                    usuariosnuevosFacade.create(user);
                    mostrarMenu(out);
                }
            } else if ((age <= 59 && age >= 16) && ((prof.equals("Bombero") || prof.equals("Vagabundo")) && (comorbilidad.equals("Hipertenso") || comorbilidad.equals("Diabetes") || comorbilidad.equals("Insuficiencia renal") || comorbilidad.equals("VIH") || comorbilidad.equals("Cancer") || comorbilidad.equals("Tuberculosis") || comorbilidad.equals("EPOC") || comorbilidad.equals("ASMA") || comorbilidad.equals("Obesidad") || comorbilidad.equals("Necesita transplante de organos")))) {
                user = new Usuariosnuevos(id, firstName, lastName, correo, convertido, localidad, telefonoStr, contrasena, tipo, direccion, dosis, prof, "Fase 1, etapa 4");

                if (request.getParameter("action").equals("Add")) {
                    usuariosnuevosFacade.create(user);
                    mostrarMenu(out);
                }
            } else if (age <= 59 && age >= 16 && comorbilidad.equals("Ninguna")) {
                user = new Usuariosnuevos(id, firstName, lastName, correo, convertido, localidad, telefonoStr, contrasena, tipo, direccion, dosis, prof, "Fase 1, etapa 5");

                if (request.getParameter("action").equals("Add")) {
                    usuariosnuevosFacade.create(user);
                    mostrarMenu(out);
                }
            }
        
//            request.setAttribute("user", user);
//            request.setAttribute("allStudents", usuariosnuevosFacade.findAll());
//            request.getRequestDispatcher("userInfo.jsp").forward(request, response);
            
            
        } catch (ParseException ex) {
            Logger.getLogger(userInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public void mostrarMenu(PrintWriter out){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userInfo</title>");           
            out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/index.html\" />");
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
