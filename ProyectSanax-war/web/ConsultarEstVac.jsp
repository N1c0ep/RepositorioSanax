<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="co.edu.unipiloto.usuario.entity.VacunaInv"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : ConsultarInfo
    Created on : 2/04/2021, 04:37:44 PM
    Author     : jorge_j3qr4sd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <div class="cabecera">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Consultar estado vacunación - SANAX</title>
            <link rel="stylesheet" href="css/consultarInfo.css">
        </head>
    </div>
    <body>  

        <form action="./ConsuEstVac" method="POST">
            <table>           
                <sql:setDataSource var = "bd" driver = "org.apache.derby.jdbc.ClientDriver"
                                   url = "jdbc:derby://localhost:1527/UsuariosReg"
                                   user = "root1234"  password = "root1234"/>

                <tr>
                    <td>Seleccione sitio </td>
                    <td>
                        <sql:query var="sitio" dataSource="${bd}">
                            SELECT s.id_sitio, s.sitio
                            FROM SITIO s
                        </sql:query>

                        <select     id="sitios" name="sitiosVac">
                            <option value="0">Elija sitio</option>
                            <c:forEach var="row" items="${sitio.rows}">
                                <option value="${row.id_sitio}">${row.sitio}</option>                                    
                            </c:forEach>                               
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Consultar" />
                    </td>
                </tr>
            </table>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Cantidad</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var = "canti" items = "${cantidad}">
                            <tr>
                                <td> ${canti}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

        </form>
    </body>
</html>