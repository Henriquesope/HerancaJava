package Aula02Heranca;

public class midia {

    private String titulo;
    private int duracaoMin;
    private String genero;

    // construtor
    public midia(String titulo, int duracaoMin, String genero ) {
        this.titulo = titulo;
        this.duracaoMin = duracaoMin;
        this.genero = genero;
    }
    // --------------------
    //getters e seters
    // -------------
    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(){
        this.titulo = titulo;
    }

    public int getDuracaoMin() {
        return this.duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(){
        this.genero = genero;
    }

    //Sobescruta do metodo toString da classe
    // Object (classe default do java) esse metodo seria o mostrar dados()

    @Override
    public String toString(){
        return "Titulo: " + titulo + " Duração: " + duracaoMin + "min" + " Genero:" + genero;
    }


}
