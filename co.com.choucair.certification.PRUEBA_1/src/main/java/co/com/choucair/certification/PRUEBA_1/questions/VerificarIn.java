package co.com.choucair.certification.PRUEBA_1.questions;

import co.com.choucair.certification.PRUEBA_1.userinterfaces.PaginaDemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarIn implements Question {

    public static VerificarIn resultado(){
        return new VerificarIn();
    }
    @Override
    public Object answeredBy(Actor actor){
        return Text.of(PaginaDemo.VERF_CEL).viewedBy(actor).asString();
    }
}
