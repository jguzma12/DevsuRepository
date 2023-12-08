#Autor: Juan Pablo Guzman Quintero
Feature: API.demoblaze karate test

  Background:
    * url 'https://api.demoblaze.com/signup'

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