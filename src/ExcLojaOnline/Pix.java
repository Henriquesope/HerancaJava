package ExcLojaOnline;

public class Pix extends Pagamento{
    //construtor
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public String toString() { return super.toString();}

    @Override
    public double processarPagamento(double valor){
        System.out.println("Processando pagamento no Pix" + valor);
        return valor;

    }
}
