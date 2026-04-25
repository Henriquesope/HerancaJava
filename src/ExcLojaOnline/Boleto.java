package ExcLojaOnline;

public class Boleto extends Pagamento{
    //construtor
    public Boleto(double valor) {
        super(valor);
    }

    // override
    @Override
    public String toString() { return super.toString();}

    @Override
    public double processarPagamento(double valor){
        System.out.println("Processando pagamento no Boleto" + valor);
        return valor;
    }
}
