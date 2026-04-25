package ExcLojaOnline;

public class CartaoCredito extends Pagamento{

    //construtor
    public CartaoCredito(double valor) {
        super(valor);
    }

    //override
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double processarPagamento(double valor){
        System.out.println("Processando pagamento no Cartao de credito" + valor);
        return valor;
    }
}
