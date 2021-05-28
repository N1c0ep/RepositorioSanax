<%-- 
    Document   : AgendarCita
    Created on : 26/05/2021, 11:48:16 PM
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="Asignar Cita">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>AgendarCita</title>
    <link rel="stylesheet" href="css/nicepage.css" media="screen">
<link rel="stylesheet" href="css/AgendarCita.css" media="screen">
    <script class="u-script" type="text/javascript" src="js/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="js/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.15.3, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"url": "index.html",
		"logo": "images/Capturadepantalla2021-05-20162406.png"
}</script>
    <meta property="og:title" content="AgendarCita">
    <meta property="og:type" content="website">
    <meta name="theme-color" content="#478ac9">
    <link rel="canonical" href="index.jsp">
    <meta property="og:url" content="index.jsp">
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
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Ingresar.jsp" style="padding: 10px 20px;">Cerrar sesion</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Ingresar.jsp" style="padding: 10px 20px;">Cerrar sesion</a>
</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
    <section class="u-clearfix u-section-1" id="carousel_a369">
      <div class="u-clearfix u-layout-wrap u-layout-wrap-1">
        <div class="u-gutter-0 u-layout">
          <div class="u-layout-row">
            <div class="u-size-30">
              <div class="u-layout-row">
                <div class="u-container-style u-layout-cell u-left-cell u-size-60 u-white u-layout-cell-1">
                  <div class="u-container-layout u-container-layout-1">
                    <p class="u-text u-text-1">Ingresa por favor la fecha y hora en que la dispongas para atender la cita, asi mismo verifica la fase de tu estado de vacunacion.</p>
                    <div class="u-form u-form-1">
                      <form action="./citaInfo" method="POST">
                        <div class="u-clearfix u-form-spacing-20 u-form-vertical u-inner-form" style="padding: 0;" >
                        <div  class="u-form-date u-form-group u-form-group-1">
                        <select name="fase" value="${asig.fase}" class="u-text u-text-3 u-black">
                            <option>Fase 1</option>
                            <option>Fase 2</option>
                        </select>
                        </div>
                        <div class="u-form-date u-form-group u-form-group-1">
                          <label for="date-9a08" class="u-form-control-hidden u-label">Date</label>
                          <input type="date" placeholder="MM/DD/YYYY" id="date-9a08" name="fecha" value="${asig.fecha}" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
                        </div>
                        <div class="u-form-time u-form-group u-form-group-2">
                          <label for="name-d70e" class="u-form-control-hidden u-label">Name</label>
                          <input type="time" placeholder="Hora" id="name-d70e" name="hora" value="${asig.hora}" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="required">
                        </div>
                        <div class="u-align-left u-form-group u-form-submit u-form-group-3">
                          <a href="#" class="u-black u-btn u-btn-submit u-button-style u-btn-1">Submit</a>
                          <input type="submit" name="action" value="add" class="u-form-control-hidden">
                        </div>
                        </div>
                      </form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="u-size-30">
              <div class="u-layout-col">
                <div class="u-container-style u-image u-layout-cell u-right-cell u-size-60 u-image-1" data-image-width="853" data-image-height="1280">
                  <div class="u-container-layout">
                    <div class="u-container-style u-group u-palette-4-base u-group-1">
                      <div class="u-container-layout u-container-layout-3">
                        <h1 class="u-text u-text-body-alt-color u-text-2">Asignar Cita<br>
                        </h1>
                        <div class="u-shape u-shape-svg u-text-palette-1-base u-shape-1">
                          <svg class="u-svg-link" preserveAspectRatio="none" viewBox="0 0 160 160" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-4bed"></use></svg>
                          <svg class="u-svg-content" viewBox="0 0 160 160" x="0px" y="0px" id="svg-4bed" style="enable-background:new 0 0 160 160;"><path d="M57.2,114.6h20v18.7h-20V114.6z M57.2,66.7h20v18.7h-20V66.7z M57.2,90.6h20v18.7h-20V90.6z M31.5,90.6h20v18.7h-20V90.6z
	 M31.5,66.7h20v18.7h-20V66.7z M31.5,114.6h20v18.7h-20V114.6z M108.6,66.7h20v18.7h-20V66.7z M157.1,10.7h-20v-8
	c0-1.5-1.3-2.7-2.9-2.7h-20c-1.6,0-2.9,1.2-2.9,2.7v8H48.7v-8c0-1.5-1.3-2.7-2.9-2.7h-20c-1.6,0-2.9,1.2-2.9,2.7v8h-20
	c-1.6,0-2.9,1.2-2.9,2.7v29.3v114.6c0,1.5,1.3,2.7,2.9,2.7h154.2c1.6,0,2.9-1.2,2.9-2.7V42.7V13.3C160,11.9,158.7,10.7,157.1,10.7z
	 M134.3,85.2v5.3v18.7v5.3v24h-25.7h-5.7h-20h-5.7h-20h-5.7H25.8v-24v-5.3V90.5v-5.3v-24h25.7h5.7h20h5.7h20h5.7h25.7L134.3,85.2
	L134.3,85.2z M154.3,40H5.8V16h17.1v8c0,1.5,1.3,2.7,2.9,2.7h20c1.6,0,2.9-1.2,2.9-2.7v-8h62.9v8c0,1.5,1.3,2.7,2.9,2.7h20
	c1.6,0,2.9-1.2,2.9-2.7v-8h17.1L154.3,40L154.3,40z M108.6,90.6h20v18.7h-20V90.6z M108.6,114.6h20v18.7h-20V114.6z M82.9,114.6h20
	v18.7h-20V114.6z M82.9,90.6h20v18.7h-20V90.6z M82.9,66.7h20v18.7h-20V66.7z"></path></svg>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="u-gallery u-layout-horizontal u-lightbox u-no-transition u-show-text-on-hover u-gallery-1" id="carousel-fb88">
        <div class="u-gallery-inner u-gallery-inner-1" role="listbox"><div class="u-effect-fade u-effect-hover-liftUp u-gallery-item u-gallery-item-1"><div class="u-back-slide" data-image-width="1280" data-image-height="849"><img class="u-back-image" src="https://pixabay.com/get/g2cb866ad68d20456a9dba7252d8f89d278102d394836f5c075f88c8b21e99b784b1c2bc43e9788c2807bc55165772059914847f457a90b70c9c73b13ce9e0f5b_1280.jpg">
