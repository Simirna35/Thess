package fr.thess.pages;

import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.ConfigurationReader;
import fr.thess.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    private static final Logger LOG = LogManager.getLogger(LoginPage.class);

    @FindBy(id = "login")
    public WebElement chmp_Login;

    @FindBy(className = "transparent")
    public WebElement chmp_MotdePasse;

    @FindBy(xpath = "//*[@class='button width-100-pc']")
    public WebElement btn_seConnecter;

    public LoginPage(BrowserUtils browserUtils, Driver driver, ConfigurationReader configurationReader) {
        super(browserUtils, driver, configurationReader);
    }

    public void navigateToLogin() {
        String url = getConfigurationReader().getProperty("url");
        getDriver().get().get(url);
        LOG.info("Url utilisé afin de connecter application:{}", url);

    }

    public void loginToAppWithValid() {

        String identifiant = getConfigurationReader().getProperty("identifiant");
        String password = getConfigurationReader().getProperty("password");
        LOG.info("Logged into application with credentials: {} | {}",identifiant,password);




    }
    public void login (String identifiant, String password){
        chmp_Login.click();
        chmp_Login.sendKeys(identifiant);

        chmp_MotdePasse.click();
        chmp_MotdePasse.sendKeys(password);

    }
}


