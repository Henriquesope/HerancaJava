package ExcLojaOnline;

public class Pedido {
    //atributos
    private String cliente;
    private Pagamento pagamento;

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void finalizarPedido(){
        System.out.println(cliente);
        System.out.println("pagamento; " + pagamento);
        pagamento.processarPagamento();
        System.out.println("Finalizado");
    }
}