</div><div class="u-over-slide u-shading u-over-slide-1"><h3 class="u-gallery-heading"></h3><p class="u-gallery-text"></p>
</div>
</div><div class="u-effect-fade u-effect-hover-liftUp u-gallery-item u-gallery-item-2"><div class="u-back-slide" data-image-width="1280" data-image-height="853"><img class="u-back-image" src="https://pixabay.com/get/g632a64b6d1f3aa564c69f18c22f93934b60cf84c05ea22b38f6c271859aea2d70c35bca90c628c5b4ad7f6ce3c6d5cb03416da7a1053bca8bd3fea92bc4896b4_1280.jpg">
</div><div class="u-over-slide u-shading u-over-slide-2"><h3 class="u-gallery-heading"></h3><p class="u-gallery-text"></p>
</div>
</div><div class="u-effect-fade u-effect-hover-liftUp u-gallery-item u-gallery-item-3"><div class="u-back-slide" data-image-width="1280" data-image-height="905"><img class="u-back-image" src="https://pixabay.com/get/g8864968cfe3aab4776f3679aeef437cf3f677a2655245f51527ce01b02053560261ac6953010c202b58225c87d844700bc30d665743562138a816c8f793f8aa9_1280.jpg">
</div><div class="u-over-slide u-shading u-over-slide-3"><h3 class="u-gallery-heading"></h3><p class="u-gallery-text"></p>
</div>
</div></div>
        <a class="u-absolute-vcenter u-gallery-nav u-gallery-nav-prev u-grey-70 u-icon-circle u-opacity u-opacity-70 u-spacing-10 u-text-white u-gallery-nav-1" href="#" role="button">
          <span aria-hidden="true">
            <svg viewBox="0 0 451.847 451.847"><path d="M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0
c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744
c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z"></path></svg>
          </span>
          <span class="sr-only">
            <svg viewBox="0 0 451.847 451.847"><path d="M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0
c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744
c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z"></path></svg>
          </span>
        </a>
        <a class="u-absolute-vcenter u-gallery-nav u-gallery-nav-next u-grey-70 u-icon-circle u-opacity u-opacity-70 u-spacing-10 u-text-white u-gallery-nav-2" href="#" role="button">
          <span aria-hidden="true">
            <svg viewBox="0 0 451.846 451.847"><path d="M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744
L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284
c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z"></path></svg>
          </span>
          <span class="sr-only">
            <svg viewBox="0 0 451.846 451.847"><path d="M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744
L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284
c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z"></path></svg>
          </span>
        </a>
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
      <a class="u-link" href="https://nicepage.com/" target="_blank">
        <span>Web Design Software</span>
      </a>. 
    </section>
  </body>
</html>