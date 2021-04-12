<%-- 
    Document   : ActualizarInfo
    Created on : 10/04/2021, 07:33:02 PM
    Author     : Nicolás Estévez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar info</title>
        
    </head>
    <body>
        <h2>Actualiza tu información recuerda que tu id no es modificable debes ingresar el actual</h2>
        <form action="./ActInfo" method="POST">
            <table>
                <tr>
                    <td>Tipo documento</td>
                <select name="tipo" value="${user.tipo}">
                    <option>Cedula de ciudadania</option>
                    <option>Tarjeta de identidad</option>
                </select>
                </tr>
                <tr>
                    <td>Id</td>
                    <td><input type="text" name="id" value="${user.id}" /></td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstname" value="${user.nombre}" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastname" value="${user.apellido}" /></td>
                </tr>
                <tr>
                    <td>Location</td>
                    <td><input type="text" name="location" value="${user.localidad}" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" value="${user.correo}" /></td>
                </tr>
                <tr>
                    <td>Birth Date</td>
                    <td><input type="text" name="birth" value="${user.fecha}" /></td>
                </tr>
                <tr>
                    <td>Telephonic number</td>
                    <td><input type="text" name="telephone" value="${user.telefono}" /></td>
                </tr>
                <tr>
                    <td>Dirección</td>
                    <td><input type="text" name="direccion" value="${user.direccion}" /></td>
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
