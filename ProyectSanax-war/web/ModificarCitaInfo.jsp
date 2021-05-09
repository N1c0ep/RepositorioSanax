<%-- 
    Document   : ModificarCitaInfo
    Created on : 16/04/2021, 12:20:39 AM
    Author     : dlpol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <div class="cabecera">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar cita - SANAX</title>
        <h1>Modificar cita</h1>
        <link rel="stylesheet" href="css/ModificarCitaInfo.css">
    </head>
    </div>
    <body>
       <br>
       <br>
        <form action="./ModCitaInfo" method="POST">
            <table>
                <tr>
                    <td>Id Cita</td>
                    <td><input type="text" name="idCita" value="${cita.idCita}" /></td>
                </tr>
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
