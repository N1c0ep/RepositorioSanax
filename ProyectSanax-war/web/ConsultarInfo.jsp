<%-- 
    Document   : ConsultarInfo
    Created on : 2/04/2021, 04:37:44 PM
    Author     : jorge_j3qr4sd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar cita</title>
    </head>
    <body>  
        <h1>Buscar cita</h1>
        <form action="./ConsuInf" method="POST">
            <table>           
                <tr>
                    <td>ponga su id de usuario</td>
                    <td><input type="text" name="id" value="${consu.id}" /></td>
                </tr>
                <tr>                   
                    <td colspan="2">
                        <input type="submit" name="action" value="Search" />
                    </td>
                </tr>               
            </table>
        </form> 
                
        <form action="./CancCitaInfo" method="POST">
            <table>
                <td colspan="2">
                    <input type="submit" name="action" value="Cancelar" />
                </td>
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
            <c:forEach var = "row" items = "${result.rows}">
                <tr>
                <td> <c:out value = "${row.id}"/></td>
                <td> <c:out value = "${row.fase}"/></td>
                <td> <c:out value = "${row.hora}"/></td>
                <td> <c:out value = "${row.fecha}"/></td>
                <td> <c:out value = "${row.iduser}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>


<!--<sql:setDataSource var = "bd" driver = "org.apache.derby.jdbc.ClientDriver"
                                   url = "jdbc:derby://localhost:1527/UsuariosReg"
                                   user = "ROOT1234"  password = "ROOT1234"/>
                <tr>
                    <td>
                        <sql:query var = "result" dataSource = "peso{var}">
                            SELECT IDCITA,FASE,HORA,FECHA,IDUSER from USUARIOSNUEVOS
                        </sql:query>
                    </td>
                </tr>-->
