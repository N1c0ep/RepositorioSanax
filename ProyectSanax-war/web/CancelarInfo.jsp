<%-- 
    Document   : CancelarInfo
    Created on : 2/04/2021, 04:37:12 PM
    Author     : jorge_j3qr4sd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cancelar cita</h1>
        <form action="./CancCitaInfo" method="POST">
            <table>
                <tr>
                    <td>Cancelar, ponga el id de la cita</td>
                    <td><input type="text" name="buscar" value="${cance.buscar}" /></td>
                </tr>
                <tr>
                    <td>ponga su id de usuario</td>
                    <td><input type="text" name="id" value="${cance.id}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Search" />
                        <input type="submit" name="action" value="Delete" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
