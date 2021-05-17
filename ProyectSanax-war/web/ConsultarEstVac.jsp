<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
        <title>Consultar cita - SANAX</title>
        <h1>Agendar Cita</h1>
        <link rel="stylesheet" href="css/consultarInfo.css">
    </head>
    </div>
    <body>  
        
        <form action="./ConsuInf" method="POST">
            <table>           
                <tr>                   
                    <td colspan="2">
                        <input type="submit" name="action" value="Search" />
                        <input type="submit" name="action" value="Cancelar" />
                        <input type="submit" name="action" value="Menu" />
                    </td>
                </tr>
                <sql:setDataSource var = "bd" driver = "org.apache.derby.jdbc.ClientDriver"
                                   url = "jdbc:derby://localhost:1527/UsuariosReg"
                                   user = "root1234"  password = "root1234"/>
                <tr>                   
                    <td>
                        <sql:query var = "result" dataSource = "${bd}">
                            SELECT ID_CITA,FASE,HORA,FECHA,identificacion from CITA
                        </sql:query>
                    </td>
                </tr>
            </table>
        </form>               
        <br>  
        <h1>Citas disponibles</h1>
        <table border = "1">                  
            <tr>                       
                <th>Id Cita</th>
                <th>Fase</th>
                <th>Hora</th>
                <th>Fecha</th>
                <th>Id usuario</th>
            </tr>
            <c:forEach var = "row" items = "${rows}">
                <tr>
                <td> <c:out value = "${row.idCita}"/></td>
                <td> <c:out value = "${row.fase}"/></td>
                <td> <c:out value = "${row.hora}"/></td>
                <td> <c:out value = "${row.fecha}"/></td>
                <td> <c:out value = "${row.identificacion.id}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>