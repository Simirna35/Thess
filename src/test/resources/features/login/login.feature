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
      | identifiant     | motdePasse | dashboardUrl             |
      | DrMetin         | test       | doctor-dashboard         |
      | pharmacie       | test       | doctor-dashboard         |
      | preparateur     | test       | doctor-dashboard         |
      | ArthurMONTEGARD | test       | patient/129802/dashboard |

  @negativeLogin
  Scenario Outline: Negative login scénario
    When Saisir des identifiants invalides "<invalideIdentifiant>" et "<invalidePassword>"
    And  Cliquer "Se connecter" bouton
    Then Vérifier que message erreur "<erreurMessage>" s'affiche

    Examples:
      | invalideIdentifiant  | invalidePassword          | erreurMessage                              |
      | DrMetin              | 123456                    | Nom d'utilisateur ou mot de passe invalide |
      | abc@def.com          | test                      | Nom d'utilisateur ou mot de passe invalide |
      | def@cfg.fr           | 878654                    | Nom d'utilisateur ou mot de passe invalide |
      |                      |                           | Nom d'utilisateur ou mot de passe invalide |
      | DrMetin              |                           | Nom d'utilisateur ou mot de passe invalide |
      | DrIsabelle           |                           | Nom d'utilisateur ou mot de passe invalide |
      |                      | test                      | Nom d'utilisateur ou mot de passe invalide |
      |                      | mot de passe !            | Nom d'utilisateur ou mot de passe invalide |
      | DrMetin              | Comu0852!                 | Nom d'utilisateur ou mot de passe invalide |
      | DrMetin              | test0852!NegativeTest123é | Nom d'utilisateur ou mot de passe invalide |
      | m.oruc@thess-corp.fr | test                      | Nom d'utilisateur ou mot de passe invalide |
      | test                 | test                      | Nom d'utilisateur ou mot de passe invalide |










