package fr.thess.integrationTests.login;

import fr.thess.integrationTests.base.BaseStepDefinitions;
import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.Driver;
import fr.thess.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertTrue;


public class LoginStepDefinitions extends BaseStepDefinitions {

    private static final Logger LOG = LogManager.getLogger(LoginStepDefinitions.class);

    public LoginStepDefinitions(BrowserUtils browserUtils, Driver driver, Pages pages) {
        super(browserUtils, driver, pages);
    }

    @Given("Accéder à la page de connexion")
    public void navigateToDashboard() {
        getPages().loginPage().navigateToLogin();
    }
    @When("Saisir des identifiants valides {string} et {string}")
    public void enterValidCredentials(String username, String password) {
        getPages().loginPage().loginToAppWithValid(username, password);

    }
    @Then("Vérifier que le system est redirigé vers la page tableau de bord {string}")
    public void VerifyUrlDashboard(String endpoint) {
        boolean isUrlContains = getPages().loginPage().verifyDashboardUrl(endpoint);

        assertTrue("Verification is failed! Current Url doesn't contain expected extension", isUrlContains);
        LOG.info("System is directed to the dashboard.");
    }
    @When("Saisir des identifiants invalides {string} et {string}")
    public void LoginWithInValidCredentials(String invalidUsername, String invalidPassword) {
        getPages().loginPage().loginToWithInvalid(invalidUsername, invalidPassword);

    }


  }
