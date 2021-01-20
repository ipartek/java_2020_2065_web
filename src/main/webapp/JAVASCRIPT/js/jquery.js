
'use strict'; // ES5

$(function () {
    const h1s = $('h1');
    console.log(h1s.length);
    console.log(h1s);

    h1s.html('Hola desde bucle').css('color', 'cyan').each(function () {
        console.log(this);
    });

    $('#btn-saludar').on('click', function () {
        const iNombre = $('#nombre');
        console.log(iNombre);

        alert('Hola ' + iNombre.val());

        return false; // Cancelar la propagación del evento al navegador
    });

    $("#form").on('submit', function (e) {
        e.preventDefault();

        const nombreCompleto = $('#nombre-completo');
        const dni = $('#dni');

        console.log(nombreCompleto, dni);

        if (nombreCompleto.val() === 'Javier Lete') {
            if (!nombreCompleto.hasClass('error')) {
                //nombreCompleto.style = 'border: 1px solid red';
                nombreCompleto.addClass('error');
                console.log('Nombre reservado');

                $('<span>').html('Ese nombre está reservado').addClass('error').insertAfter(nombreCompleto);
            }
        } else {
            //nombreCompleto.style = 'border: 1px solid black';
            if (nombreCompleto.hasClass('error')) {
                nombreCompleto.next().remove();
                nombreCompleto.removeClass('error');
            }
        }

        if (!validarDni(dni.val())) {
            if (!dni.hasClass('error')) {
                //dni.style = 'border: 1px solid red';
                dni.addClass('error');
                console.log('El DNI es incorrecto');

                $('<span class="error">El DNI es incorrecto</span>').insertAfter(dni);
            }
        } else {
            if (dni.hasClass('error')) {
                //dni.style = 'border: 1px solid black';
                dni.removeClass('error');
                dni.next().remove();
            }
        }
    });
});

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
