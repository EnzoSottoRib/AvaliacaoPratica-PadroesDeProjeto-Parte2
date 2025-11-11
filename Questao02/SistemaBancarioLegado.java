package Questao02;


import java.util.HashMap;
public class SistemaBancarioLegado {

    public HashMap<String, Object> processarTransacao(HashMap<String, Object> parametros){

        HashMap<String, Object> resposta = new HashMap<>();

        if (!parametros.containsKey("banco")){
            resposta.put("mensagem", "Campo 'banco' ausente");
        }

        resposta.put("codigoAutorizacao", "A-3P0");
        resposta.put("valor", parametros.get("valor"));
        resposta.put("codigoMoeda", parametros.get("codigoMoeda"));

        return resposta;

    }

}
