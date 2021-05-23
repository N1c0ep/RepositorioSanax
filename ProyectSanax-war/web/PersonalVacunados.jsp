<%-- 
    Document   : PersonalVacunados
    Created on : 16-may-2021, 13:20:47
    Author     : Fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vacunados </title>
    </head>
    <body>
        <h1>Periodos de tiempo</h1>
        <h2>Elige periodo de tiempo que quieres consultar</h2>
        <form action="./PersonalVacunadosTiempo" method="POST">
            <table>
                
                
                 <tr>
                    <td>Fecha inicio </td>
                    <td><input type="date" name="fechaInicio" value="${asig.fecha}" /></td>
                </tr>
                <tr>
                    <td>Fecha fin</td>
                    <td><input type="date" name="fechaFin" value="${asig.fecha}" /></td>
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
