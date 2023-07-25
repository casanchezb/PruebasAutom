package co.com.choucair.certification.PRUEBA_1.tasks;

import co.com.choucair.certification.PRUEBA_1.interactions.AlertHandle;
import co.com.choucair.certification.PRUEBA_1.userinterfaces.PaginaDemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Task {
    public static Seleccionar productos() { return Tasks.instrumented(Seleccionar.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaDemo.PRODUCTO_SAMSUNG),
                Click.on(PaginaDemo.AGREGAR_CARRO),
                AlertHandle.alert(),
                Click.on(PaginaDemo.VER_CARRO)
        );
    }
}