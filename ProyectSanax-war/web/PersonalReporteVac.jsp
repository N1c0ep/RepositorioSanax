<%-- 
    Document   : PersonalReporteVac
    Created on : 19/05/2021, 09:52:19 PM
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte vacunación</title>
    </head>
    <body>
        <h1>Bienvenido Ingresa los datos de la vacunacion que realisaste</h1>
        <form action="./PersonalReporteVac" method="POST">
            <table>
                <tr>
                    <td>Brazo</td>
                <select name="brazo" value="${user.tipoDocumento}">
                    <option>Izquierdo</option>
                    <option>Derecho</option>
                </select>
                </tr>
                <tr>
                    <td>Id_cita</td>
                    <td><input type="text" name="id_cita" value="${user.nombre}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Enviar Reporte" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
