package com.aut.project.bdd.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.aut.project.bdd.models.TranslateTextModel;
import static com.aut.project.bdd.userinterfaces.GoogleTranslatorPage.*;


public class TranslateTextTask implements Task {

  private TranslateTextModel translateTextModel;
  
  public TranslateTextTask(TranslateTextModel translateTextModel) {
    this.translateTextModel=translateTextModel;
  }
  
  @Override
  public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_SELECCIONAR_IDIOMA_ORIGEN),
        Click.on(IDIOMA_ORIGEN.of(translateTextModel.getIdiomaOrigen())),
        Click.on(BOTON_SELECCIONAR_IDIOMA_DESTINO),
        Click.on(IDIOMA_DESTINO.of(translateTextModel.getIdiomaDestino())),
        Enter.theValue(translateTextModel.getTextoTraducir()).into(TEXTO_A_TRADUCIR));
     
  }
  
  public static TranslateTextTask traducir(TranslateTextModel translateTextModel) {
    return instrumented(TranslateTextTask.class, translateTextModel);
  }

}
