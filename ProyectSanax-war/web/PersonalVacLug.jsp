<%-- 
    Document   : PersonalVacLug
    Created on : 16-may-2021, 13:11:55
    Author     : Fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lugar Vacunación</title>
    </head>
    <body>
        <h1>Sitios Vacunacion </h1>
        <h2>Elige el lugar al que quieres ser asignado a vacunar</h2>
        <form action="./PersonalVL" method="POST">  
            <input type="radio" name="sitio" value="1">Hospital de Engativa (Tv. 100a #80a-50, Bogotá).
            <br>
            <input type="radio" name="sitio" value="2">Coliseo el tunal (Carrera 19 # 52b -15 Sur).
            <br>
            <input type="radio" name="sitio" value="3">Coliseo Molinos (Calle 48q sur # 2-10).
            <br>
            <input type="radio" name="sitio" value="4">Coliseo Cayetano Cañizares (Carrera 80 # 40 -55 sur).
            <br>
            <input type="radio" name="sitio" value="5">Coliseo tibabuyes (Calle 139 # 127c - 48).
            <br>
            <input type="submit" name="action" value="Asignar" />
            
        </form>
    </body>
 </html>
