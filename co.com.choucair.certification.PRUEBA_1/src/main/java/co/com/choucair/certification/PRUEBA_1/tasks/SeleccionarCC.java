package co.com.choucair.certification.PRUEBA_1.tasks;

import co.com.choucair.certification.PRUEBA_1.interactions.AlertHandle;
import co.com.choucair.certification.PRUEBA_1.userinterfaces.PaginaDemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarCC implements Task {
    public static SeleccionarCC productos() { return Tasks.instrumented(SeleccionarCC.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaDemo.PRODUCTO_SAMSUNG),
                Click.on(PaginaDemo.AGREGAR_CARRO),
                AlertHandle.alert(),
                Click.on(PaginaDemo.VER_CARRO),
                Click.on(PaginaDemo.ELIMINAR_CARRO)
        );
    }
}
