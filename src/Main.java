//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Veiculo carro = new carro("HB20", 200,4);
        Veiculo moto = new moto("Hornet", 200 , true);
        Veiculo bike = new bike("Caloi", 60);
        Veiculo caminhao = new caminhao("cargueiro", 130, 3);
        carro.mover();
        moto.mover();
        bike.mover();
        caminhao.mover();

    }
}
