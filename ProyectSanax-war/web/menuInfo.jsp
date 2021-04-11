<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estiloMenu.css">
        <title>Menu</title>
    </head>
        <body>
        <h1>Menu</h1>
        <form action="./userInfo" method="POST">
            <input type="button" value="Agendar cita" OnClick="location.href='//localhost:8080/ProyectSanax-war/AgendarInfo.jsp'"/>
            <br>
            <br>
            <input type="button" value="Consultar cita" OnClick="location.href='//localhost:8080/ProyectSanax-war/ConsultarInfo.jsp'"/>
            <br>
            <br>
            <input type="button" value="Cancelar cita" OnClick="location.href='//localhost:8080/ProyectSanax-war/CancelarInfo.jsp'"/>
        </form>
        </body>
</html>
