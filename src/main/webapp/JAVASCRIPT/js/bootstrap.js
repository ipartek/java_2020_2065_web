window.onload = function() {
    document.getElementsByTagName('form')[0].onsubmit = function() {
        const dni = document.getElementById('dni');

        if(validarDni(dni.value)) {
            dni.setCustomValidity('');
        } else {
            dni.setCustomValidity('Error en el DNI');
        }
    };
};

/*
$(function() { // Carga del documento
    $('form').on('submit', function() {
        const dni = $('#dni');

        if(validarDni(dni.val())) {
            dni[0].setCustomValidity('');
        } else {
            dni[0].setCustomValidity('Error en el DNI');
        }
    });
});
*/
function validarDni(dni) {
    const letras = 'TRWAGMYFPDXBNJZSQVHLCKE';

    if (!/[XYZ\d]\d{7}[A-Z]/.test(dni)) {
        return false;
    }

    switch (dni.charAt(0)) {
        case 'X':
            dni = dni.replace('X', '0');
            break;
        case 'Y':
            dni = dni.replace('Y', '1');
            break;
        case 'Z':
            dni = dni.replace('Z', '2');
            break;
    }

    const numero = dni.substring(0, 8);

    const letra = letras[numero % 23];

    if (dni[8] !== letra) {
        return false;
    }

    return true;
}
