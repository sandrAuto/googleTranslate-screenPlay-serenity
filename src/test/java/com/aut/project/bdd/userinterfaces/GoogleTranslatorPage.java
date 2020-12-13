package com.aut.project.bdd.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://translate.google.com")

public class GoogleTranslatorPage extends PageObject {
  
  public static final Target BOTON_SELECCIONAR_IDIOMA_ORIGEN = Target.the("Botón para seleccionar el idioma origen").locatedBy("//div[2]/div/div/div/div/div/div[3]");
  public static final Target IDIOMA_ORIGEN = Target.the(("Idioma origen seleccionado {0}")).locatedBy("/html/body/div[2]/div[2]/div[5]/div/div[2]/div[1]/div[2]/div/div[3]//div[contains(text(),'{0}')]");
  public static final Target BOTON_SELECCIONAR_IDIOMA_DESTINO = Target.the("Botón para seleccionar el idioma destino").locatedBy("//div/div/div[4]/div[3]");
  public static final Target IDIOMA_DESTINO = Target.the(("Idioma destino seleccionado {0}")).locatedBy("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[3]/c-wiz/div[2]/div/div[3]/div/div[2]//div[contains(text(),'{0}')]");
  public static final Target TEXTO_A_TRADUCIR = Target.the(("Texto a traducir")).located(By.id("source"));
  public static final Target TEXTO_TRADUCIDO = Target.the(("Texto traducido")).locatedBy("//span/span");
   

}
