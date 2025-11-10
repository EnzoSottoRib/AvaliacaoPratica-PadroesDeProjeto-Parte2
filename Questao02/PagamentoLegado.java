package Questao02;

public class PagamentoLegado {

    public void autorizar(String cartao, double valor, String moeda){
        if(cartao == "123"){
            System.out.println("Pagando: " + valor + "" + moeda + " processado");
        } else {
            System.out.println("Pagamento não autorizado");
        }
    }

}
