package Aula02Heranca;

public class documentario extends filme{
    private String tema;
    public documentario(String titulo, int duracaoMin, String genero, String diretor, String atorPrincipal, String tema) {
        super(titulo, duracaoMin, genero, diretor, atorPrincipal);
        this.tema = tema;
    }

    public String getTema() {
        return this.tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString(){
        return super.toString() + " tema: " + tema;
    }
}
