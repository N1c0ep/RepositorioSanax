<%-- 
    Document   : UsuarioVacunacionn
    Created on : 24/05/2021, 05:53:59 PM
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%
HttpSession objsession = request.getSession(false);
            String id = (String) objsession.getAttribute("id1");
   if (id.equals("")) {
           response.sendRedirect("Ingresar.jsp");
       }
         
%>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="01, 02, 03, 04">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>UsuarioVacunacion</title>
    <link rel="stylesheet" href="css/nicepage.css" media="screen">
<link rel="stylesheet" href="css/UsuarioVacunacion.css" media="screen">
    <script class="u-script" type="text/javascript" src="js/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="js/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.15.3, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">
    
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"url": "index.html",
		"logo": "images/Capturadepantalla2021-05-20162406.png"
}</script>
    <meta property="og:title" content="UsuarioVacunacion">
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
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Ingresar.jsp" style="padding: 10px 20px;">Cerrar cesion</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Ingresar.jsp" style="padding: 10px 20px;">Cerrar cesion</a>
</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
    <section class="u-align-center u-clearfix u-palette-1-light-1 u-section-1" id="sec-9631">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h2 class="u-text u-text-1">Bienvenido</h2>
        <p class="u-text u-text-2">Selecciona el proceso que quieres realizar mediante nuestra plataforma</p><span class="u-color-scheme-u10 u-color-style-multicolor-1 u-icon u-icon-circle u-icon-1"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 64 64" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-072d"></use></svg><svg class="u-svg-content" viewBox="0 0 64 64" id="svg-072d"><g id="Layer_27"><path d="m21 2h22v34h-22z" fill="#f4b2b0"></path><g fill="#b3404a"><path d="m60 8h-16v-6a1 1 0 0 0 -1-1h-22a1 1 0 0 0 -1 1v6h-16a3 3 0 0 0 -3 3v35a3 3 0 0 0 3 3h18.382l-2 4h-.382a5.006 5.006 0 0 0 -5 5v4a1 1 0 0 0 1 1h32a1 1 0 0 0 1-1v-4a5.006 5.006 0 0 0 -5-5h-.382l-2-4h18.382a3 3 0 0 0 3-3v-35a3 3 0 0 0 -3-3zm0 2a1 1 0 0 1 1 1v28h-2v-26a1 1 0 0 0 -1-1h-14v-2zm-38-7h20v32h-20zm21 34a1 1 0 0 0 1-1v-22h13v25h-50v-25h13v22a1 1 0 0 0 1 1zm-39-27h16v2h-14a1 1 0 0 0 -1 1v26h-2v-28a1 1 0 0 1 1-1zm43 48v3h-30v-3a3 3 0 0 1 3-3h24a3 3 0 0 1 3 3zm-5.618-5h-18.764l2-4h14.764zm18.618-6h-56a1 1 0 0 1 -1-1v-5h58v5a1 1 0 0 1 -1 1z"></path><path d="m31 43h2v2h-2z"></path><path d="m53 35h2v2h-2z"></path><path d="m49 35h2v2h-2z"></path><path d="m45 35h2v2h-2z"></path><path d="m31 11h2v-2h2v-2h-2v-2h-2v2h-2v2h2z"></path><path d="m28 13h8v2h-8z"></path><path d="m24 17h16v2h-16z"></path><path d="m24 21h16v2h-16z"></path><path d="m24 25h16v2h-16z"></path><path d="m24 29h16v2h-16z"></path><path d="m38 13h2v2h-2z"></path>
