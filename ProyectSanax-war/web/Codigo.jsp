<%-- 
    Document   : Codigo
    Created on : 24/05/2021, 07:35:10 PM
    Author     : jorge_j3qr4sd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="./ConfirmacionCod">
            <table border="1">
                <thead>
                    <tr>
                        <td>Id usuario</td>
                        <input type="text" name="id" value="" />
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Codigo confirmación</td>
                        <input type="text" name="codigo" value="" />
                    </tr>
                    <tr>
                        <td>Contraseña nueva</td>
                        <input type="password" name="contra" value="" />
                    </tr>
                    <tr>
                        <td>Confirmación contraseña</td>
                        <input type="password2" name="contra2" value="" />
                    </tr>
                </tbody>
            </table>
            
            <input type="submit" value="confirmar" name="action"  />
            
        </form>
        
    </body>
</html>
