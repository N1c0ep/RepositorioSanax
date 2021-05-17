<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    
    <div class="cabecera">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Estado de Vacunación</title>
        <h1>SANAX</h1>
        <link rel="stylesheet" href="css/agendarInfo.css">
    </head>
    </div>
    <body>
       <p class="linea">.</p>
       <br>
       <br>
        <form action="./RegistrarEstadoVac" method="POST">
            <table>
                <tr>                  
                        <td>Dosis</td>
                    <select name="dosis" value="${asig.dosis}">
                        <option>0 Dosis</option>
                        <option>1 Dosis</option>
                        <option>2 Dosis</option>
                    </select> 
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Confirmar" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