</g>
</g></svg>
      
      
    </span>
      </div>
    </section>
    <section class="u-clearfix u-palette-1-light-3 u-section-2" id="carousel_192d">
      <div class="u-clearfix u-sheet u-valign-middle-md u-valign-middle-sm u-valign-middle-xs u-sheet-1">
        <div class="u-expanded-width-md u-opacity u-opacity-65 u-shape u-shape-svg u-text-palette-1-base u-shape-1">
          <svg class="u-svg-link" preserveAspectRatio="none" viewBox="0 0 160 150" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-7553"></use></svg>
          <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 160 150" x="0px" y="0px" id="svg-7553"><path d="M43.2,126.9c14.2,1.3,27.6,7,39.1,15.6c8.3,6.1,19.4,10.3,32.7,5.3c11.7-4.4,18.6-17.4,21-30.2c2.6-13.3,8.1-25.9,15.7-37.1
	c8.3-12.1,10.8-27.9,5.3-42.7C150.5,20.3,134.6,9,117,7.6C107.9,6.9,98.8,5,90.1,1.9C83-0.6,75-0.7,67.4,2.1
	c-9.9,3.7-17,11.6-20.1,21c-3.3,10.1-10.9,18-20.6,22.2c-0.1,0-0.1,0.1-0.2,0.1c-20.3,8.9-31,32-24.6,53.2
	C6.9,115.6,25.2,125.2,43.2,126.9z"></path></svg>
        </div>
        <div class="u-list u-list-1">
          <div class="u-repeater u-repeater-1">
            <div class="u-align-center u-container-style u-list-item u-repeater-item u-white u-list-item-1">
              <div class="u-container-layout u-similar-container u-valign-bottom u-container-layout-1">
                <h2 class="u-custom-font u-font-montserrat u-text u-text-1">Agendar&nbsp;<br>Cita 
                </h2><span class="u-icon u-icon-circle u-text-palette-1-base u-icon-1" data-href="AgendarCita.jsp"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 508 508" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-139f"></use></svg><svg class="u-svg-content" viewBox="0 0 508 508" x="0px" y="0px" id="svg-139f" style="enable-background:new 0 0 508 508;"><circle style="fill:#FD8469;" cx="254" cy="254" r="254"></circle><path style="fill:#FFFFFF;" d="M386,131.6H122c-9.6,0-17.2,7.6-17.2,17.2v213.6c0,9.6,7.6,17.2,17.2,17.2h264  c9.6,0,17.2-7.6,17.2-17.2V148.8C402.8,139.2,395.2,131.6,386,131.6z"></path><path style="fill:#4CDBC4;" d="M402.8,197.6v-48.8c0-9.6-7.6-17.2-17.2-17.2H122c-9.6,0-17.2,7.6-17.2,17.2v48.8H402.8z"></path><g><path style="fill:#324A5E;" d="M172,164.8L172,164.8c-6,0-10.8-4.8-10.8-10.8v-45.2c0-6,4.8-10.8,10.8-10.8l0,0   c6,0,10.8,4.8,10.8,10.8V154C182.8,160,178,164.8,172,164.8z"></path><path style="fill:#324A5E;" d="M336,164.8L336,164.8c-6,0-10.8-4.8-10.8-10.8v-45.2c0-6,4.8-10.8,10.8-10.8l0,0   c6,0,10.8,4.8,10.8,10.8V154C346.8,160,341.6,164.8,336,164.8z"></path>
