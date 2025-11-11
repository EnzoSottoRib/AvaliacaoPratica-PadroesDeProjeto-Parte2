package Questao04;

public class ValidadorCertificado extends AbsValidador{

    public void handleRequest(NotaFiscal notaFiscal){

        if(canHandle(notaFiscal)){
        System.out.println("Sucesso, passando para próximo validador");
        setNextHandler(new );
        } else{
            System.out.println("Erro");
        }
        
        

    }

    public boolean canHandle(NotaFiscal notaFiscal){
        if(notaFiscal.data.containsKey("Validade")){
            LocalDate dataValidade = (LocalDate) documento.data.get("Validade");
            
        }

        return false;
    }

}
