/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.usuario.entity.Cita;
import co.edu.unipiloto.usuario.entity.InventarioVacunas;
import co.edu.unipiloto.usuario.entity.Sitio;
import co.edu.unipiloto.usuario.entity.Usuariosnuevos;
import co.edu.unipiloto.usuario.entity.VacunaInv;
import co.edu.unipiloto.usuario.session.CitaFacadeLocal;
import co.edu.unipiloto.usuario.session.SitioFacadeLocal;
import co.edu.unipiloto.usuario.session.UsuariosnuevosFacadeLocal;
import co.edu.unipiloto.usuario.session.VacunaInvFacadeLocal;
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
@WebServlet(name = "ConsuEstVac", urlPatterns = {"/ConsuEstVac"})
public class ConsuEstVac extends HttpServlet {

    @EJB
    private VacunaInvFacadeLocal vacunaInvFacade;

    @EJB
    private SitioFacadeLocal sitioFacade;

    

    
    
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

            
            int idsitio = Integer.parseInt(request.getParameter("sitiosVac"));
     
            int can=0;
            
            if (request.getParameter("action").equals("Consultar")) {
                ArrayList<Integer> col = new ArrayList<Integer>();
                String marc="";
                for (VacunaInv in : vacunaInvFacade.findAll()) {
                    if (in.getIdInventario().getIdSitio().getIdSitio() == idsitio) {                                                                    
                        can+=in.getCantidad();
                        marc+=in.getDistribuidor() + in.getCantidad() + "\n";
                    }                  
                }
                col.add(can);
                
                
                //System.out.println(va.getCantidad()+ "//////////////////////////////////////");
//                if (sit != null) {
                request.setAttribute("cantidad", col);
                
                request.getRequestDispatcher("ConsultarEstVac.jsp").forward(request, response);
//                } else {
//                    out.print("<script type=\"text/javascript\">\n" + " alert(\"El sitio no existe \");\n" + "</script>");
//                }/// ESTADO ACTUAL DE PRODUCTOS DE LA CALIDAD EN COMIDA PARA MASCOTAS
            }
//<% VacunaInv vacun = (VacunaInv) request.getAttribute("cantidad");%>
//            <table>
//                <tr>
//                    <td>Cantidad:</td>
//                    <td><input type="text" size="20" name="canti" value="<%= vacun.getIdVacuna()   %>"></td>
//                </tr>
//            </table>
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