</g><g><rect x="206.8" y="221.2" style="fill:#CED5E0;" width="30" height="30"></rect><rect x="271.2" y="221.2" style="fill:#CED5E0;" width="30" height="30"></rect><rect x="336" y="221.2" style="fill:#CED5E0;" width="30" height="30"></rect><rect x="142" y="271.6" style="fill:#CED5E0;" width="30" height="30"></rect><rect x="206.8" y="271.6" style="fill:#CED5E0;" width="30" height="30"></rect><rect x="271.2" y="271.6" style="fill:#CED5E0;" width="30" height="30"></rect>
</g><rect x="336" y="271.6" style="fill:#FF7058;" width="30" height="30"></rect><g><rect x="142" y="322" style="fill:#CED5E0;" width="30" height="30"></rect><rect x="206.8" y="322" style="fill:#CED5E0;" width="30" height="30"></rect><rect x="271.2" y="322" style="fill:#CED5E0;" width="30" height="30"></rect>
</g></svg></span>
              </div>
            </div>
            <div class="u-align-center u-container-style u-list-item u-repeater-item u-white u-list-item-2">
              <div class="u-container-layout u-similar-container u-valign-bottom u-container-layout-2">
                <h2 class="u-custom-font u-font-montserrat u-text u-text-2">Consultar&nbsp;<br>Cita
                </h2><span class="u-icon u-icon-circle u-icon-2" data-href="ConsultarInfo.jsp"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-19c0"></use></svg><svg class="u-svg-content" viewBox="0 0 512 512" x="0px" y="0px" id="svg-19c0" style="enable-background:new 0 0 512 512;"><path style="fill:#4DBBEB;" d="M493.21,450.79c11.72,11.71,11.72,30.71,0,42.42c-5.86,5.86-13.53,8.79-21.21,8.79  s-15.35-2.93-21.21-8.79l-96.57-96.57c15.77-12.4,30.02-26.65,42.42-42.42L493.21,450.79z"></path><path style="fill:#FFF5CD;" d="M353.83,311.41l42.81,42.81c-12.4,15.77-26.65,30.02-42.42,42.42l-42.81-42.81v-0.01  c16.27-11.81,30.6-26.14,42.41-42.41H353.83z"></path><path style="fill:#4DBBEB;" d="M390,200c0,41.58-13.43,80.09-36.18,111.41c-11.81,16.27-26.14,30.6-42.41,42.41  C280.09,376.57,241.58,390,200,390C95.23,390,10,304.77,10,200S95.23,10,200,10S390,95.23,390,200z"></path><path style="fill:#BEE7F4;" d="M200,50c82.71,0,150,67.29,150,150s-67.29,150-150,150S50,282.71,50,200S117.29,50,200,50z"></path><path d="M500.281,443.719l-133.48-133.48C388.546,277.485,400,239.555,400,200C400,89.72,310.28,0,200,0S0,89.72,0,200  s89.72,200,200,200c39.556,0,77.486-11.455,110.239-33.198l36.895,36.895c0.005,0.005,0.01,0.01,0.016,0.016l96.568,96.568  C451.276,507.838,461.319,512,472,512s20.724-4.162,28.278-11.716C507.837,492.731,512,482.687,512,472  S507.837,451.269,500.281,443.719z M326.516,354.793c10.35-8.467,19.811-17.928,28.277-28.277l28.371,28.371  c-8.628,10.183-18.094,19.65-28.277,28.277L326.516,354.793z M20,200c0-99.252,80.748-180,180-180s180,80.748,180,180  c0,38.175-11.851,74.667-34.272,105.535c-11.217,15.453-24.739,28.976-40.192,40.192c0,0.001-0.001,0.001-0.002,0.002  C274.667,368.149,238.175,380,200,380C100.748,380,20,299.252,20,200z M486.139,486.139c-3.78,3.78-8.801,5.861-14.139,5.861  s-10.359-2.081-14.139-5.861l-88.795-88.795c10.127-8.691,19.587-18.15,28.277-28.277l88.798,88.798  C489.919,461.639,492,466.658,492,472S489.919,482.361,486.139,486.139z"></path><path d="M360,200c0-88.225-71.775-160-160-160S40,111.775,40,200s71.775,160,160,160S360,288.225,360,200z M200,340  c-77.196,0-140-62.804-140-140S122.804,60,200,60s140,62.804,140,140S277.196,340,200,340z"></path><path d="M306.317,169.995c5.155-1.981,7.729-7.766,5.748-12.922c-8.611-22.412-23.604-41.574-43.36-55.413  C248.479,87.49,224.721,80,200,80c-5.522,0-10,4.478-10,10s4.478,10,10,10c41.099,0,78.631,25.818,93.396,64.247  c1.528,3.976,5.317,6.416,9.337,6.416C303.925,170.663,305.138,170.448,306.317,169.995z"></path><path d="M310,190c-5.52,0-10,4.48-10,10s4.48,10,10,10s10-4.48,10-10S315.52,190,310,190z"></path></svg></span>
              </div>
            </div>
            <div class="u-align-center u-container-style u-list-item u-repeater-item u-white u-list-item-3">
              <div class="u-container-layout u-similar-container u-valign-bottom u-container-layout-3">
                <h2 class="u-custom-font u-font-montserrat u-text u-text-3">Cancelar<br>Cita
                </h2><span class="u-icon u-icon-circle u-icon-3" data-href="CancelarInfo.jsp"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-faef"></use></svg><svg class="u-svg-content" viewBox="0 0 512 512" id="svg-faef"><g><g><path d="m415.158 85.758c-.268.087-93.932 27.686-94.198 27.777-10.041 3.493-16.788 12.983-16.788 23.614v42.223c0 8.285 6.716 15.001 15.001 15.001h114.008c8.285 0 15.001-6.716 15.001-15.001v-69.935c0-17.077-16.817-29.172-33.024-23.679z" fill="#ff5e94"></path><path d="m160.161 164.371v282.624c0 35.844 29.161 65.005 65.005 65.005h158.012c35.844 0 65.005-29.161 65.005-65.005 0-15.734 0-274.731 0-282.624z" fill="#9dcfff"></path><path d="m304.172 164.371v347.629h79.006c35.843 0 65.005-29.162 65.005-65.005v-282.624z" fill="#72bbff"></path><g fill="#5a5a5a"><path d="m237.431 233.376c-8.285 0-15.001 6.716-15.001 15.001v179.616c0 8.285 6.716 15.001 15.001 15.001s15.001-6.716 15.001-15.001v-179.616c0-8.285-6.717-15.001-15.001-15.001z"></path><path d="m304.171 233.376c-8.285 0-15.001 6.716-15.001 15.001v179.616c0 8.285 6.716 15.001 15.001 15.001s15.001-6.716 15.001-15.001v-179.616c0-8.285-6.716-15.001-15.001-15.001z"></path>
