package Aula01Heranca;

public class Veiculo {
    private String modelo;
    private int velocidadeMaxima;

    public Veiculo(String modelo, int velocidadeMaxima){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void mover(){
        System.out.println("O veiculo esta se movendo...");
    }
}
