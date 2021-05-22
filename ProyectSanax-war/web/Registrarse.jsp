<%-- 
    Document   : Registrarse
    Created on : 21/05/2021, 01:23:40 AM
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="Registro">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>Registrarse</title>
    <link rel="stylesheet" href="css/nicepage.css" media="screen">
    <link rel="stylesheet" href="css/Registrarse.css" media="screen">
    <script class="u-script" type="text/javascript" src="js/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="js/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.15.3, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Oswald:200,300,400,500,600,700">
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"url": "index.html",
		"logo": "images/Capturadepantalla2021-05-20162406.png"
}</script>
    <meta property="og:title" content="Registrarse">
    <meta property="og:type" content="website">
    <meta name="theme-color" content="#478ac9">
    <link rel="canonical" href="index.html">
    <meta property="og:url" content="index.html">
  </head>
  <body class="u-body"><header class="u-clearfix u-header u-header" id="sec-00da"><div class="u-clearfix u-sheet u-sheet-1">
        <a href="https://estevezpacheco10.wixsite.com/sanax" class="u-image u-logo u-image-1" data-image-width="280" data-image-height="63">
          <img src="images/Capturadepantalla2021-05-20162406.png" class="u-logo-image u-logo-image-1" data-image-width="291.1113">
        </a>
        <nav class="u-menu u-menu-dropdown u-offcanvas u-menu-1">
          <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</symbol>
