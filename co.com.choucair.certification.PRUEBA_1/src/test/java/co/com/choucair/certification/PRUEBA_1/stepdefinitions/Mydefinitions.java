package co.com.choucair.certification.PRUEBA_1.stepdefinitions;

import co.com.choucair.certification.PRUEBA_1.interactions.AlertGetText;
import co.com.choucair.certification.PRUEBA_1.questions.Verificar;
import co.com.choucair.certification.PRUEBA_1.questions.VerificarEl;
import co.com.choucair.certification.PRUEBA_1.questions.VerificarIn;
import co.com.choucair.certification.PRUEBA_1.tasks.Ingresar;
import co.com.choucair.certification.PRUEBA_1.tasks.Registrar;
import co.com.choucair.certification.PRUEBA_1.tasks.Seleccionar;
import co.com.choucair.certification.PRUEBA_1.tasks.SeleccionarCC;
import co.com.choucair.certification.PRUEBA_1.utils.OwnWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Mydefinitions {

    @Before
    public void iniciarEscenario(){
        setTheStage(new Cast());
    }

    @Dado("^que Camilo ingresa a la app demoblaze$")
    public void queCamiloIngresaALaAppDemoblaze()  {
        theActorCalled("Camilo").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("https://www.demoblaze.com/index.html")));
    }

    @Dado("^que Camilo ingresa a la app XTTT$")
    public void queCamiloIngresaALaAppXTTT()  {
        theActorCalled("Canilo").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("https://colorlib.com/polygon/metis/login.html")));
    }

    @Cuando("^Selecciona un producto$")
    public void seleccionaUnProducto() {
        theActorInTheSpotlight().attemptsTo(Seleccionar.productos());
    }

    @Cuando("^Digita sus credenciales e ingresa a la APP$")
    public void digitaSusCredencialesEIngresaALaAPP() {
        theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
    }

    @Entonces("^Verifica que ingreso correctamente los productos$")
    public void verificaQueIngresoCorrectamenteLosProductos() {
                OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarIn.resultado(), Matchers.equalTo("Samsung galaxy s6")));
    }

    @Entonces("^Verifica que pudo ingresar correctamente$")
    public void verificaQuePudoIngresarCorrectamente() {
        System.out.println("Ingreso al entonces");
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.equalTo("Bootstrap-Admin-Template")));
    }

    @Cuando("^Selecciono un producto del carrito$")
    public void seleccionoUnProductoDelCarrito() {
        theActorInTheSpotlight().attemptsTo(SeleccionarCC.productos());
    }

    @Entonces("^Verifica que elimino correctamente el producto$")
    public void verificaQueEliminoCorrectamenteElProducto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarEl.resultado(), Matchers.not("Samsung galaxy s6")));

    }

    @Cuando("^Digita sus datos de registro$")
    public void digitaSusDatosDeRegistro() {
        theActorInTheSpotlight().attemptsTo(Registrar.credenciales());
    }

    @Entonces("^Verifica que no pudo registrar correctamente$")
    public void VerificaQueNoPudoRegistrarCorrectamente() {

        System.out.println(AlertGetText.alert());

    }

}
