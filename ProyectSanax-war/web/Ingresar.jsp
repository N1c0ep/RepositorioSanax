<%-- 
    Document   : Ingresar
    Created on : 20/05/2021, 08:13:43 PM
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<div class="cabecera">
		<head>
	
			<meta charset="UTF-8">
                        <link rel="stylesheet" href="css/index.css">
                        <script src="js/main.js"></script>
			<title>Registro Sanax - SANAX</title>
                <h1> <img src="logosanax.jpg"> Registro Sanax</h1>
			<div>
				<nav >
					<ul class="lista">
						<li>Inicio</li>
						<li>Fases de vacunacion</li>
                
					</ul>
				</nav>
			</div>
			
		</head>
	
	</div>
    <body>
		<p class="saludo">Hola, bienvenido al aplicativo sanax por favor ingresa los siguientes datos para iniciar sesion</p> 
		
        
        <form action="./registroInfo" method="POST" id="forminicio">
            
            <table>
                <style>
                    body {
                        background: url(uno.jpeg);
                        background-repeat: no-repeat;
                        background-size: cover;
                    }
                </style>

                <select  name="lista">
                    <option>Usuario de vacunacion</option>
                    <option>Distribuidor de vacunas</option>
                    <option>Personal de vacunacion</option>
                    <option>Representante de sitio</option>
                </select>   

                <tr>
                    <td></td>
                    <td><input class="botonch" type="text" name="id1" placeholder="Id usuario" id="txtid"/></td>
                </tr>              
                <tr>
                    <td></td>
                    <td><input class="botonch2" type="password" name="contra" placeholder="Contraseña" id="txtpass"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input class="botonch3" type="button" name="action" value="Login" id="btniniciar" />
                    </td>
                </tr>
            </table>
        </form>
        <a class="linkregi" href="userInfo.jsp"> Registrate aqui </a>
        <a class="linkregi" href="Recupera.jsp"> Olvidar Contraseña </a>
    </body>

</html>