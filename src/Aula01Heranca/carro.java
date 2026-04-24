package Aula01Heranca;

public class carro extends Veiculo {

    private int nPortas;

    //Autocomplete pegando os atributos da super classe
    public carro(String modelo, int velocidadeMaxima, int nPortas) {
        super(modelo, velocidadeMaxima);
        this.nPortas = nPortas;
    }

    @Override
    public void mover() {
        super.mover();
        Veiculo carro = new carro("HB20", 200,4);
    }
}
