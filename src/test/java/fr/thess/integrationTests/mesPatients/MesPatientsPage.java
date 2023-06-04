package fr.thess.integrationTests.mesPatients;

import fr.thess.integrationTests.base.BasePage;
import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.ConfigurationReader;
import fr.thess.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MesPatientsPage extends BasePage {

    private static final Logger LOG = LogManager.getLogger(MesPatientsPage.class);

    @FindBy(xpath = "//button[@class='button floatr margin-left-s event-attached-href']")
    public WebElement elementAjouterPatient;
    @FindBy(xpath = "//*[@data-value='FR']")
    public WebElement elementHoraireFr;
    @FindBy(xpath = "//input[@id='care_team_id_list_13']")
    public WebElement elementTeam;

    public MesPatientsPage(BrowserUtils browserUtils, Driver driver, ConfigurationReader configurationReader) {
        super(browserUtils, driver, configurationReader);
    }

    public boolean verifyPageMesPatients(String url) {

        String currentUrl = getDriver().get().getCurrentUrl();

        return currentUrl.contains(url);
    }

    public void addPatient() {
        elementAjouterPatient.click();
        getBrowserUtils().waitFor(2);
    }

    public void sendKeysToElementByFieldName(String field, String value) {
        String path;
        if (field.equals("IPP") || field.equals("Matricule INS") || field.equals("Code INSEE du lieu de naissance") || field.equals("OID (Object IDentifier)")) {
            path = "//*[normalize-space(text())=\"" + field + "\"]/../../following-sibling::div/input[1]";
        } else if (field.equals("Mot de passe") || field.equals("Confirmation du mot de passe") || field.equals("Date de naissance") || field.equals("Téléphone")) {
            path = "//*[normalize-space(text())=\"" + field + "\"]/following-sibling::div//input[1]";
        } else {
            path = "//*[normalize-space(text())=\"" + field + "\"]/following-sibling::input[1]";
        }
        getBrowserUtils().scrollToElement(getDriver().get().findElement(By.xpath(path)));
        getBrowserUtils().waitForVisibility(By.xpath(path), 10);
        WebElement fieldElement = getDriver().get().findElement(By.xpath(path));
        fieldElement.sendKeys(value);
    }

    public void selectDropDown(String dropBox, String option) {
        String path;
        if (dropBox.equals("Langue")) {
            path = "//*[normalize-space(text())=\"" + dropBox + "\"]/following-sibling::div/select";
        } else {
            path = "//*[normalize-space(text())=\"" + dropBox + "\"]/../select";
        }
        getBrowserUtils().scrollToElement(getDriver().get().findElement(By.xpath(path)));
        Select selectDropForm = new Select(getDriver().get().findElement(By.xpath(path)));
//            WebElement dropBoxElement = getDriver().get().findElement(By.xpath(path));
        selectDropForm.selectByVisibleText(option);
        getBrowserUtils().waitForVisibility(By.xpath(path), 5);
        getBrowserUtils().waitFor(5);
    }

    public void clickToCheckBox(String team) {
        getBrowserUtils().scrollToElement(getDriver().get().findElement(By.xpath(" //*[text()='QA Testeur']")));
        WebElement elementTeam = getDriver().get().findElement(By.xpath(" //*[text()='QA Testeur']"));
        elementTeam.click();
        System.out.println("selected = " + elementTeam.isSelected());
        System.out.println("enabled = " + elementTeam.isEnabled());
        System.out.println("displayed = " + elementTeam.isDisplayed());
        getBrowserUtils().waitFor(10);

        LOG.info("Clicked to healthcare team: {}", team);
    }

    public void selectGenre(String genre) {
        getBrowserUtils().scrollToElement(getDriver().get().findElement(By.xpath("//*[text()='Femme']")));
        WebElement elementGenre = getDriver().get().findElement(By.xpath("//*[text()='Femme']"));
        elementGenre.click();
        System.out.println("selected = " + elementGenre.isSelected());
        System.out.println("enabled = " + elementGenre.isEnabled());
        System.out.println("displayed = " + elementGenre.isDisplayed());

        getBrowserUtils().waitFor(2);
        LOG.info("Clicked to genre : {}", genre);
    }

    public void clicktoRegister(String buttonRegister) {
        getBrowserUtils().scrollToElement(getDriver().get().findElement(By.xpath("//*[@class='button']")));
        WebElement elementRegister = getDriver().get().findElement(By.xpath("//*[@class='button']"));
        elementRegister.click();
        System.out.println("selected = " + elementRegister.isSelected());
        System.out.println("enabled = " + elementRegister.isEnabled());
        System.out.println("displayed = " + elementRegister.isDisplayed());
        getBrowserUtils().waitFor(30);

        LOG.info("Clicked to button: {}", buttonRegister);
    }

    public void clickToPatient(String buttonPatientName) {
        WebElement elementPatient = getDriver().get().findElement(By.xpath("//*[normalize-space(text())='Metin ORUC']"));
        elementPatient.click();
        getBrowserUtils().waitFor(5);

        LOG.info("Clicked to button: {}", buttonPatientName);
    }

    public void clickToAddProtocole(String addProtocole) {
        WebElement elementAddProtocole = getDriver().get().findElement(By.xpath("//*[@class='button -little capitalized close-sidebar event-attached-href']"));
        elementAddProtocole.click();
        getBrowserUtils().waitFor(2);
        LOG.info("Clicked to button: {}", addProtocole);

    }

    public void protocolIsSelected(String selectProtocol) {
        WebElement elementProtocole = getDriver().get().findElement(By.xpath("//*[@class='event-attached-change']"));

        Select selectProtocole = new Select(elementProtocole);
        selectProtocole.selectByValue("17");

        LOG.info("The protocole lénalidomide is selected : {}", selectProtocol);
    }

    public void clickToProtocole(String protocole) {
        WebElement elementProDisplayed = getDriver().get().findElement(By.xpath("//*[@class='card protocol-model-item protocol-model-item-label pointer hover panel']"));
        elementProDisplayed.click();
        LOG.info("The protocole Revlimid is selected : {}", protocole);

    }

    public void enterDate(String startDate) {
        WebElement elementDate = getDriver().get().findElement(By.xpath("//*[@placeholder='jj/mm/aaaa']"));
        elementDate.sendKeys("05/06/2023");
        elementDate.isDisplayed();

        LOG.info("The start date is entered : {}", startDate);
    }

    public void getNotificationMessage(String notification) {

        WebElement actualElement = getDriver().get().findElement(By.xpath("//*[@class='notification-content']"));

        actualElement.isDisplayed();

        getBrowserUtils().waitFor(5);

        LOG.info("The notification message is displayed: {}", notification);

    }

    public void clickToValidate(String validation) {
        WebElement elementButtonValider = getDriver().get().findElement(By.xpath("//*[@class='button event-attached-click']"));
        elementButtonValider.click();

    }

    public void saisirJustification(String justification) {
        WebElement elementJustification = getDriver().get().findElement(By.xpath("//*[@placeholder='Justification de modification du protocole...']"));
        elementJustification.sendKeys("Ok");
        WebElement elementButtonValider = getDriver().get().findElement(By.xpath("//*[@class='button']"));
       elementButtonValider.click();


    }

}






