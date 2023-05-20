package fr.thess.stepDefinitions;

import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.Driver;
import fr.thess.utilities.Pages;
import io.cucumber.java.en.When;

public class GeneralStepDefinitions extends BaseStepDefinitions {

    public GeneralStepDefinitions(BrowserUtils browserUtils, Driver driver, Pages pages) {
        super(browserUtils, driver, pages);
    }
    @When("Cliquer {string} bouton")
    public void cliquerBouton(String bouton) {
    getPages().loginPage().clickToButton(bouton);





    }
}