</g><g fill="#444"><path d="m319.172 248.381v179.613c0 8.281-6.72 15.001-15.001 15.001v-209.615c8.281 0 15.001 6.71 15.001 15.001z"></path><path d="m370.912 233.376c-8.285 0-15.001 6.716-15.001 15.001v179.616c0 8.285 6.716 15.001 15.001 15.001s15.001-6.716 15.001-15.001v-179.616c0-8.285-6.716-15.001-15.001-15.001z"></path>
</g><path d="m192.17 18.07s0 0-.01 0c-15.336-9.588-36.016-7.793-49.46 5.65v.01l-27.58 27.57-27.58 27.58c-15.6 15.6-15.6 40.98 0 56.57l14.15 14.15 20.31-2.1.9-19.12-14.14-14.14c-3.9-3.9-3.9-10.25 0-14.14l27.58-27.58 27.57-27.58h.01c3.689-3.689 10.025-4.116 14.13-.01l14.15 14.15 18.55-3.08 2.67-18.13c-14.806-14.806-16.41-16.818-21.25-19.8z" fill="#5a5a5a"></path><path d="m192.17 18.07s0 0-.01 0c-15.297-9.564-35.968-7.831-49.46 5.66l-27.58 27.57 21.22 21.22 27.58-27.58c3.686-3.686 10.017-4.124 14.13-.01l14.15 14.15 21.22-21.21c-15.291-15.291-16.162-16.574-21.25-19.8z" fill="#444"></path><path d="m317.418 37.108-26.872-26.872c-13.647-13.647-35.853-13.647-49.501 0l-166.992 166.991c-13.647 13.647-13.647 35.853 0 49.501l26.872 26.872c5.857 5.858 15.356 5.859 21.214 0l195.279-195.278c5.858-5.858 5.858-15.356 0-21.214z" fill="#3ba9ff"></path><path d="m290.545 10.236 26.872 26.872c5.855 5.855 5.862 15.352 0 21.215l-97.637 97.637-62.23-62.23 83.494-83.494c13.648-13.648 35.853-13.648 49.501 0z" fill="#0081ff"></path>
</g>
</g></svg></span>
              </div>
            </div>
            <div class="u-align-center u-container-style u-list-item u-repeater-item u-white u-list-item-4">
              <div class="u-container-layout u-similar-container u-valign-bottom u-container-layout-4">
                <h2 class="u-custom-font u-font-montserrat u-text u-text-4">Actualizar&nbsp;<br>Datos
                </h2><span class="u-icon u-icon-circle u-icon-4" data-href="ActualizarInfo.jsp"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-43af"></use></svg><svg class="u-svg-content" viewBox="0 0 512 512" x="0px" y="0px" id="svg-43af" style="enable-background:new 0 0 512 512;"><path style="fill:#6C7D87;" d="M394.685,484.734c-0.361-1.811-22.352-112.29-22.594-113.425c-2.641-12.788-9.797-22.584-20.3-28.895  c-6.296-3.798-9.871-4.403-13.954-5.658c2.87,1.003-52.627-18.393-74.99-26.209c-4.426-1.518-7.399-5.68-7.399-10.359v-22.963  c-28.723,14.362-58.843,13.455-85.578,0.408v22.555c0,4.679-2.973,8.842-7.399,10.359c-3.152,1.081,11.418-3.915-30.827,10.57  h-0.029c0.001,0.003,0.003,0.006,0.003,0.006l-0.003,0.005l-44.103,15.628c-2.036,0.601-6.058,1.788-5.802,1.712  c-10.492,3.913-19.59,11.344-24.688,21.735c-3.529,7.158-2.482,4.644-19.607,90.609c-6.341,32.836-7.741,35.228-6.948,42.564  c2.207,20.506,23.299,18.366,23.87,18.615c40.442,0,162.31,0,158.472,0c0.425,0,18.651,0,17.518,0c28.162,0,127.999,0,140.68,0  C371.233,511.915,398.822,514.015,394.685,484.734z"></path><path style="fill:#566A75;" d="M56.42,484.734l22.593-123.729c-0.313,1.503,1.677-16.55,18.661-27.851  c-18.968,6.721-13.089,4.032-18.92,6.531c-11.007,4.971-19.543,13.417-23.752,25.319c-1.684,4.78-0.592,0.578-17.586,85.807  c-6.341,32.836-7.74,35.231-6.948,42.564c2.207,20.506,23.299,18.366,23.87,18.615c2.514,0,22.655,0,25.758,0  C61.922,511.991,54.069,501.363,56.42,484.734z"></path><path style="fill:#DD9A5E;" d="M100.955,511.991c-14.707,0-31.647,0-46.618,0c-0.597-0.261-24.638,2.154-24.037-22.908  c0.131-5.344,0.8-5.569,7.115-38.272l0.365-1.833h63.175V511.991z"></path><path style="fill:#D18C54;" d="M62.949,448.979H37.781l-0.365,1.832c-6.338,32.817-6.984,32.92-7.115,38.272  c-0.599,24.979,23.563,22.701,24.037,22.908c2.514,0,22.655,0,25.758,0c-16.739,0-24.375-8.806-24.037-22.908  C56.099,487.446,56.709,484.023,62.949,448.979z"></path><path style="fill:#DD9A5E;" d="M169.87,273.671c0,64.056,0-7.297,0.001,43.155h0.027v1.542c0,10.249,6.546,19.359,16.264,22.613  c15.596,5.222,35.62,5.817,52.993,0c9.719-3.254,16.264-12.363,16.264-22.613v-1.542h0.027c0-10.039,0.001-37.785,0.001-43.155  C227.722,288.454,196.459,287.849,169.87,273.671z"></path><path style="fill:#D18C54;" d="M195.662,325.39h-0.033c-0.002-53.629-0.001-35.76-0.002-39.505  c-8.89-1.782-17.559-4.842-25.758-9.214c0,64.056,0-10.297,0.001,40.155h0.027v1.542c0,10.249,6.546,19.359,16.264,22.613  c4.806,1.609,9.881,2.772,15.15,3.444C194.761,335.531,195.762,326.071,195.662,325.39z"></path><path style="fill:#566A75;" d="M100.955,423.702c-4.268,0-7.728,3.459-7.728,7.728v80.561c5.36,0,9.702,0,15.455,0V431.43  C108.683,427.161,105.223,423.702,100.955,423.702z"></path><path style="fill:#C6C6C6;" d="M462.833,511.991H212.658c-10.438,0-18.9-8.462-18.9-18.9l0,0c0-5.982,4.85-10.832,10.832-10.832  h266.311c5.982,0,10.832,4.85,10.832,10.832l0,0C481.733,503.529,473.271,511.991,462.833,511.991z"></path><path style="fill:#B7B7B7;" d="M242.44,493.091L242.44,493.091c0-5.982,4.85-10.832,10.832-10.832H204.59  c-5.982,0-10.832,4.85-10.832,10.832v0.001c0,10.438,8.462,18.9,18.9,18.9h48.681C250.901,511.991,242.44,503.529,242.44,493.091z"></path><path style="fill:#EDEDED;" d="M446.446,316.826H229.045c-6.8,0-12.364,5.564-12.364,12.364v140.705  c0,6.8,5.564,12.364,12.364,12.364h217.401c6.8,0,12.364-5.564,12.364-12.364V329.19C458.81,322.39,453.246,316.826,446.446,316.826  z"></path><g><path style="fill:#DADADA;" d="M242.44,469.895V329.19c0-6.8,5.564-12.364,12.364-12.364h-25.758   c-6.8,0-12.364,5.564-12.364,12.364v140.705c0,6.8,5.564,12.364,12.364,12.364h25.758   C248.004,482.259,242.44,476.695,242.44,469.895z"></path><circle style="fill:#DADADA;" cx="337.75" cy="399.54" r="17.859"></circle>
