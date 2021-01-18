/*
ES1
ES2
ES3
ES5
ES2015/ES6 * IE11 soporte parcial
ES2016
ES2017 * IE11 no tiene estas características
ES2018
ES2019
ES2020
ES2021
*/
'use strict'; // ES5

// interaccionesBasicas();
// consola();
//tiposDatos();
// arrays();
objetos();

function interaccionesBasicas() {
    alert('Hola Mundo desde fichero separado');

    //alert(confirmacion);

    //Declaración de variable ES5 o anterior
    var nombre = prompt('¿Cómo te llamas');

    alert('Hola ' + nombre);

    var confirmacion = confirm('¿Estás seguro?');

    alert(confirmacion);
}

function consola() {
    console.debug('debug');
    console.log('log');
    console.warn('warn');
    console.error('error');
}

function tiposDatos() {
    //Declaración de variable ES2015 o superior
    let x = 5;

    console.log(x, typeof x);

    x = 5.8;

    console.log(x, typeof x);

    const texto = 'hola';

    console.log(texto, typeof texto);

    x = new Date();

    console.log(x, typeof x);

    let y;

    console.log(y, y == undefined, typeof undefined);

    console.log(null, typeof null);

    let numeroRecibido, numero;

    do {
        numeroRecibido = prompt('Dime un número');

        console.log(numeroRecibido, typeof numeroRecibido);

        console.log(typeof numeroRecibido, typeof 5);

        numero = parseInt(numeroRecibido);

        console.log(numeroRecibido, typeof numeroRecibido, numero, typeof numero)

    } while (isNaN(numero)); //(numero == NaN); // No funciona ya que cualquier cosa comparada con NaN (incluso el propio NaN) da false

    // Compara también si el tipo es igual (ES5)
    if (numero === 0) {
        console.log('¡¡¡¡Has acertado el número de la suerte!!!!');
    } else {
        console.log('Ohhhhh, lo sentimos mucho, no ha ganado el premio de 500.000€');
    }
}

function arrays() {
    const arr = Array(3); // []

    console.log(arr);

    arr[0] = 6;
    arr[1] = 7;
    arr[2] = 8;

    arr[3] = 9;

    arr[8] = 10;

    arr[12] = 'laksdjflkasdjf';

    arr['dato'] = new Date();

    console.log('dato', arr['dato'], 'dato', arr.dato);

    console.log(arr, arr.length);

    for (let i = 0; i < arr.length; i++) {
        console.log(arr[i]);
    }

    for (let dato of arr) {
        console.log(dato);
    }

    for (let clave in arr) {
        console.log(clave, arr[clave]);
    }

    const diccionario = [];

    diccionario['casa'] = 'Home';
    diccionario['coche'] = 'Car';

    console.log(diccionario['casa']);
    console.log(diccionario.coche);
}

function objetos() {
    const persona = new Object(); // {}

    console.log(persona);

    persona.id = 5;
    persona.nombreCompleto = {};
    persona.nombreCompleto.nombre = 'Javier';
    persona.nombreCompleto['apellidos'] = 'Lete';

    console.log(persona);

    const p = new Object();

    p.id = 10;
    persona.nombre = 'Pepe';
    persona.apellidos = 'Pérez';

    persona.getNombreCompleto = devolverNombreCompleto;
    persona.getId = function () {
        return this.id;
    };

    console.log(persona.getId());
    console.log(persona.getNombreCompleto());

    var Persona = function(id, nombre, apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    Persona.prototype.getNombreCompleto = devolverNombreCompleto;

    var p1 = new Persona(1, 'Primero', 'Primerez');

    console.log(p1);
    console.log(p1.getNombreCompleto());

    var p2 = { id: 1, nombre: 'Primero', apellidos: 'Primerez' };

    console.log(p2);

    console.log(p1 == p2);
}

function devolverNombreCompleto() {
    return this.nombre + ' ' + this.apellidos;
}
/*
var devolverNombreCompleto = function() {
    return this.nombre + ' ' + this.apellidos;
}
*/