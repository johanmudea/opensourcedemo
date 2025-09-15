package org.johan.stepdefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {

    @Managed(driver = "chrome")
    protected WebDriver webDriver;

    protected void setupUser(String name, WebDriver webDriver ) {
        // Autodescargar el ChromeDriver adecuado
        WebDriverManager.chromedriver().setup();

        // Inicializar ChromeDriver
        //webDriver = new ChromeDriver();

        // Configurar el stage (ambiente) donde el actor va a realizar las acciones
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(webDriver));
    }

    protected void userSetupBrowser(String name){
        setupUser(name, webDriver); // Solo es necesario pasar el nombre del actor, el WebDriver se maneja internamente
    }

    // Método opcional para cerrar el navegador al finalizar los tests
    protected void tearDown() {
        if (webDriver != null) {
            webDriver.quit();  // Cerrar el navegador para liberar recursos
        }
    }



}
