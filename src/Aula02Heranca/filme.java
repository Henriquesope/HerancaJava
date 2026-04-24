package Aula02Heranca;

public class filme extends midia {
    private String atorPrincipal;
    private String diretor;

    public filme(String titulo, int duracaoMin, String genero , String diretor, String atorPrincipal ) {
        super(titulo, duracaoMin, genero);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtorPrincipal(){
        return this.atorPrincipal;
    }

    public void setAtorPrincipal(){
        this.atorPrincipal = atorPrincipal;
    }

    @Override
    public String toString(){
        return super.toString() + " Diretor: " + diretor + " Ator principal: " + atorPrincipal;
    }
}
