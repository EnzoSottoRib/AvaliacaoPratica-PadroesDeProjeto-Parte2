package Questao04;

import java.util.concurrent.TimeoutException;

public class ValidadorXsd extends AbsValidador{


    public ValidadorXsd(){
        setNextHandler(new ValidadorCertificado());
    }


    public void handleRequest(NotaFiscal notaFiscal){

            if(canHandle(notaFiscal)){
            System.out.println("Sucesso, passando para próximo validador");

            nextValidador.handleRequest(notaFiscal);
            } else{
                System.out.println("Erro");
            }
        
        

    }

    public boolean canHandle(NotaFiscal notaFiscal){
        if(notaFiscal.data.containsKey("Schema")){
            Object tipoNota = notaFiscal.data.get("Schema");
            return tipoNota != null && tipoNota.toString().equals("XML");
        }

        return false;
    }

}
