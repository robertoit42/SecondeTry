@Regresion
Feature: Login to Secondtry

  @Login
  Scenario Outline: SecondTryLogin
    Given abrir el navegador
    And llenar campo usuario<username> y password<password>
    And llegar a la opcion agregar empleado
    And al diligenciar first name<firstName> y lastname <lastName>
    And regresa a cerrar explorador

    Examples: 
      | username | password | firstName | lastName |
      | Admin    | admin123 | Rosa      | ortiz    |
