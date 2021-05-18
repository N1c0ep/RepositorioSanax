<%-- 
    Document   : menuInfo3
    Created on : 5/05/2021, 07:24:40 PM
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
        <h1>Personal Vacunación</h1>
       
        <form method="POST">
            <input type="button" class="bt1" value="Seleccionar lugar vacunacion" OnClick="location.href='//localhost:8080/ProyectSanax-war/PersonalVacLug.jsp'"/>
            <br>
            <input type="button" class="bt2" value="Consultar asignacion a vacunar" OnClick="location.href=''"/>
            <br>
            <input type="button" class="bt3" value="Consultar personas vacunadas" OnClick="location.href='//localhost:8080/ProyectSanax-war/PersonalVacunados.jsp'"/>          
            <br>
            <input type="button" class="bt3" value="Realizar reporte de vacunación" OnClick="location.href=''"/>          
        </form>
    </body>
</html>
