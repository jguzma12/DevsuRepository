# DevsuAutomation
El objetivo general es implementar la automatizacion hacia la pagina web https://www.demoblaze.com, específicamente al flujo que tiene la aplicacion para poder crear un usario, iniciar seccion, realizar una compra exitosa. A manera de obtener un sistema que pueda ser ejecutado para realizar la compra de diferentes articulos y realizar el pago.

#HERRAMIENTAS UTILIZADAS Se emplea el IDE de IntelliJ. Se usa el driver de google en su ultima version 119.0.6045.200 para ejecucion de la automatizacion. SerenityBDD, Screenplay, lenguaje Gherkin, Cucumber.

#ESTRATEGIA DE AUTOMATIZACIÓN. El proyecto hace uso del patrón Screenplay, con Cucumber y Gradle. Screenplay se orienta en el usuario y específicamente en las tareas, además utiliza los principios S.O.L.I.D. Con este patrón de pruebas se pueden escribir en un lenguaje más natural y entendible. El proyecto se estructura de la siguiente manera: Task: Son las tareas que realiza el actor a nivel de negocio. User-Interface: Donde se realiza el mapeo de los target con los que el usuario interactúa. Question: Donde se realizan los Assert y las verificaciones del proceso. Model: Clases donde se encuentran los objetos complejos de negocio. Feature: Donde se narran los casos de prueba utilizando el lenguaje Gherkin.

#DESCRIPCIÓN GENERAL AUTOMATIZACIONES

Las automatizaciones fueron a los procesos de creacion de usuario, inicio de sesion compra de articulos a lo cual se le hizo el debido flujo para poder ejecutar la transaccion. A estos tres escenarios:
Los datos ingresados fueron manejados por medio de un data table para mayor practicidad dado el tiempo de la prueba.
#Escenarios
  @registroususer
  Scenario: The user registers on the page
    When The user enters the fields for registration
    Then The user register succesfully

  @correctsessionlogins
  Scenario: The user logs in successfully and observes the product data
    When The user logs in successfully
    Then the user can see username

  @buylaptops
  Scenario: User logs in successfully and purchases a laptop
    When the user logs in successfully, they go to the laptop section and purchase one.
    Then The user can see a message after confirming their purchase

#Validaciones
En las validaciones que se plantearon a realizar fueron hechas a partir de los mensajes que muestra la pagina al finalizar la ejecucion de la compra, registro e inicio de sesion. 


# DevsuAutomation
Prueba de la API con los siguientes servicios: Signup: https://api.demoblaze.com/signup Login: https://api.demoblaze.com/login creando escenarios para los siguientes casos:

Crear un nuevo usuario en signup.
Intentar crear un usuario ya existente.
Usuario y password correcto en login.
Usuario y password incorrecto en login.

#Escenarios
 
  Scenario: create a user
    * def jsonRequest = read('../json/user_create.json')
    * def jsonResponse1 = read('../json/message_create_ok.json')
    * print 'created response is: ', jsonResponse1
    Given url 'https://api.demoblaze.com/signup'
    And request jsonRequest
    When method post
    Then status 200
    And match response contains jsonResponse1

  Scenario: create a user exist
    * def jsonRequest = read('../json/user_exist.json')
    * def jsonResponse2 = read('../json/message_error_exist.json')
    * print 'created exist is: ', jsonResponse2
    Given url 'https://api.demoblaze.com/signup'
    And request jsonRequest
    When method post
    Then status 200
    And match response contains jsonResponse2

  Scenario: correct login
    * def jsonRequest = read('../json/credentials.json')
    * def jsonResponse3 = read('../json/message_auth_token.json')
    * print 'login response is: ', jsonResponse3
    Given url 'https://api.demoblaze.com/login'
    And request jsonRequest
    When method post
    Then status 200
    And match response contains jsonResponse3

  Scenario: incorrect login by user
    * def jsonRequest = read('../json/user_incorrect_u.json')
    * def jsonResponse4 = read('../json/message_error_user.json')
    * print 'login incorrect user response is: ', jsonResponse4
    Given url 'https://api.demoblaze.com/login'
    And request jsonRequest
    When method post
    Then status 200
    And match response contains jsonResponse4

  Scenario: incorrect login by password
    * def jsonRequest = read('../json/user_incorrect_p.json')
    * def jsonResponse5 = read('../json/message_error_password.json')
    * print 'login incorrect pass response is: ', jsonResponse5
    Given url 'https://api.demoblaze.com/login'
    And request jsonRequest
    When method post
    Then status 200
    And match response contains jsonResponse5


#TENER EN CUENTA ANTES DE EJECUTAR LA AUTOMATIZACIÓN

Tener el driver de la ultima version de google chrome dentro del proyecto.
Tener Karate en la version 5:1.2.0 y tener Gradle
