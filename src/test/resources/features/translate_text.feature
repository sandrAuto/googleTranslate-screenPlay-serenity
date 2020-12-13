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
      | hola mundo       | Español       | Inglés         | hello World     |
      | hola mundo       | Español       | Portugués      | olá mundo       |     
      
  Scenario: traducir un texto de un idioma origen a un idioma destino
    Given quiero traducir un texto
    When traduzco el texto "hola mundo" del idioma origen "Español" al idioma destino "Inglés"
    Then el texto traducido es "hello World"
      