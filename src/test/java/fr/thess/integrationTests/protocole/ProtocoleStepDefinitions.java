package fr.thess.integrationTests.protocole;

import fr.thess.integrationTests.base.BaseStepDefinitions;
import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.Driver;
import fr.thess.utilities.Pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProtocoleStepDefinitions extends BaseStepDefinitions {

    private static final Logger LOG = LogManager.getLogger(ProtocoleStepDefinitions.class);

    public ProtocoleStepDefinitions(BrowserUtils browserUtils, Driver driver, Pages pages) {
        super(browserUtils, driver, pages);

    }



}
