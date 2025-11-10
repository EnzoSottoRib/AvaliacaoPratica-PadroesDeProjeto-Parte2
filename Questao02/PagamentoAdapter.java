package Questao02;

public class PagamentoAdapter implements ProcessadorPagamento{

    private PagamentoLegado gatewayLegado;

    private PagamentoAdapter(PagamentoLegado gateway){
        this.gatewayLegado = gateway;
    }

    @Override
    public void processarPagamento(double valor){
        gatewayLegado.autorizar(null, valor, null);
    }

}