</g><path style="fill:#C6C6C6;" d="M337.754,381.698c-13.617-0.022-22.389,14.799-15.475,26.774c6.917,11.98,24.136,11.784,30.925-0.014  C339.467,408.439,330.89,393.625,337.754,381.698z"></path><path style="fill:#4C4846;" d="M210.329,0.122C143.77,0.376,87.577,54.712,87.577,123.744v46.85h247.279c0-44.397,0-30.37,0-70.089  c0-47.873-29.453-58.901-29.453-58.901C268.775-3.559,210.378,0.121,210.378,0.121"></path><path style="fill:#3D3938;" d="M227.032,0.86c-75.434-8.587-136.82,48.348-139.35,118.012c-0.195,5.009-0.064,3.135-0.105,51.722  h29.453v-46.85C117.03,59.792,165.44,7.62,227.032,0.86z"></path><g><path style="fill:#DD9A5E;" d="M118.03,155.882c-15.508-5.526-32.343,4.751-32.343,19.745c0,14.99,16.833,25.272,32.343,19.745   V155.882z"></path><path style="fill:#DD9A5E;" d="M304.403,155.882c15.508-5.526,32.343,4.751,32.343,19.745c0,14.99-16.833,25.272-32.343,19.745   V155.882z"></path>
</g><g><path style="fill:#D18C54;" d="M87.952,166.548c-9.059,17.197,10.014,35.974,30.078,28.825v-18.159   C106.329,181.382,93.246,176.6,87.952,166.548z"></path><path style="fill:#D18C54;" d="M304.403,177.214v18.159c20.063,7.149,39.136-11.627,30.078-28.825   C330.693,173.742,316.108,181.384,304.403,177.214z"></path>
</g><path style="fill:#EDAE6B;" d="M301.153,116.757c2.402,0.232,4.25,2.225,4.25,4.638c0,79.299,0.052,73.312-0.133,76.999  c-1.222,24.119-11.537,46.265-28.314,62.634c-58.791,57.322-156.895,16.67-159.846-63.736c-0.138-3.545-0.08-44.617-0.08-44.501  c0-18.467,16.389-32.557,34.667-29.918c28.787,4.155,70.806,2.541,107.47-28.799c3.767-3.22,9.485-2.18,11.891,2.153  C275.601,104.408,284.634,115.163,301.153,116.757z"></path><path style="fill:#DD9A5E;" d="M142.881,197.292c-0.118-3.04-0.093-58.677-0.083-74.394c-14.377,2.157-25.767,14.5-25.767,29.893  c0-0.116-0.058,40.956,0.08,44.501c2.175,59.284,56.078,96.947,107.812,89.673C182.445,281.092,144.694,246.704,142.881,197.292z"></path></svg></span>
              </div>
            </div>
            <div class="u-align-center u-container-style u-list-item u-repeater-item u-white u-list-item-5">
              <div class="u-container-layout u-similar-container u-valign-bottom u-container-layout-5">
                <h2 class="u-custom-font u-font-montserrat u-text u-text-5">Modificar<br>Cita
                </h2><span class="u-icon u-icon-circle u-icon-5" data-href="ModificarCitaInfo.jsp"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-3dfe"></use></svg><svg class="u-svg-content" viewBox="0 0 512 512" x="0px" y="0px" id="svg-3dfe" style="enable-background:new 0 0 512 512;"><g><path style="fill:#42B05C;" d="M211.862,370.638H17.655C7.901,370.638,0,362.737,0,352.983V158.776   c0-9.754,7.901-17.655,17.655-17.655h194.207c9.754,0,17.655,7.901,17.655,17.655v194.207   C229.517,362.737,221.617,370.638,211.862,370.638"></path><g><path style="fill:#FFFFFF;" d="M123.586,194.086H35.31c-4.873,0-8.828-3.955-8.828-8.828c0-4.873,3.955-8.828,8.828-8.828h88.276    c4.873,0,8.828,3.955,8.828,8.828C132.414,190.131,128.459,194.086,123.586,194.086"></path><path style="fill:#FFFFFF;" d="M158.897,229.397H61.793c-4.873,0-8.828-3.955-8.828-8.828s3.955-8.828,8.828-8.828h97.103    c4.873,0,8.828,3.955,8.828,8.828S163.769,229.397,158.897,229.397"></path><path style="fill:#FFFFFF;" d="M123.586,264.707H35.31c-4.873,0-8.828-3.955-8.828-8.828s3.955-8.828,8.828-8.828h88.276    c4.873,0,8.828,3.955,8.828,8.828S128.459,264.707,123.586,264.707"></path><path style="fill:#FFFFFF;" d="M70.621,300.017H35.31c-4.873,0-8.828-3.955-8.828-8.828s3.955-8.828,8.828-8.828h35.31    c4.873,0,8.828,3.955,8.828,8.828S75.494,300.017,70.621,300.017"></path><path style="fill:#FFFFFF;" d="M123.586,335.328H52.966c-4.873,0-8.828-3.955-8.828-8.828c0-4.873,3.955-8.828,8.828-8.828h70.621    c4.873,0,8.828,3.955,8.828,8.828C132.414,331.373,128.459,335.328,123.586,335.328"></path>
