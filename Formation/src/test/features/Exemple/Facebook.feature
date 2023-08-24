
@tag
Feature: Création Compte face book
  En tant que utulisateur je veux créer un compte face book

  @tag1
  Scenario: Création d'un compte avec l'adresse mail
    Given Ouvrir navigateur2 
    And Saisir URL "https://www.facebook.com/"
    
    When Cliquer sur le bouton créer un nouveau compte
    And Saisir le Prénom "jinene"
    And Saisir le nom "hedfi"
    And Saisir le mail "jinenehedfi9@gmail.com"
    And Confirmer le mail "jinenehedfi9@gmail.com"
    And Saisir le mot de passe "password23"
    And Saisir jour naissance "9"
    And Saisir mois naissance "11"
    And Saissir année naissance "1980"
    And Cliquer sur le bouton "femme"
    
    Then Cliquer sur s'inscrire 
    

  
