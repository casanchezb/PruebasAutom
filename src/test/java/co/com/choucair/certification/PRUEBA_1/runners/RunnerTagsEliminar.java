package co.com.choucair.certification.PRUEBA_1.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/eliminarproducto.feature",
        //tags = "@Test1",
        glue = "co.com.choucair.certification.PRUEBA_1.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTagsEliminar {
}