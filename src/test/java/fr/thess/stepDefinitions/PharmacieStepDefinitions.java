package fr.thess.stepDefinitions;

import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.Driver;
import fr.thess.utilities.Pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PharmacieStepDefinitions extends BaseStepDefinitions{

    private static final Logger LOG = LogManager.getLogger(LoginStepDefinitions.class);
    public PharmacieStepDefinitions(BrowserUtils browserUtils, Driver driver, Pages pages) {
        super(browserUtils, driver, pages);
    }
}
