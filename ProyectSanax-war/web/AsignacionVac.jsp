<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : AsignacionVac
    Created on : 12/05/2021, 08:28:02 PM
    Author     : jorge_j3qr4sd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div class="cabecera">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="css/AsignacionVac.css">
            <title>Asignar Vacs - SANAX</title>
        <h1>Asignacion Vacunas</h1>
        <title>JSP Page</title>
    </head>
</div>
<body>
    <form action="./AsignaVac" method="POST">
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
                <td>Seleccione vacuna </td>
                <td>
                    <sql:query var="vacuna" dataSource="${bd}">
                        SELECT v.id_vacuna, v.marca
                        FROM vacuna_invnac v
                        WHERE  id_inventarionac = (
                        SELECT n.id_inventarionac
                        FROM inventario_nacional n)
                    </sql:query>

                    <select id="vacunas" name="vacunas">
                        <option value="0">Elija vacuna</option>
                        <c:forEach var="row" items="${vacuna.rows}">
                            <option value="${row.id_vacuna}">${row.marca}</option>                                    
                        </c:forEach>                               
                    </select>
                </td>
            </tr>

            <tr>
                <td>Cantidad </td>
                <td><input type="text" name="cantidad" value="${vacunas.cantidad}" required /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" name="action" value="Asignar" />
                    <input type="submit" name="action" value="Menu" />
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
