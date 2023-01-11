Feature: Iniciar sesión en la aplicacion de saucedemo

  @login
  Scenario: Ingresar a la aplicacion con credenciales
    Given que el usuario ingrese a la pagina web
    When el usuario ingrese las credenciales "standard_user" "secret_sauce" y presione ingresar
    Then validar que estemos en la pagina principal "PRODUCTS"

  @OrderBy
  Scenario: Ordenar los productos de precio mayor a menor
    Given se da click en ordenar
    When click en "low-high"
    Then validar que los items esten ordenados

  @addToCart
  Scenario: Agregar un 2 productos al carrito y eliminar 1
    Given Agregar dos items al carrito
    When click en carrito y click remove al segundo item
    Then validar que se encuentre el item "Sauce Labs Onesie"

  @checkout
  Scenario: Realizar el checkout de la aplicacion
    Given En el carrito click en checkout
    When ingresar los datos "Wilmer" "Vasquez" "01059" luego click continue y click finish
    Then validar estar en la pagina de checkout "CHECKOUT: COMPLETE!"

@logout
Scenario: Salir de la aplicacion
  Given click menu
  When click logout
  Then validar estar en la pagina de login "LOGIN"
