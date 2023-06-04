package fr.thess.integrationTests.base;

import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.ConfigurationReader;
import fr.thess.utilities.Driver;
import fr.thess.utilities.Pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private static final Logger LOG = LogManager.getLogger(BasePage.class);
    private final BrowserUtils browserUtils;
    private final Driver driver;
    private final ConfigurationReader configurationReader;

    public BasePage(BrowserUtils browserUtils, Driver driver, ConfigurationReader configurationReader) {
        this.browserUtils = browserUtils;
        this.driver = driver;
        this.configurationReader = configurationReader;
        PageFactory.initElements(getDriver().get(), this);

    }

    public BrowserUtils getBrowserUtils() {
        return this.browserUtils;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public ConfigurationReader getConfigurationReader() {
        return this.configurationReader;
    }

    public Pages getPages() {
        return new Pages(getBrowserUtils(), getDriver(), getConfigurationReader());
    }

    public void clickToButton(String button) {
        String path = "//*[normalize-space(text())=\"" + button + "\"]";
        getBrowserUtils().waitFor(2);
        WebElement buttonElement = getDriver().get().findElement(By.xpath(path));

        buttonElement.click();
        getBrowserUtils().waitFor(2);


        LOG.info("Clicked to button: {}", button);


    }

    public boolean isMessageDisplayed(String message) {
        String path = "//*[normalize-space(text())=\"" + message + "\"]";

        return getDriver().get().findElement(By.xpath(path)).isDisplayed();
    }

     public String getErrorMessage() {
        String path = "loginError";

        WebElement messageElement = getDriver().get().findElement(By.id(path));

        LOG.info("Located element to  get message: {}", path);
        return messageElement.getText();
    }

    public void clickToModule(String module) {
        String path = "//*[normalize-space(text())=\"" + module + "\"]";
        getBrowserUtils().waitFor(2);
        WebElement moduleElement = getDriver().get().findElement(By.xpath(path));

        moduleElement.click();
        getBrowserUtils().waitFor(10);


        LOG.info("Clicked to module: {}", module);


        }
    public void vérifierTitlePatients(){
        String url = getConfigurationReader().getProperty("url");
        String currentUrl = getDriver().get().getCurrentUrl();

        Assert.assertEquals(url, currentUrl);

    }
    public void titlePatientForm() {
        String url = getConfigurationReader().getProperty("urlPatientForm");
        String currentUrl = getDriver().get().getCurrentUrl();

        Assert.assertEquals(url, currentUrl);
    }


    public String getPagePath(String pageName) {
        String path = "//h1[text()=\""+ pageName +"\"]";

        return getDriver().get().findElement(By.xpath(path)).getText();


    }
}





