package fr.thess.integrationTests.base;

import fr.thess.integrationTests.login.LoginPage;
import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.Driver;
import fr.thess.utilities.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneralStepDefinitions extends BaseStepDefinitions {
    private static final Logger LOG = LogManager.getLogger(LoginPage.class);

    public GeneralStepDefinitions(BrowserUtils browserUtils, Driver driver, Pages pages) {
        super(browserUtils, driver, pages);
    }

    @When("Cliquer {string} bouton")
    public void cliquerBouton(String bouton) {
        getPages().loginPage().clickToButton(bouton);

    }

    @Then("Vérifier que message erreur {string} s'affiche")
    public void verifyThatErrorMessageIsDisplayed(String expectedErrorMessage) {
        String actualErrorMessage = getPages().loginPage().getErrorMessage();
        System.out.println("actualErrorMessage = " + actualErrorMessage);

        assertEquals("Verification is failed! Expected message is not displayed!" + actualErrorMessage,
                expectedErrorMessage, actualErrorMessage);
        ;
        LOG.info("The message is displayed: {}", expectedErrorMessage);
    }

    @When("Cliquer module {string}")
    public void cliquerModule(String module) {
        getPages().mesPatientsPage().clickToModule(module);

    }


}


