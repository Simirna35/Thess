# language: fr

Fonctionnalité: Login

  @positiveLogin
  Plan du Scénario: Positive login scénario
    Sachant que PS est dans la page de connexion
    Lorsque Saisir des identifiants valides "<identifiant>" et "<password>"
    Alors Vérifiez que le tableau de board s'affiche

    Exemples:
      | identifiant | password |
      | DrMetin     | test     |
      | preparateur | test     |
      | identifiant | test     |


  @negativeLogin
  Scénario: : Negative login scénario
    Sachant que PS est dans la page de connexion
    Lorsque Saisir des identifiants invalides "<username>" et "<motdePasse>"
    Alors Vérifier que message d'erreur "<erreurMessage>" s'affiche