</defs></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="index.html" style="padding: 10px 20px;">Coronavirus (COVID-19)</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Ingresar.html" style="padding: 10px 20px;">Ingresar</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Coronavirus-(COVID-19).html" style="padding: 10px 20px;">Coronavirus (COVID-19)</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Ingresar.jsp" style="padding: 10px 20px;">Ingresar</a>
</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
    <section class="u-clearfix u-expanded-width-xl u-grey-5 u-section-1" id="carousel_bfcc">
      <div class="u-clearfix u-gutter-0 u-layout-wrap u-layout-wrap-1">
        <div class="u-gutter-0 u-layout">
          <div class="u-layout-row">
            <div class="u-align-left u-container-style u-image u-layout-cell u-size-30 u-image-1" data-image-width="1200" data-image-height="1074">
              <div class="u-container-layout u-container-layout-1"></div>
            </div>
            <div class="u-align-left u-container-style u-layout-cell u-palette-5-dark-3 u-size-30 u-layout-cell-2">
              <div class="u-container-layout u-valign-middle u-container-layout-2">
                <h2 class="u-custom-font u-font-oswald u-text u-text-body-alt-color u-text-1">Registro</h2>
                <div class="u-form u-form-1">
                  <form action="./userInfo" method="POST" source="custom">
                    <select name="tipo" class="u-text u-text-3 u-black" value="${user.tipo}">
                    <option>Cedula de ciudadania</option>
                    <option>Tarjeta de identidad</option>
                    </select>
                      <div class="u-form-group u-form-name u-form-group-1">
                      <label for="name-e4cc" class="u-form-control-hidden u-label u-text-body-alt-color" wfd-invisible="true">Name</label>
                      <input type="text" placeholder="Ingrese su Nombre" id="name-e4cc" name="firstname" value="${user.nombre}" class="u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-white u-input u-input-rectangle u-text-body-alt-color" required="">
                    </div>
                    <div class="u-form-group u-form-name u-form-group-2">
                      <label for="name-fb0f" class="u-form-control-hidden u-label u-text-body-alt-color">Nombre</label>
                      <input type="text" placeholder="Ingrese su Apellido" id="name-fb0f" name="lastname" value="${user.apellido}" class="u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-white u-input u-input-rectangle u-text-body-alt-color" required="">
                    </div>
                    <div class="u-form-email u-form-group u-form-group-3">
                      <label for="email-e4cc" class="u-form-control-hidden u-label u-text-body-alt-color" wfd-invisible="true">Email</label>
                      <input type="email" placeholder="Enter a valid email address" id="email-e4cc" name="email" value="${user.correo}" class="u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-white u-input u-input-rectangle u-text-body-alt-color" required="">
                    </div>
                    <div class="u-form-group u-form-group-4">
                      <label for="date-3a41" class="u-form-control-hidden u-label u-text-body-alt-color">Date</label>
                      <input type="text" placeholder="YYYY/MM/DD" id="date-3a41" name="birth" value="${user.fecha}" class="u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-white u-input u-input-rectangle u-text-body-alt-color" required="">
                    </div>
                    <div class="u-form-group u-form-partition-factor-2 u-form-group-5">
                      <label for="text-8517" class="u-form-control-hidden u-label u-text-body-alt-color">Localidad</label>
                      <input type="text" placeholder="Ingrese su Residencia" id="text-8517" name="location" value="${user.localidad}" class="u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-white u-input u-input-rectangle u-text-body-alt-color">
                    </div>
                    <div class="u-form-address u-form-group u-form-partition-factor-2 u-form-group-6">
                      <label for="address-e0df" class="u-form-control-hidden u-label u-text-body-alt-color">Dirección</label>
                      <input type="text" placeholder="Ingrese su dirección" id="address-e0df" name="direccion" value="${user.direccion}" class="u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-white u-input u-input-rectangle u-text-body-alt-color" required="">
                    </div>
                    <div class="u-form-group u-form-partition-factor-2 u-form-group-7">
                      <label for="text-8ddb" class="u-form-control-hidden u-label u-text-body-alt-color"></label>
                      <input type="text" placeholder="Ingrese un ID-Usuario" id="text-8ddb" name="id" value="${user.id}" class="u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-white u-input u-input-rectangle u-text-body-alt-color">
                    </div>
                    <div class="u-form-group u-form-partition-factor-2 u-form-phone u-form-group-8">
                      <label for="phone-1edc" class="u-form-control-hidden u-label u-text-body-alt-color">Teléfono</label>
                      <input type="tel" pattern="\+?\d{0,3}[\s\(\-]?([0-9]{2,3})[\s\)\-]?([\s\-]?)([0-9]{3})[\s\-]?([0-9]{2})[\s\-]?([0-9]{2})" placeholder="Ingrese su teléfono (por ejemplo, +14155552675)" id="phone-1edc" name="telephone" value="${user.telefono}" class="u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-white u-input u-input-rectangle u-text-body-alt-color" required="">
                    </div>
                    <div class="u-form-password u-form-group u-form-partition-factor-2 u-form-group-9">
                      <label for="text-1838" class="u-form-control-hidden u-label u-text-body-alt-color"></label>
                      <input type="text" placeholder="Ingrese una Contraseña" id="text-1838" name="contra" value="${user.contrasena}" class="u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-white u-input u-input-rectangle u-text-body-alt-color">
                    </div>
                    <div class="u-form-password u-form-group u-form-partition-factor-2 u-form-group-10">
                      <label for="text-211a" class="u-form-control-hidden u-label u-text-body-alt-color"></label>
                      <input type="text" placeholder="Confirme su Contraseña" id="text-211a" name="confirma" value="${user.confirm}" class="u-border-2 u-border-no-left u-border-no-right u-border-no-top u-border-white u-input u-input-rectangle u-text-body-alt-color">
                    </div>
                    <div class="u-form-agree u-form-group u-form-group-11">
                      <input type="checkbox" id="agree-925e" name="agree" class="u-agree-checkbox" required="">
                      <label for="agree-925e" class="u-label u-text-body-alt-color">I accept the&nbsp;<a href="https://nicepage.com/c/slider-website-templates" class="u-active-none u-border-none u-btn u-button-style u-hover-none u-none u-text-palette-1-base u-btn-1">Terms of Service</a>
                      </label>
                    </div>
                    <div class="u-form-group u-form-submit u-form-group-12">
                      <a href="#" class="u-border-2 u-border-white u-btn u-btn-submit u-button-style u-none u-text-body-alt-color u-text-hover-white u-btn-2">continuar<br>
                      </a>
                      <input type="submit" name="action" value="Add" class="u-form-control-hidden u-grey-5" wfd-invisible="true">
                    </div>
                  </form>
                </div>
                <p class="u-align-left u-text u-text-2">Ya tengo un usuario&nbsp;<a href="Ingresar.jsp" data-page-id="87814152" class="u-active-none u-border-1 u-border-white u-btn u-button-link u-button-style u-hover-none u-none u-text-body-alt-color u-btn-3">Ingresar</a>
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-d9a5"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Autoria: RepositorioSanax.inc<br>Edicion: Miguel Andres Moreno De La Torre<br>Rol: Lider Soporte
        </p>
      </div></footer>
    <section class="u-backlink u-clearfix u-grey-80">
      <a class="u-link" href="https://nicepage.com/templates" target="_blank">
        <span>Templates</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="https://nicepage.com/website-builder" target="_blank">
        <span>Best Website Builder</span>
      </a>. 
    </section>
  </body>
</html>
