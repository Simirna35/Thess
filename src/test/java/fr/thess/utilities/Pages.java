package fr.thess.utilities;


import fr.thess.integrationTests.login.LoginPage;
import fr.thess.integrationTests.mesPatients.MesPatientsPage;
import fr.thess.integrationTests.protocole.ProtocolePage;

public class Pages {
    private final LoginPage loginPage;
    private final MesPatientsPage mesPatientsPage;
    private final ProtocolePage protocolePage;


    public Pages(BrowserUtils BrowserUtils, Driver driver, ConfigurationReader configurationReader) {
        this.loginPage = new LoginPage(BrowserUtils, driver, configurationReader);
        this.mesPatientsPage = new MesPatientsPage(BrowserUtils, driver, configurationReader);
        this.protocolePage = new ProtocolePage(BrowserUtils, driver, configurationReader);
    }

    public LoginPage loginPage() {
        return this.loginPage;
    }

    public MesPatientsPage mesPatientsPage() {
        return this.mesPatientsPage;
    }

    public ProtocolePage protocolePage() {
        return this.protocolePage;
    }
}



