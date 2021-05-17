<%-- 
    Document   : ActualizarInvNac
    Created on : 12/05/2021, 08:23:16 PM
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
        <h1>Actualizar Inventario Nacional</h1>
        <title>JSP Page</title>
    </head>
</div>
<body>
    <h1>Actualizar inventario nacional</h1>
    <form action="./ActualizarInvNac" method="POST">
        <table>

            <tr>
                <td>Vencimiento</td>
            <select name="marca" value="${act.marca}">
                <option>Pfizer</option>
                <option>Janssen</option>
                <option>AstraZeneca</option>
                <option>Sinovac</option>
            </select>
            </tr>
            <tr>
                <td>Vencimiento</td>
                <td><input type="date" name="venci" value="${act.vencimiento}" /></td>
            </tr>
            <tr>
                <td>Cantidad</td>
                <td><input type="text" name="canti" value="${act.cantidad}" /></td>
            </tr> 
            <tr>
                <td>Lote</td>
                <td><input type="text" name="lote" value="${act.lote}" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" name="action" value="Agregar" />
                    <input type="submit" name="action" value="Quitar" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
