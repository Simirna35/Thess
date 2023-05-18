package fr.thess.utilities;


import fr.thess.pages.LoginPage;

public class Pages{
    private final LoginPage loginPage;




    public Pages(BrowserUtils BrowserUtils, Driver driver, ConfigurationReader configurationReader) {
        this.loginPage = new LoginPage(BrowserUtils, driver, configurationReader);
    }

    public LoginPage loginPage(){
        return this.loginPage;    }
}

