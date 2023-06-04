@ajoutUnProtocole
Feature: Ajouter un protocole
  En tant que médecin,je devrais pouvoir ajouter un patient.

  Background: Utilisateur doit accéder à la page de connexion
    Given Accéder à la page de connexion
    When  Saisir des identifiants valides "DrMetin" et "test"
    And   Cliquer "Se connecter" bouton
    Then  Vérifier que le system est redirigé vers la page tableau de bord "doctor-dashboard"

  Scenario: Ajouter un protocole
    When Cliquer module "Mes patients"
    Then Vérifier que la page est redirigé vers la page "Mes patients"
    And  Cliquer un "patient" dans la page de mes patients
    Then Vérifier que la page est redirigé vers la page de patient "Informations patient"
    And  Cliquer "Ajouter un protocole" button
    Then Vérifier que la page est redirigé vers la page "Sélection d'un modèle de protocole"
    And  Sélectionner un modéle de traitement depuis la liste "DCI"
    And  Cliquer sur le "protocole"
#    Then Vérifier que pop-up "Création d'un protocole patient" s'affiche
    And  Saisir une "date" de démarrage du protocole
    When Cliquer "Sauvegarder" bouton
    Then Vérifier que message "Le protocole patient a bien été créé à partir du modèle de protocole sélectionné" s'affiche
    And  Cliquer "Valider les modifications"
    And Saisir le champs avec un "justification" et cliquer le button "Valider"
    Then Vérifier que message "Les modifications ont bien été enregistrées" s'affiche




