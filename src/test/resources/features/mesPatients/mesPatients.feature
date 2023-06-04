@mesPatients    @ajoutPatient
Feature: Ajouter un patient
  En tant que médecin,je devrais pouvoir ajouter un patient.

  Background: Utilisateur doit accéder à la page de connexion
    Given Accéder à la page de connexion
    When Saisir des identifiants valides "DrMetin" et "test"
    And Cliquer "Se connecter" bouton
    Then Vérifier que le system est redirigé vers la page tableau de bord "doctor-dashboard"

  Scenario: Ajouter un patient
    When Cliquer module "Mes patients"
    Then Vérifier que la page est redirigé vers la page "Mes patients"
    And Cliquer le bouton "ajouter un patient"
    Then Vérifier que la page est redirigé vers la page nouveau patient "Nouveau patient"
    And Saisir les champs avec des informations suivantes
      | Prénom(s)                       | Sarah                   |
      | Premier prénom                  | Sarah                   |
      | Nom de naissance                | CORNER                  |
      | Prénom d'usage                  | Carpediem               |
      | Nom d'usage                     | Philis                  |
      | Date de naissance               | 18/05/1984              |
      | Adresse e-mail                  | philismathieu@gmail.com |
      | Téléphone                       | 0600000064              |
      | Rue                             | 95 rue Nicolas Copernic |
      | Ville                           | Montpellier             |
      | Code postal                     | 34070                   |
      | Pays                            | France                  |
      | location lat and lng            | ing                     |
      | IPP                             | 075                     |
      | Matricule INS                   | 119663473448            |
      | OID (Object IDentifier)         | 456                     |
      | Code INSEE du lieu de naissance | 33400                   |
      | Identifiant de connexion        | SarahCorner             |
      | Mot de passe                    | Sarah0852!@             |
      | Confirmation du mot de passe    | Sarah0852!@             |
    And cliquer les déroulantes et sélectionner les options suivantes
      | établissement médical | Lavaleriane      |
      | Langue                | Français         |
      | Groupe de Permission  | Patient autonome |
    And sélectionner une "équipe de soin"
    And sélectionner le "genre"
    And cliquer le bouton "sauvegarder"
#    Then vérifier que le message de confirmation s'affiche







