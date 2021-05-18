<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <div class="cabecera">
    
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Representante Sitio de vacunación</title>
        <h1> <img src="singin.png">Sign Up</h1>
        <link rel="stylesheet" href="css/RepresentanteSitio.css">
    </head>
    
    </div>
    
    <p class="mensaje">REGISTRAR REPRESENTANTE</p>
    <p class="saludo">Por favor ingresa los siguientes datos</p>
                
                
    <body>
        
        <form action="./RepresentanteSitio" method="POST">
            <body>
                <h1>Bienvenido Representante de Sitio</h1>
                    <input type="button" class="bt1" value="Actualizar inventario de vacunas" OnClick="location.href='//localhost:8080/ProyectSanax-war/ActualizarInventario.jsp'"/>
                    <br>
                    <input type="button" class="bt1" value="Consultar inventario de vacunas" OnClick="location.href='//localhost:8080/ProyectSanax-war/ConsultarInventario.jsp'"/>
                    <br>
                    <input type="button" class="bt2" value="Notificar falta de vacunas" OnClick="location.href='//localhost:8080/ProyectSanax-war/NotificarFaltaVac.jsp'"/>
                    <br>
                    <input type="button" class="bt3" value="Consultar pacientes sin vacunar" OnClick="location.href='//localhost:8080/ProyectSanax-war/ConsultarPacientesSinVac.jsp'"/>          
                    <br>
                    <input type="button" class="bt3" value="Consultar pacientes sin vacunar segunda dosis" OnClick="location.href='//localhost:8080/ProyectSanax-war/ConsultarPacientesSegundaDosis.jsp'"/>          
                    <br>
                    <input type="button" class="bt3" value="Consultar pacientes vacunados" OnClick="location.href='//localhost:8080/ProyectSanax-war/ConsultarPacientesVacunados.jsp'"/>
                    <br>
                    <input type="button" class="bt3" value="Consultar pacientes vacunados por fase" OnClick="location.href='//localhost:8080/ProyectSanax-war/ConsultarPacientesVacunadosFase.jsp'"/>
                    <br>
                    <input type="button" class="bt3" value="Asignar pacientes a personal" OnClick="location.href='//localhost:8080/ProyectSanax-war/AsignarPersonal.jsp'"/>
            </body>
        </form>
    </body>
    <a href="http://localhost:8080/ProyectSanax-war/index.html"> Salir </a>
    
    
    
    
</html>