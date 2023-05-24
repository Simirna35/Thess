@mesPatients    @ajoutPatient
Feature:Login
  En tant que médecin,je devrais pouvoir ajouter un patient.

  Background: Utilisateur doit accéder à la page mes patients
    Given Accéder à la page de mes patients

    When cliquer module mes patients
    And cliquer le bouton ajouter un patient
    And saisir les "<champs>" de nouveau patient

