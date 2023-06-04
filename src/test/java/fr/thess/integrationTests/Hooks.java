package fr.thess.integrationTests;

import fr.thess.utilities.ConfigurationReader;
import fr.thess.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    private final Driver driver;
    private final ConfigurationReader configurationReader;

    public Hooks(Driver driver, ConfigurationReader configurationReader) {
        this.driver = driver;
        this.configurationReader = configurationReader;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public ConfigurationReader getConfigurationReader() {
        return this.configurationReader;
    }

    @Before
    public void setUp() {
        getDriver().get().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        getDriver().get().manage().window().maximize();
    }

    @BeforeStep
    public void beforeStep() {
        // wait until invisible of spin
    }

    @After
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().closeDriver();

        }
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        //if the scenario fails take screenshot
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Failed Step");
        }
    }
}
