package Aula01Heranca;

public class moto extends Veiculo {

    private boolean guidao;

    public moto(String modelo, int velocidadeMaxima, boolean guidao) {
        super(modelo, velocidadeMaxima);
        this.guidao = guidao;
    }

    @Override
    public void mover() {
        super.mover();
        System.out.println("Moto se movendo");
        Veiculo moto = new moto("Hornet", 200 , true);
    }
}