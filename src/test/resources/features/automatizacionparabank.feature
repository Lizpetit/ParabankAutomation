#Autor: Liz
#language: es

Característica: Automatizacion Pagina Banco Parabank

  @escenario1
  Esquema del escenario: ingresar a la pagina parabank con exito
    Dado que el usuario ingresa a la pagina de parabank
    Cuando ingresa su <usuario> y <clave>
    Entonces al ingresar observa el mensaje Welcome Usuario1

    Ejemplos:
      | usuario   | clave |
      | usuario1 | 123456 |


  @escenario2
  Esquema del escenario: ingresar a la pagina parabank sin exito
    Dado que el usuario ingresa a la pagina de parabank
    Cuando ingresa su <usuario> y <clave>
    Entonces observa el mensaje An internal error has occurred and has been logged.

    Ejemplos:
      | usuario   | clave |
      | usuario1 | 123456 |