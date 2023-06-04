package fr.thess.integrationTests.pharmacie;

import fr.thess.integrationTests.base.BasePage;
import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.ConfigurationReader;
import fr.thess.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PharmaciePage extends BasePage {
    private static final Logger LOG = LogManager.getLogger(PharmaciePage.class);
    public PharmaciePage(BrowserUtils browserUtils, Driver driver, ConfigurationReader configurationReader) {
        super(browserUtils, driver, configurationReader);
    }
}
