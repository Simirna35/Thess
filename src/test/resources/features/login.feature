@login    @positiveLogin
Feature:Login
  En tant qu'utilisateur, je devrais pouvoir me connecter à la page d'application.

  Background: Utilisateur doit accéder à la page de connexion
    Given Accéder à la page de connexion


  Scenario Outline: Positive login scénario
  Utilisateur devrait pouvoir se connecter à l'application Acceptance criteria
    When Saisir des identifiants valides "<identifiant>" et "<motdePasse>"
    And Cliquer "Se connecter" bouton
    Then Vérifier que le system est redirigé vers la page tableau de bord "<dashboardUrl>"

    Examples:
      | identifiant     | motdePasse | dashboardUrl      |
      | DrMetin         | test       | doctor-dashboard  |
      | pharmacie       | test       | doctor-dashboard  |
      | preparateur     | test       | doctor-dashboard  |
      | ArthurMONTEGARD | test       | patient/129802/dashboard |


#  @negativeLogin
#  Scenario Outline: Negative login scénario
#    When Saisir des identifiants invalides "<username>" et "<motdePasse>"
#    Then Vérifier que message d'erreur "<erreurMessage>" s'affiche
#
#    Examples:
#      | userame | password |
#      | DrMetin     | test     |
#      | préparateur | test     |
#      | Pharmacien  | test     |










