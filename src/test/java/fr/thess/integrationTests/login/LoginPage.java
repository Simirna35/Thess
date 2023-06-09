package fr.thess.integrationTests.login;

import fr.thess.integrationTests.base.BasePage;
import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.ConfigurationReader;
import fr.thess.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage {
    private static final Logger LOG = LogManager.getLogger(LoginPage.class);

    @FindBy(id = "login")
    public WebElement usernameElement;
    @FindBy(className = "transparent")
    public WebElement passwordElement;
    @FindBy(id = "loginError")
    public WebElement errorElement;

    public LoginPage(BrowserUtils browserUtils, Driver driver, ConfigurationReader configurationReader) {
        super(browserUtils, driver, configurationReader);
    }
    public void navigateToLogin() {
        String url = getConfigurationReader().getProperty("url");
        getDriver().get().get(url);
        getBrowserUtils().waitFor(1);
        LOG.info("Url utilisé afin de connecter application:{}", url);
    }
    public void loginToAppWithValid(String username, String password) {
        login(username, password);
        getBrowserUtils().waitFor(1);
        LOG.info("Logged into application with credentials: {} | {}", username, password);
    }
    public void loginToWithInvalid(String username, String password) {
        login(username, password);
        getBrowserUtils().waitFor(1);
        LOG.info("Logged into application with credentials: {} | {}", username, password);
    }
    public void login(String username, String password) {
        //click and send keys to username textbox// click and send keys to username
        usernameElement.click();
        usernameElement.sendKeys(username);

        //click and send keys to password textboxchmp_MotdePasse.click();
        passwordElement.click();
        passwordElement.sendKeys(password);
    }

    public boolean verifyDashboardUrl(String endpoint) {
        String currentUrl = getDriver().get().getCurrentUrl();

        return currentUrl.contains(endpoint);
    }
}

    










