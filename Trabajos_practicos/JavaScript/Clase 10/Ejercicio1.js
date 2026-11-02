
const readline = require('readline');

function validatePassword(password) {
    const tieneLongitud = password.length >= 8;
    const tieneNumero = /[0-9]/.test(password);
    const tieneMayuscula = /[A-Z]/.test(password);

    return tieneLongitud && tieneNumero && tieneMayuscula;
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Ingrese una contraseña: ", function(password) {

    if (validatePassword(password)) {
        console.log("Contraseña correcta");
    } else {
        console.log("Contraseña incorrecta.");
        console.log("Debe cumplir estos requisitos:");
        console.log("- Mínimo 8 caracteres");
        console.log("- Al menos un número");
        console.log("- Al menos una mayúscula");
    }

    rl.close();
});
