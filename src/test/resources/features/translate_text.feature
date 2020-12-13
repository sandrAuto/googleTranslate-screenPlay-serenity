#se crea el escenario de traducir texto
Feature: Traducir texto
  
  Como usuario
  Quiero utilizar el traductor de google 
  Para traducir textos entre diferentes idiomas

  Scenario Outline: traducir un texto de un idioma origen a un idioma destino
    Given quiero traducir un texto
    When traduzco el texto <texto a traducir> del idioma origen <idioma origen> al idioma destino <idioma destino>
    Then el texto traducido es <texto traducido>

    Examples: 
      | texto a traducir | idioma origen | idioma destino | texto traducido |
      | hola mundo       | Espa�ol       | Ingl�s         | hello World     |
      | hola mundo       | Espa�ol       | Portugu�s      | ol� mundo       |     
      
  Scenario: traducir un texto de un idioma origen a un idioma destino
    Given quiero traducir un texto
    When traduzco el texto "hola mundo" del idioma origen "Espa�ol" al idioma destino "Ingl�s"
    Then el texto traducido es "hello World"
      