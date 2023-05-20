package fr.thess.stepDefinitions;

import com.sun.jna.WString;
import fr.thess.pages.BasePage;
import fr.thess.pages.LoginPage;
import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.Driver;
import fr.thess.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

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
    public void VerifyUrl(String url) {
        boolean isUrlContains = getPages().loginPage().verifyDashboardUrl(url);

        assertTrue("Verification is failed! Current Url doesn't contain expected extension", isUrlContains);
        LOG.info("System is directed to the dashboard.");
    }


}