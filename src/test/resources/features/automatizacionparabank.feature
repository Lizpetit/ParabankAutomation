#Autor: Liz
#language: es

Característica: Automatizacion Pagina Banco Parabank

  @escenario1
  Esquema del escenario: ingresar a la pagina parabank con exito
    Dado que el usuario ingresa a la pagina de parabank
    Cuando ingresa su <usuario> y <clave>
    Entonces da click en LOGIN
    Y al ingresar observa el mensaje Welcome Usuario

    Ejemplos:
      | usuario   | clave |
      | liz123  | Liz123 |


