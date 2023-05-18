package fr.thess.stepDefinitions;

import fr.thess.pages.BasePage;
import fr.thess.utilities.BrowserUtils;
import fr.thess.utilities.Driver;
import fr.thess.utilities.Pages;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Lorsque;
import io.cucumber.java.fr.Sachantque;

public class LoginStepDefinitions extends BaseStepDefinitions{
    public LoginStepDefinitions(BrowserUtils browserUtils, Driver driver, Pages pages) {
        super(browserUtils, driver, pages);
    }

    @Sachantque("PS est dans la page de connexion")
    public void ps_est_dans_la_page_de_connexion() {
       getPages().loginPage().navigateToLogin();

    }

    @Lorsque("Saisir des identifiants valides {string} et {string}")
    public void saisir_des_identifiants_valides_et(String identifiant, String password) {
        getPages().loginPage().loginToAppWithValid();

    }

    @Alors("Vérifiez que le tableau de board s'affiche")
    public void vérifiez_que_le_tableau_de_board_s_affiche() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    }

