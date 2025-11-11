package Questao02;

public class Client {
    public static void main(String[] args) {
        SistemaBancarioLegado sistemaBancarioLegado = new SistemaBancarioLegado();

        ProcessadorTransacoes processadorTransacoes = new PagamentoAdapter(sistemaBancarioLegado);

        String pagamento = processadorTransacoes.autorizar("999888777", 1000, "BRL");
        System.out.println(pagamento);

    }
}
