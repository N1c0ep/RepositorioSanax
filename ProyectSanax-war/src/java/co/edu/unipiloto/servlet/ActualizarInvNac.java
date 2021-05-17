/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.usuario.entity.InventarioNacional;
import co.edu.unipiloto.usuario.entity.Usuariosnuevos;
import co.edu.unipiloto.usuario.entity.VacunaInvnac;
import co.edu.unipiloto.usuario.session.DistribuidorVacunasFacadeLocal;
import co.edu.unipiloto.usuario.session.InventarioNacionalFacadeLocal;
import co.edu.unipiloto.usuario.session.UsuariosnuevosFacadeLocal;
import co.edu.unipiloto.usuario.session.VacunaInvnacFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "ActualizarInvNac", urlPatterns = {"/ActualizarInvNac"})
public class ActualizarInvNac extends HttpServlet {

    @EJB
    private DistribuidorVacunasFacadeLocal distribuidorVacunasFacade;

    @EJB
    private InventarioNacionalFacadeLocal inventarioNacionalFacade;

    @EJB
    private VacunaInvnacFacadeLocal vacunaInvnacFacade;

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

            HttpSession objsession = request.getSession(false);
            String user = (String) objsession.getAttribute("id1");

//            Usuariosnuevos us = usuariosnuevosFacade.find(Integer.parseInt(user));
            String action = request.getParameter("action");
            String venci = request.getParameter("venci");
            int cant = Integer.parseInt(request.getParameter("canti"));
            String lote = request.getParameter("lote");
            String marca = request.getParameter("marca");
            VacunaInvnac lol = null;
            VacunaInvnac lol2=null;

            if (cant <= 0) {
                out.print("<script type=\"text/javascript\">\n" + " alert(\"No se puede agregar esa cantidad \");\n" + "</script>");
                out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/ActualizarInvNac.jsp\" />");
            } else {
                if (request.getParameter("action").equals("Agregar")) {
                    for (VacunaInvnac c : vacunaInvnacFacade.findAll()) {
                        for (VacunaInvnac inv : vacunaInvnacFacade.findAll()) {
                            if (inv.getVencimiento().equals(venci)) {
                              lol2=inv;
                              break;
                            }
                        }
                        if (marca.equals("Pfizer") && c.getMarca().equals("Pfizer")) {
                            if (!lote.equals(c.getLote()) || !venci.equals(c.getVencimiento())) {                               
                                VacunaInvnac vac = new VacunaInvnac(marca, cant, lote, venci, inventarioNacionalFacade.find(1));
                                vacunaInvnacFacade.create(vac);
                                break;
                            } else {
                                c.setCantidad(cant + c.getCantidad());
                                vacunaInvnacFacade.edit(c);
                                break;
                            }
                        } else if (marca.equals("Janssen") && c.getMarca().equals("Janssen")) {
                            if (!lote.equals(c.getLote()) || !venci.equals(c.getVencimiento())) {
                                VacunaInvnac vac = new VacunaInvnac(marca, cant, lote, venci, inventarioNacionalFacade.find(1));
                                vacunaInvnacFacade.create(vac);
                                break;
                            } else {
                                c.setCantidad(cant + c.getCantidad());
                                vacunaInvnacFacade.edit(c);
                                break;
                            }
                        } else if (marca.equals("AstraZeneca") && c.getMarca().equals("AstraZeneca")) {
                            if (!lote.equals(c.getLote()) || !venci.equals(c.getVencimiento())) {
                                VacunaInvnac vac = new VacunaInvnac(marca, cant, lote, venci, inventarioNacionalFacade.find(1));
                                vacunaInvnacFacade.create(vac);
                                break;
                            } else {
                                c.setCantidad(cant + c.getCantidad());
                                vacunaInvnacFacade.edit(c);
                                break;
                            }
                        } else if (marca.equals("Sinovac") && c.getMarca().equals("Sinovac")) {
                            if (!lote.equals(c.getLote()) || !venci.equals(c.getVencimiento())) {
                                VacunaInvnac vac = new VacunaInvnac(marca, cant, lote, venci, inventarioNacionalFacade.find(1));
                                vacunaInvnacFacade.create(vac);
                                break;
                            } else {
                                c.setCantidad(cant + c.getCantidad());
                                vacunaInvnacFacade.edit(c);
                                break;
                            }
                        }
                    }
                } else if (request.getParameter("action").equals("Quitar")) {
                    for (VacunaInvnac c : vacunaInvnacFacade.findAll()) {
                        if (c.getCantidad() == 0) {
                            out.print("<script type=\"text/javascript\">\n" + " alert(\"No puede eliminar vacunas porque esta vacia \");\n" + "</script>");
                            out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:8080/ProyectSanax-war/ActualizarInvNac.jsp\" />");
                        } else {
                            if (marca.equals("Pfizer") && c.getMarca().equals("Pfizer")) {
                                if (!lote.equals(c.getLote()) || !venci.equals(c.getVencimiento())) {
                                    VacunaInvnac vac = new VacunaInvnac(marca, cant, lote, venci, inventarioNacionalFacade.find(1));
                                    vacunaInvnacFacade.create(vac);
                                    break;
                                } else {
                                    c.setCantidad(c.getCantidad() - cant);
                                    vacunaInvnacFacade.edit(c);
                                    break;
                                }
                            } else if (marca.equals("Janssen") && c.getMarca().equals("Janssen")) {
                                if (!lote.equals(c.getLote()) || !venci.equals(c.getVencimiento())) {
                                    VacunaInvnac vac = new VacunaInvnac(marca, cant, lote, venci, inventarioNacionalFacade.find(1));
                                    vacunaInvnacFacade.create(vac);
                                    break;
                                } else {
                                    c.setCantidad(c.getCantidad() - cant);
                                    vacunaInvnacFacade.edit(c);
                                    break;
                                }
                            } else if (marca.equals("AstraZeneca") && c.getMarca().equals("AstraZeneca")) {
                                if (!lote.equals(c.getLote()) || !venci.equals(c.getVencimiento())) {
                                    VacunaInvnac vac = new VacunaInvnac(marca, cant, lote, venci, inventarioNacionalFacade.find(1));
                                    vacunaInvnacFacade.create(vac);
                                    break;
                                } else {
                                    c.setCantidad(c.getCantidad() - cant);
                                    vacunaInvnacFacade.edit(c);
                                    break;
                                }
                            } else if (marca.equals("Sinovac") && c.getMarca().equals("Sinovac")) {
                                if (!lote.equals(c.getLote()) || !venci.equals(c.getVencimiento())) {
                                    VacunaInvnac vac = new VacunaInvnac(marca, cant, lote, venci, inventarioNacionalFacade.find(1));
                                    vacunaInvnacFacade.create(vac);
                                    break;
                                } else {
                                    c.setCantidad(c.getCantidad() - cant);
                                    vacunaInvnacFacade.edit(c);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            //Agregar o quitar vacunas, Comparar sobre marcas si tienen un atributo diferente se crear el objeto si lo unico diferente es la cantidad se actualiza sobre la misma            

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ActualizarInvNac</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> funciono " + request.getContextPath() + "</h1>");
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
