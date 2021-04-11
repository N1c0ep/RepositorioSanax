/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.addEventListener('load', function (){
    document.getElementById('btniniciar').addEventListener('click', function () {
        var id = document.getElementById('txtid').value;
        var contraseña = document.getElementById('txtpass').value;

        var bandera = false;

        if (id.length > 0 && contraseña.length > 0) {
            bandera = true;
        }

        if (bandera) {
            document.getElementById('forminicio').submit();
        } else {
            alert('Por favor rellene todos los campos')
        }
    });
});
