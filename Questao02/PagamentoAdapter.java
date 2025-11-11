package Questao02;

import java.util.HashMap;

public class PagamentoAdapter implements ProcessadorTransacoes{

    private SistemaBancarioLegado sistemaBancarioLegado;

    public PagamentoAdapter(SistemaBancarioLegado sistemaBancarioLegado){
        this.sistemaBancarioLegado = sistemaBancarioLegado;
    }

    public String autorizar(String cartao, double valor, String moeda){

        HashMap<String, Object> parametros = new HashMap<>();

        parametros.put("cartao", cartao);

        parametros.put("valor", valor);

        parametros.put("codigoMoeda", moedaParaCodigo(moeda));


        parametros.put("banco", "Banco");

        HashMap<String, Object> respostaLegado = sistemaBancarioLegado.processarTransacao(parametros);

        return respostaFinal(respostaLegado);

    }


    private int moedaParaCodigo(String moeda){
        switch (moeda) {
            case "USD":
                return 1;
        
            case "EUR":
                return 2;

            case "BRL":
                return 3;
            default:
                return 0;
        }
    }

    private String respostaFinal(HashMap<String, Object> resposta){
        return "Transação aprovada com o valor: " + resposta.get("valor") + " e moeda: " + resposta.get("codigoMoeda");
    }
}
