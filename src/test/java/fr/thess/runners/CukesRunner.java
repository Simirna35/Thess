package fr.thess.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "fr.thess.utilities.formatters.PrettyReports:target/cucumber-pretty-reports"

        },
        features = "src/test/resources/features/",
        glue = "fr/thess/integrationTests",
        dryRun = false,
        tags = "@ajoutUnProtocole"
)
public class CukesRunner {
}

