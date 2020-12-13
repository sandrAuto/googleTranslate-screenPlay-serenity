package com.aut.project.bdd.steps;

import com.aut.project.bdd.userinterfaces.GoogleTranslatorPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.aut.project.bdd.tasks.TranslateTextTask.traducir;
import static com.aut.project.bdd.models.TranslateTextModel.Builder.elTexto;

public class TranslateTextSteps {
  
  private final Actor SANDRA = Actor.named("Sandra");
  private GoogleTranslatorPage googleTranslatorPage;

  @Before
  public void setup() {
    OnStage.setTheStage(new OnlineCast());
  }
    
  @Given("^quiero traducir un texto$")
  public void abrirTraductoGoogle() throws Throwable {
    SANDRA.wasAbleTo(Open.browserOn(googleTranslatorPage));
  }

  @When("^traduzco el texto (.+) del idioma origen (.+) al idioma destino (.+)$")
  public void traducirTexto(String textoTraducir, String idiomaOrigen, String idiomaDestino) throws Throwable {
      SANDRA.attemptsTo(traducir(elTexto(textoTraducir).delIdiomaOrigen(idiomaOrigen).alIdiomaDestino(idiomaDestino)));
    
  }

  @Then("^el texto traducido es (.+)$")
  public void verificarTextoTraducido(String textoTraducido) throws Throwable {
     
  }
  
}
