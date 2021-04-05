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
        <form action="./CancCitaInfo" method="POST">
            <table>
                <tr>
                    <td>Consultar, ponga el id de la cita</td>
                    <td><input type="text" name="buscar" value="${consu.buscar}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Search" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
