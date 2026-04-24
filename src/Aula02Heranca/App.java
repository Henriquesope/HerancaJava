package Aula02Heranca;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args){

      midia filme = new filme("ta chovendo hamburguer", 90, "comedia de animação", "Pixar", "n tem pois é uma animaçao");
      midia serie = new serie("Stranger things", 1000, "Ficção cientifica", 5);
      filme doc = new documentario("Java", 90, "Faculdade", "Prof Fernando", "Alunos", "DDD");

        System.out.println(filme);
        System.out.println("------------------------");
        System.out.println(serie);
        System.out.println("------------------------");
        System.out.println(doc);
    }
}
