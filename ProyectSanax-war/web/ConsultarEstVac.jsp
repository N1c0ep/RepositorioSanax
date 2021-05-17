<%-- 
    Document   : ConsultarEstVac
    Created on : 12/05/2021, 08:23:49 PM
    Author     : jorge_j3qr4sd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div class="cabecera">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/menuInfo2.css">
        <title>Menu - SANAX</title>
        <h1>Consultar Estado de Vacunacion</h1>
        
        <title>JSP Page</title>
    </head>
    </div>
    <body>
            <form action="./ConsuEstVac" method="POST">
            <table>
                
                <tr>
                    <td>Ingrese id del sitio</td>
                    <td><input type="text" name="sitio" value="${asig.sitio}" /></td>
                </tr> 
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Buscar" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
