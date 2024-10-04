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
      | joaco123  | joaco123 |


  @Iniciar_Sesion
  Esquema del escenario: : Usuario ingresa satisfactoriamente con sus credenciales al portal
    Dado que el cliente esta en la pagina de Parabank
    Cuando ingresa con su <usuario> y <password>
    Entonces el usuario deberia ver el mensaje de bienvenida Welcome Joaco1

    Ejemplos:
      | usuario   | password |
      | joaco123  | joaco123 |