</g><path style="fill:#ED7161;" d="M494.345,370.638H300.138c-9.754,0-17.655-7.901-17.655-17.655V158.776   c0-9.754,7.901-17.655,17.655-17.655h194.207c9.754,0,17.655,7.901,17.655,17.655v194.207   C512,362.737,504.099,370.638,494.345,370.638"></path><g><path style="fill:#FFFFFF;" d="M406.069,194.086h-88.276c-4.873,0-8.828-3.955-8.828-8.828c0-4.873,3.955-8.828,8.828-8.828    h88.276c4.873,0,8.828,3.955,8.828,8.828C414.897,190.131,410.942,194.086,406.069,194.086"></path><path style="fill:#FFFFFF;" d="M441.379,229.397h-97.103c-4.873,0-8.828-3.955-8.828-8.828s3.955-8.828,8.828-8.828h97.103    c4.873,0,8.828,3.955,8.828,8.828S446.252,229.397,441.379,229.397"></path><path style="fill:#FFFFFF;" d="M406.069,264.707h-88.276c-4.873,0-8.828-3.955-8.828-8.828s3.955-8.828,8.828-8.828h88.276    c4.873,0,8.828,3.955,8.828,8.828S410.942,264.707,406.069,264.707"></path><path style="fill:#FFFFFF;" d="M353.103,300.017h-35.31c-4.873,0-8.828-3.955-8.828-8.828s3.955-8.828,8.828-8.828h35.31    c4.873,0,8.828,3.955,8.828,8.828S357.976,300.017,353.103,300.017"></path><path style="fill:#FFFFFF;" d="M406.069,335.328h-70.621c-4.873,0-8.828-3.955-8.828-8.828c0-4.873,3.955-8.828,8.828-8.828    h70.621c4.873,0,8.828,3.955,8.828,8.828C414.897,331.373,410.942,335.328,406.069,335.328"></path>
</g><g><path style="fill:#48A0DC;" d="M338.056,107.992c-3.69,0-7.133-2.339-8.369-6.029c-1.554-4.626,0.945-9.622,5.561-11.176    l50.812-17.02l-17.02-50.82c-1.554-4.626,0.945-9.631,5.561-11.176c4.634-1.562,9.631,0.945,11.176,5.561l19.836,59.189    c1.545,4.626-0.945,9.631-5.57,11.176l-59.18,19.836C339.927,107.842,338.983,107.992,338.056,107.992"></path><path style="fill:#48A0DC;" d="M397.233,88.155c-1.306,0-2.631-0.291-3.884-0.909C343.64,62.811,303.845,52.845,256,52.845    s-87.64,9.966-137.348,34.401c-4.387,2.154-9.666,0.353-11.811-4.025c-2.154-4.378-0.353-9.666,4.025-11.811    C163.187,45.677,205.233,35.19,256,35.19c50.759,0,92.813,10.487,145.134,36.22c4.378,2.145,6.179,7.433,4.025,11.811    C403.633,86.346,400.499,88.155,397.233,88.155"></path><path style="fill:#48A0DC;" d="M134.591,500.694c-3.69,0-7.133-2.339-8.369-6.029l-19.836-59.18    c-1.545-4.626,0.945-9.631,5.57-11.176l59.18-19.836c4.643-1.554,9.631,0.953,11.176,5.561c1.554,4.626-0.945,9.631-5.561,11.185    l-50.812,17.02l17.02,50.82c1.554,4.626-0.945,9.622-5.561,11.176C136.462,500.544,135.518,500.694,134.591,500.694"></path><path style="fill:#48A0DC;" d="M256,476.814c-50.759,0-92.813-10.487-145.134-36.22c-4.378-2.145-6.179-7.433-4.025-11.811    c2.145-4.37,7.433-6.179,11.811-4.025c49.708,24.435,89.503,34.401,137.348,34.401s87.64-9.966,137.348-34.401    c4.387-2.163,9.666-0.353,11.811,4.025c2.154,4.379,0.353,9.666-4.025,11.811C348.813,466.327,306.759,476.814,256,476.814"></path>
</g>
</g></svg></span>
              </div>
            </div>
            <div class="u-align-center u-container-style u-list-item u-repeater-item u-white u-list-item-6">
              <div class="u-container-layout u-similar-container u-valign-bottom u-container-layout-6">
                <h2 class="u-custom-font u-font-montserrat u-text u-text-6">Registro<br>Vacuna
                </h2><span class="u-icon u-icon-circle u-icon-6" data-href="RegistrarEstadoVac.jsp"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 24 24" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-bcda"></use></svg><svg class="u-svg-content" viewBox="0 0 24 24" id="svg-bcda"><path d="m14.25 3h-11.5c-1.52 0-2.75 1.23-2.75 2.75v12.5c0 1.52 1.23 2.75 2.75 2.75h6.59c-.54-1.14-.84-2.41-.84-3.75l.01-.25h-4.76c-.41 0-.75-.34-.75-.75s.34-.75.75-.75h4.93c.12-.61.31-1.2.55-1.75h-5.48c-.41 0-.75-.34-.75-.75s.34-.75.75-.75h6.33c.45-.65 1-1.24 1.61-1.75h-7.94c-.41 0-.75-.34-.75-.75s.34-.75.75-.75h9.5c.21 0 .39.08.53.22.99-.43 2.08-.68 3.22-.71v-2.76c0-1.52-1.23-2.75-2.75-2.75z" fill="#2196f3"></path><path d="m12.25 2h-1.1c-.33-1.15-1.39-2-2.65-2s-2.32.85-2.65 2h-1.1c-.41 0-.75.34-.75.75v2c0 .96.79 1.75 1.75 1.75h5.5c.96 0 1.75-.79 1.75-1.75v-2c0-.41-.34-.75-.75-.75z" fill="#1976d2"></path><g fill="#fff"><path d="m13.78 9.22c-.76.33-1.46.761-2.09 1.28h-7.94c-.41 0-.75-.34-.75-.75s.34-.75.75-.75h9.5c.21 0 .39.08.53.22z"></path><path d="m10.08 12.25c-.33.47-.62.97-.85 1.5h-5.48c-.41 0-.75-.34-.75-.75s.34-.75.75-.75z"></path><path d="m8.68 15.5c-.1.49-.16.99-.17 1.5h-4.76c-.41 0-.75-.34-.75-.75s.34-.75.75-.75z"></path>
