package Questao04;

public class ValidadorXml extends AbsValidador{

    public void handleRequest(NotaFiscal notaFiscal){
        if(canHandle(notaFiscal)){
            System.out.println("Sucesso, passando para próximo validador");
            setNextHandler(new ValidadorCertificado());
        } else{
            System.out.println("Erro, validando XSD");
            setNextHandler(new ValidadorXml());
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
