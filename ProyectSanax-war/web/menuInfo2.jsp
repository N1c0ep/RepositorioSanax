<%-- 
    Document   : menuInfo2
    Created on : 5/05/2021, 07:24:21 PM
    Author     : jorge_j3qr4sd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div class="cabecera">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/menuInfo2.css">
        
        <title>Menu - SANAX DISTRIBUIDOR</title>
        <h1>Bienvenido Distribuidor</h1>
        <title>JSP Page</title>
        
    </head>
    
    </div>
    
    <body>
        
        <form action="./userInfo" method="POST">
            <input type="button" class="bt1" value="Actualizar inventario nacional" OnClick="location.href='//localhost:8080/ProyectSanax-war/ActualizarInvNac.jsp'"/>
            <br>
            <input type="button" class="bt2" value="Consultar estado distribución de vacunas" OnClick="location.href='//localhost:8080/ProyectSanax-war/ConsultarEstVac.jsp'"/>
            <br>
            <input type="button" class="bt3" value="Asignación de vacunas" OnClick="location.href='//localhost:8080/ProyectSanax-war/AsignacionVac.jsp'"/>          
        </form>
            
    </body>
</html>
