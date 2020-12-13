package com.aut.project.bdd.models;

public class TranslateTextModel {

  public String textoTraducir;
  public String idiomaOrigen;
  public String idiomaDestino;
  
  public TranslateTextModel (String textoTraducir,String idiomaOrigen,String idiomaDestino) {
    this.textoTraducir=textoTraducir;
    this.idiomaOrigen=idiomaOrigen;
    this.idiomaDestino=idiomaDestino;    
  }

  public String getTextoTraducir() {
    return textoTraducir;
  }

  public String getIdiomaOrigen() {
    return idiomaOrigen;
  }

  public String getIdiomaDestino() {
    return idiomaDestino;
  }
  
  public static class Builder {
    private TranslateTextModel translateTextModel;
  
  private Builder(String textoTraducir) {
    translateTextModel.textoTraducir = textoTraducir;
  }
    
  public static Builder elTexto(String textoTraducir) {
    return new Builder(textoTraducir); 
  }
  
  public Builder delIdiomaOrigen(String idiomaOrigen) {
    translateTextModel.idiomaOrigen=idiomaOrigen;
   return this;
  }
    
  public TranslateTextModel alIdiomaDestino(String idiomaDestino) {
    translateTextModel.idiomaDestino=idiomaDestino;
    return translateTextModel;
  }
  
 }
  
  
  
}