</g><path d="m4 3h-1.25c-1.52 0-2.75 1.23-2.75 2.75v12.5c0 1.52 1.23 2.75 2.75 2.75h5.75v-3.75-.25h-4.75c-.41 0-.75-.34-.75-.75 0-.41.34-.75.75-.75h4.75v-1.75h-4.75c-.41 0-.75-.34-.75-.75 0-.41.34-.75.75-.75h4.75v-1.75h-4.75c-.41 0-.75-.34-.75-.75 0-.41.34-.75.75-.75h4.75v-2.5h-2.75c-.96 0-1.75-.79-1.75-1.75z" fill="#1d83d4"></path><path d="m8.5 0c-1.26 0-2.32.85-2.65 2h-1.1c-.41 0-.75.34-.75.75v.25 1.75c0 .96.79 1.75 1.75 1.75h2.75z" fill="#1667b7"></path><path d="m8.5 9h-4.75c-.41 0-.75.34-.75.75 0 .41.34.75.75.75h4.75z" fill="#dedede"></path><path d="m8.5 12.25h-4.75c-.41 0-.75.34-.75.75 0 .41.34.75.75.75h4.75z" fill="#dedede"></path><path d="m8.5 15.5h-4.75c-.41 0-.75.34-.75.75 0 .41.34.75.75.75h4.75z" fill="#dedede"></path><path d="m17.25 24c-3.722 0-6.75-3.027-6.75-6.75s3.028-6.75 6.75-6.75 6.75 3.027 6.75 6.75-3.028 6.75-6.75 6.75z" fill="#4caf50"></path><path d="m16.25 20.25c-.265 0-.519-.106-.707-.293l-2-2c-.391-.391-.391-1.023 0-1.414s1.023-.391 1.414 0l1.244 1.244 2.796-3.195c.364-.414.995-.458 1.411-.094.416.363.457.994.094 1.41l-3.5 4c-.182.209-.442.332-.719.342z" fill="#fff"></path><path d="m17.25 10.5c-3.722 0-6.75 3.027-6.75 6.75s3.028 6.75 6.75 6.75v-4.375l-.248.283c-.182.209-.442.332-.719.342h-.033c-.265 0-.519-.106-.707-.293l-2-2c-.391-.391-.391-1.023 0-1.414.195-.195.451-.293.707-.293s.512.098.707.293l1.244 1.244 1.049-1.199z" fill="#429846"></path><path d="m14.25 16.25c-.256 0-.512.098-.707.293-.391.391-.391 1.023 0 1.414l2 2c.188.188.442.293.707.293h.033c.277-.01.537-.133.719-.342l.248-.283v-3.037l-1.049 1.199-1.244-1.244c-.195-.195-.451-.293-.707-.293z" fill="#dedede"></path></svg></span>
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
      <a class="u-link" href="https://nicepage.com/css-templates" target="_blank">
        <span>Free CSS Templates</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="https://nicepage.com/html-website-builder" target="_blank">
        <span>HTML Builder</span>
      </a>. 
    </section>
  </body>
</html>
