<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <div class="cabecera">
    
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up - SANAX</title>
        <h1>Sign Up</h1>
        <link rel="stylesheet" href="css/userInfo.css">
    </head>
    
    </div>
    
    <p class="mensaje">CREA UNA CUENTA</p>
    <p class="saludo">Por favor ingresa los siguientes datos para crear tu usuario</p>
                
                
    <body>
        
        <form action="./userInfo" method="POST">
            <table>
                <tr>
                    <td></td>
                    <td><input type="text" name="id" placeholder="ID"  value="${user.id}" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="text" name="firstname" placeholder="Primer Nombre" value="${user.nombre}" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="text" name="lastname" placeholder="Apellidos" value="${user.apellido}" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="text" name="location" placeholder="Locacion" value="${user.localidad}" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="text" name="email" placeholder="Email" value="${user.correo}" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="text" name="birth" placeholder="Fecha de nacimiento" value="${user.fecha}" /></td>
                </tr>
                <tr>
                    <td</td>
                    <td><input type="text" name="telephone" placeholder="Telefono" value="${user.telefono}" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="password" name="contra" placeholder="Contraseña" value="${user.contrasena}" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="password" name="confirma" placeholder="Confirmar contraseña" value="${user.confirm}" /></td>
                </tr>
                <tr>
                    <td></td>
                <select name="tipo" value="${user.tipo}">
                    <option>Cedula de ciudadania</option>
                    <option>Tarjeta de identidad</option>
                </select>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="text" name="direccion" placeholder="Direccion" value="${user.direccion}" /></td>
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