public class bike extends Veiculo{

    public bike(String modelo, int velocidadeMaxima) {
        super(modelo, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("A bike esta se movendo");
        Veiculo bike = new bike("Caloi", 60);
    }
}
