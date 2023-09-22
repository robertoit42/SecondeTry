#Roberto Carlos
@Regresion
Feature: LeavePage

  @Tag
  Scenario Outline: Buscar employee
    Given abrir el navegador
    And llenar campo usuario<username> y password<password>
    And llegar a leave page
    And Scroll Down to employee<employee>

    Examples: 
      | username | password | employee       |
      | Admin    | admin123 | Anthony  Nolan |
