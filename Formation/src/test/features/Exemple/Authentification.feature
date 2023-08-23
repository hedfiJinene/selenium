
@tag
Feature: Connexion 
 En tant que administarteur je veux authentifier

  @tag1
  Scenario: Connexion valide
    Given Ouvrir navigateur
    And Ouvrir URL
    When Saisir login
    And Saisir mot de passe
    And Cliquer sur Entrer
    Then Vérifier le nom de profil
    
