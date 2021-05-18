<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div class="cabecera">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="css/ConsultarPacientesSegundaDosis.css">
            <title>Consultar Segunda Dosis</title>
            <h1>Consultar pacientes sin segunda dosis</h1>
        <title>JSP Page</title>
    </head>
</div>
    <body>
        <form action="./ConsultarPacientesSegundaDosis" method="POST">
            
            <table>
                <tr>                   
                    <td colspan="2">
                        <input type="submit" name="action" value="Buscar" />
                        <input type="submit" name="action" value="Salir" />
                    </td>
                </tr>
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
            </table>
        </form>
        <br>  
        <h1>Pacientes sin segunda dosis</h1>
        <table border = "1">                  
            <tr>                       
                <th>Id Usuario</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Correo</th>
                <th>Fecha</th>
                <th>Localidad</th>
                <th>Tipo de Documento</th>
                <th>Direccion</th>
                <th>Telefono</th>
                <th>Dosis</th>
            </tr>
            <c:forEach var = "row" items = "${rows}">
                <tr>
                <td> <c:out value = "${row.id}"/></td>
                <td> <c:out value = "${row.nombre}"/></td>
                <td> <c:out value = "${row.apellido}"/></td>
                <td> <c:out value = "${row.correo}"/></td>
                <td> <c:out value = "${row.fecha}"/></td>
                <td> <c:out value = "${row.localidad}"/></td>
                <td> <c:out value = "${row.tipoDocumento}"/></td>
                <td> <c:out value = "${row.direccion}"/></td>
                <td> <c:out value = "${row.telefono}"/></td>
                <td> <c:out value = "${row.dosis}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
