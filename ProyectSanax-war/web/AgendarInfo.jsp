<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agendar cita</title>
    </head>
    <body>
        <h1>Agendar cita</h1>
        <form action="./citaInfo" method="POST">
            <table>
                <tr>
                    <td>Id</td>
                    <td><input type="text" name="id" value="${asig.idcita}" /></td>
                </tr>
                <tr>
                    <td>Fase</td>
                    <td><input type="text" name="fase" value="${asig.fase}" /></td>
                </tr>
                <tr>
                    <td>Fecha</td>
                    <td><input type="date" name="fecha" value="${asig.fecha}" /></td>
                </tr>
                <tr>
                    <td>Hora</td>
                    <td><input type="time" name="hora" value="${asig.hora}" /></td>
                </tr> 
                <tr>
                    <td>Id usuario</td>
                    <td><input type="text" name="iduser" value="${asig.iduser}" /></td>
                </tr> 
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
