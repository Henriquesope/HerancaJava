package ExcLojaOnline;

public abstract class Pagamento {
    //atributos
    private double valor;

    //getters e setters
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    //construtor
    public Pagamento(double valor) {
        this.valor = valor;
    }

    //metodo processar pagamento
    public double processarPagamento() {
        System.out.println("Processando pagamento" + valor);
        return this.valor;
    }

    @Override
    public String toString(){
        return "Seu valor" + valor;
    }

    public abstract double processarPagamento(double valor);
}
