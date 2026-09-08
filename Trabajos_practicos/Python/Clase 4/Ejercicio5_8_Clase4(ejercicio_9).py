frase = input(
    "Ingresa una frase: "
)  # Solicitamos al usuario que ingrese una frase y la guardamos en la variable frase.
print(frase)  # Imprimimos la frase ingresada por el usuario.

frase_sin_espacio = frase.replace(
    " ", ""
)  # Elimino los espacios de la frase utilizando el método replace().
print(frase_sin_espacio)  # Imprimimos la frase sin espacios.

longitud_frase = len(
    frase_sin_espacio
)  # Calculamos la longitud de la frase sin espacios utilizando la función len().
print(
    "La longitud de la frase sin espacios es:", longitud_frase
)  # Imprimimos la longitud de la frase sin espacios.
