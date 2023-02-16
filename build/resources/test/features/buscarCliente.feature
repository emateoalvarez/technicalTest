#language: es
Característica: Buscar un cliente

  Antecedentes: Login exitoso
    Dado que el usuario ingresa a la pagina

  Esquema del escenario: Buscar un cliente exitoso
    Cuando el usuario se loguea con su "<usuario>" y su "<contrasena>"
    Y el usuario introduce un "<ID>" de cliente en la barra de busqueda
    Entonces se espera que se encuentre al cliente

  Ejemplos:
    |usuario|contrasena|ID|
    |admin|serenity|ALFKI|