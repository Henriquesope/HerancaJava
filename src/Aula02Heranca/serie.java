package Aula02Heranca;

public class serie extends midia{

    private int temporada;

    public serie(String titulo, int duracaoMin, String genero, int temporada) {
        super(titulo, duracaoMin, genero);
        this.temporada = temporada;
    }

    public int getTemporada() {
        return this.temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }


    @Override      //exibirDados()
    public String toString(){
        return super.toString() + " | Temporada: " + temporada;
    }
}
