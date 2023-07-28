package co.com.choucair.certification.PRUEBA_1.questions;

import co.com.choucair.certification.PRUEBA_1.interactions.AlertGetText;
import co.com.choucair.certification.PRUEBA_1.userinterfaces.PaginaDemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarEl implements Question {

    public static VerificarEl resultado(){
        return new VerificarEl();
    }
    @Override
    public Object answeredBy(Actor actor){
        return Text.of(PaginaDemo.VER_CARROEL).viewedBy(actor).asString();

    }
}
