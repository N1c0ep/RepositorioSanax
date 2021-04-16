<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    
    <div class="cabecera">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agendar cita - SANAX</title>
        <h1>SANAX</h1>
        <link rel="stylesheet" href="css/agendarInfo.css">
    </head>
    </div>
    <body>
       <p class="linea">.</p>
       <br>
       <br>
        <form action="./citaInfo" method="POST">
            <table>
                <tr>                  
                        <td>Fase</td>
                    <select name="fase" value="${asig.fase}">
                        <option>Fase 1</option>
                        <option>Fase 2</option>
                    </select> 
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
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
