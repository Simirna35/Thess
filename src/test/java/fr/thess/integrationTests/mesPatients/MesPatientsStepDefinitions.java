package fr.thess.integrationTests.mesPatients;

import fr.thess.integrationTests.base.BaseStepDefinitions;
import fr.thess.integrationTests.login.LoginStepDefinitions;
import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.Driver;
import fr.thess.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Map;

import static org.junit.Assert.*;

public class MesPatientsStepDefinitions extends BaseStepDefinitions {
    private static final Logger LOG = LogManager.getLogger(LoginStepDefinitions.class);

    public MesPatientsStepDefinitions(BrowserUtils browserUtils, Driver driver, Pages pages) {
        super(browserUtils, driver, pages);
    }

    @And("Cliquer le bouton {string}")
    public void clickToAddPatient(String addPatient) {
        getPages().mesPatientsPage().addPatient();
    }

    @Then("Vérifier que la page est redirigé vers la page nouveau patient {string}")
    public void verifyNouveauPatientPage(String expectedPatientPageName) {
        String actualPatientPageName = getPages().mesPatientsPage().getPagePath(expectedPatientPageName);

        assertEquals("Verification is failed! Couldn't navigate to the expected page.", expectedPatientPageName, actualPatientPageName);

        LOG.info("Navigated to the page : {}", actualPatientPageName);
    }

    @And("Saisir les champs avec des informations suivantes")
    public void enterFollowingInformations(Map<String, String> dataMap) {
        for (String field : dataMap.keySet()) {
            String value = dataMap.get(field);
            getPages().mesPatientsPage().sendKeysToElementByFieldName(field, value);

            LOG.info("The field is filled by the data : {} | {}", field, value);
        }
    }

    @And("cliquer les déroulantes et sélectionner les options suivantes")
    public void clickAndSelectDropdown(Map<String, String> dataMap) {
        for (String dropBox : dataMap.keySet()) {
            String option = dataMap.get(dropBox);
            getPages().mesPatientsPage().selectDropDown(dropBox, option);
            LOG.info("The dropdowns et options are selected and clicked: {} | {}", dropBox, option);
        }
    }

    @And("sélectionner une {string}")
    public void clickToCheckbox(String team) {
        getPages().mesPatientsPage().clickToCheckBox(team);
    }

    @And("sélectionner le {string}")
    public void selectGenre(String genre) {
        getPages().mesPatientsPage().selectGenre(genre);
    }

    @And("cliquer le bouton {string}")
    public void clickButton(String buttonRegister) {
        getPages().mesPatientsPage().clicktoRegister(buttonRegister);
    }

    @And("Cliquer un {string} dans la page de mes patients")
    public void clickToPatient(String patientName) {
        getPages().mesPatientsPage().clickToPatient(patientName);
    }

    @And("Cliquer {string} button")
    public void clickButtonAddProtocole(String addProtocole) {
        getPages().mesPatientsPage().clickToAddProtocole(addProtocole);

    }

    @And("Sélectionner un modéle de traitement depuis la liste {string}")
    public void selectProtocol(String selectProtocole) {
        getPages().mesPatientsPage().protocolIsSelected(selectProtocole);
    }

    @And("Cliquer sur le {string}")
    public void clickToProtocole(String protocole) {
        getPages().mesPatientsPage().clickToProtocole(protocole);

    }

    @And("Saisir une {string} de démarrage du protocole")
    public void enterStartDate(String startDate) {
        getPages().mesPatientsPage().enterDate(startDate);

    }

    @Then("Vérifier que la page est redirigé vers la page {string}")
    public void verifyNavigateToPage(String expectedPageName) {
        String actualPageName = getPages().mesPatientsPage().getPagePath(expectedPageName);

        assertEquals("Verification is failed! Couldn't navigate to the expected page.", expectedPageName, actualPageName);

        LOG.info("Navigated to the page : {}", actualPageName);


    }

    @Then("Vérifier que la page est redirigé vers la page de patient {string}")
    public void verifyPatientPage(String expectedPatientPage) {
        String actualPatientPageName = getPages().mesPatientsPage().getPagePath(expectedPatientPage);

        assertEquals("Verification is failed! Couldn't navigate to the expected page.", expectedPatientPage, actualPatientPageName);

        LOG.info("Navigated to the page : {}", actualPatientPageName);
    }

    @Then("Vérifier que pop-up {string} s'affiche")
    public void verifyPopUp(String expectedPopUp) {

        String actualPopUp = getPages().mesPatientsPage().getPagePath(expectedPopUp);

        assertEquals("Verification is failed! Couldn't navigate to the expected page.", expectedPopUp, actualPopUp);

        LOG.info("Navigated to the page : {}", actualPopUp);
    }

    @Then("Vérifier que message {string} s'affiche")
    public void vérifierQueMessageSAffiche(String notification) {
        getPages().mesPatientsPage().getNotificationMessage(notification);


    }

    @And("Cliquer {string}")
    public void cliquer(String validation) {
        getPages().mesPatientsPage().clickToValidate(validation);
    }

    @And("Saisir le champs avec un {string} et cliquer le button {string} ")
    public void saisirLeChampsAvecUn(String justification, String buttonValider) {
        getPages().mesPatientsPage().saisirJustification(justification);
    }

    @And("Saisir le champs avec un {string} et cliquer le button {string}")
    public void saisirLeChampsAvecUnEtCliquerLeButton(String justification, String buttonValider) {
        getPages().mesPatientsPage().saisirJustification(justification);
        jhkhk

    }
}










