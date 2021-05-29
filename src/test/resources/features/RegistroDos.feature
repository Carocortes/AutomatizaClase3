##Diana Carolina Cortés
## Mayo 22/21
##@tag
@RegresionDos
Feature: Envío de correo Text box

  Scenario Outline: registro de usuario
    Given abrir el navegador
    And Seleccionar campo nombre <nombreP> y correo <correoP>
    Then Se valida que los campos cumplen <nombreP>
    
   Examples: 
   | nombreP  | correoP              |
   | Diana    | diana.cortes@gmil.com|
   | David    | david.cortes@gmil.com|    



    
@Curso
Scenario: carga de archivos
		Given abrir el navegador
		And llegar a cargar

##  Examples: cuando dices q es Outline es cuando el sistea espera variables 
##    | name  | value | status  |
##    | name1 |     5 | success |
##    | name2 |     7 | Fail    |
