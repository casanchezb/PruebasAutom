package co.com.choucair.certification.PRUEBA_1.tasks;

import co.com.choucair.certification.PRUEBA_1.interactions.AlertHandle;
import co.com.choucair.certification.PRUEBA_1.userinterfaces.PaginaDemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registrar implements Task {
    public static Registrar credenciales() { return Tasks.instrumented(Registrar.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaDemo.BTREGISTRAR),
                Enter.theValue("usuarioregistrado").into(PaginaDemo.USUARIO),
                Enter.theValue("1234567890*").into(PaginaDemo.CONTRASENNA),
                Click.on(PaginaDemo.BTN_SING_IN),
                AlertHandle.alert());

    }
}
