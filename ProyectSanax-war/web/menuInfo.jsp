<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%
HttpSession objsession = request.getSession(false);
            String id = (String) objsession.getAttribute("id1");
   if (id.equals("")) {
           response.sendRedirect("index.html");
       }
         
%>
<html>
    <div class="cabecera">
        
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/menuInfo.css">
        <title>Menu - SANAX</title>
        <h1>Menu</h1>
        
        
        
                        <div>
				<nav >
					<ul class="lista">
						<li>Inicio</li>
						<li>Fecha de vacunacion</li>
                
					</ul>
				</nav>
			</div>
    </head>
    
    </div>
        <body>
            
           
        <form action="./userInfo" method="POST">
            <input type="button" class="bt1" value="Agendar cita" OnClick="location.href='//localhost:8080/ProyectSanax-war/AgendarInfo.jsp'"/>
            
            <input type="button" class="bt2" value="Consultar cita" OnClick="location.href='//localhost:8080/ProyectSanax-war/ConsultarInfo.jsp'"/>
            
            <input type="button" class="bt3" value="Cancelar cita" OnClick="location.href='//localhost:8080/ProyectSanax-war/CancelarInfo.jsp'"/>
           
            <input type="button" class="bt4" value="Actualizar info personal" OnClick="location.href='//localhost:8080/ProyectSanax-war/ActualizarInfo.jsp'"/>
        </form>
            
   
        </body>
 
        <a href="http://localhost:8080/ProyectSanax-war/index.html"> Salir </a>
</html>
