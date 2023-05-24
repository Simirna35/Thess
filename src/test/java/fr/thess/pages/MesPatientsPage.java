package fr.thess.pages;

import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.ConfigurationReader;
import fr.thess.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MesPatientsPage extends BasePage {

    private static final Logger LOG = LogManager.getLogger(LoginPage.class);

    public MesPatientsPage(BrowserUtils browserUtils, Driver driver, ConfigurationReader configurationReader) {
        super(browserUtils, driver, configurationReader);
    }
}
