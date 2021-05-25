/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.usuario.entity.InventarioVacunas;
import co.edu.unipiloto.usuario.entity.Sitio;
import co.edu.unipiloto.usuario.entity.VacunaInv;
import co.edu.unipiloto.usuario.entity.VacunaInvnac;
import co.edu.unipiloto.usuario.session.InventarioNacionalFacadeLocal;
import co.edu.unipiloto.usuario.session.InventarioVacunasFacadeLocal;
import co.edu.unipiloto.usuario.session.SitioFacadeLocal;
import co.edu.unipiloto.usuario.session.VacunaInvFacadeLocal;
import co.edu.unipiloto.usuario.session.VacunaInvnacFacadeLocal;
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
@WebServlet(name = "AsignaVac", urlPatterns = {"/AsignaVac"})
public class AsignaVac extends HttpServlet {

    @EJB
    private InventarioNacionalFacadeLocal inventarioNacionalFacade;

    @EJB
    private InventarioVacunasFacadeLocal inventarioVacunasFacade;

    @EJB
    private SitioFacadeLocal sitioFacade;

    @EJB
    private VacunaInvnacFacadeLocal vacunaInvnacFacade;

    @EJB
    private VacunaInvFacadeLocal vacunaInvFacade;

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

            HttpSession objsession = request.getSession(false);
            String user = (String) objsession.getAttribute("id1");

            String action = request.getParameter("action");

            int idsitio = Integer.parseInt(request.getParameter("sitiosVac"));
            int idvacuna = Integer.parseInt(request.getParameter("vacunas"));
            int canti = Integer.parseInt(request.getParameter("cantidad"));

            //cantidad ingresada es mayor a 0
            if (canti > 0) {
                if (request.getParameter("action").equals("Asignar")) {

                    int c1 = 0, c2 = 0, c3=0;
                    VacunaInv vacunainv = null;
                    VacunaInvnac vacuna = vacunaInvnacFacade.find(idvacuna);
                    InventarioVacunas inv;
                    Sitio sitio = sitioFacade.find(idsitio);
                    //Buscar en todo el inventario nacional 
                    for (InventarioVacunas in : sitio.getInventarioVacunasCollection()) {
                            
                        //Si el sitio que ingreso el usuario existe dentro del inventario vacunas
                        if (in.getIdSitio().getIdSitio() == idsitio) {
                            inv = in; //inventarioVacunasFacade.find(in.getIdInventario());
                            
                            //si la cantidad de vacunas existentes en el inv nacional son mayores a la que ingreso el usuario
                            if (vacuna.getCantidad() >= canti) {
                                // Busca todos los objetos en inventario
                                for (VacunaInv ob : in.getVacunaInvCollection()) {
                                    //Si las vacunas son iguales solo actualice la cantidad
                                    if (ob.getDistribuidor().equals(vacuna.getMarca()) && ob.getVencimiento().equals(vacuna.getVencimiento()) && ob.getLote() == vacuna.getLote()) {
                                        ob.setCantidad(ob.getCantidad() + canti);
                                        vacunaInvFacade.edit(ob);
                                        c1 = 1;
                                        break;
                                    }
                                }//Si no encuentra ningun objeto igual en inventario lo crea y resta la cantidad de inentario nacional
                                vacunainv = new VacunaInv(vacuna.getMarca(), vacuna.getLote(), vacuna.getVencimiento(), canti, inv);
                                vacuna.setCantidad(vacuna.getCantidad() - canti);
                                c2 = 1;
                                break;
                            } else {//Si ingreso una cantidad mayor a la que hay disponible
                                out.print("<script type=\"text/javascript\">\n" + " alert(\"La cantidad que quiere asignar es mas de lo que existe, digite nueva cantidad \");\n" + "</script>");
                                out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/AsignacionVac.jsp\" />");  
                                c3=1;
                                break;  
                            }
                        }
                    }
                    if (c2 == 0) {//cuando no encuentra un inv asociado al sitio que ingreso el usuario
                        if (vacuna.getCantidad() >= canti) {
                            inv = new InventarioVacunas(inventarioNacionalFacade.find(1), sitio);
                            inventarioVacunasFacade.create(inv);
                            vacunainv = new VacunaInv(vacuna.getMarca(), vacuna.getLote(), vacuna.getVencimiento(), canti, inv);
                            vacuna.setCantidad(vacuna.getCantidad() - canti);
                        } else if(c3==0){
                            out.print("<script type=\"text/javascript\">\n" + " alert(\"La cantidad que quiere asignar es mas de lo que existe, digite nueva cantidad \");\n" + "</script>");
                            out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/AsignacionVac.jsp\" />");
                        }
                    }
                    
                    if (c1 == 0) {//crea el objeto en caso de no existencia antes
                        vacunaInvFacade.create(vacunainv);
                    }
                    //Al final edita el invnetario nacional con la cantidad restada
                    vacunaInvnacFacade.edit(vacuna);
                    out.print("<script type=\"text/javascript\">\n" + " alert(\"La asignación fue exitosa \");\n" + "</script>");
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/AsignacionVac.jsp\" />");
                }else{
                    out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/menuInfo2.jsp\" />");
                }
            } else {
                out.print("<script type=\"text/javascript\">\n" + " alert(\"La cantidad de vacunas debe ser mayor a 0, digite una nueva cantidad \");\n" + "</script>");
                out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/AsignacionVac.jsp\" />");
            }
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AsignaVac</title>");            
            out.println("</head>");
            out.println("<body>");
//            out.println("<h1>Servlet AsignaVac at " + request.getContextPath() + "</h1>");
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
