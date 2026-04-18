public class caminhao extends Veiculo{

    private int nCargas;

    public caminhao(String modelo, int velocidadeMaxima, int nCargas) {
        super(modelo, velocidadeMaxima);
        this.nCargas = nCargas;
    }

    @Override
    public void mover(){
        System.out.println("O caminhao esta se movendo");
        Veiculo caminhao = new caminhao("cargueiro", 130, 3);
    }
}
