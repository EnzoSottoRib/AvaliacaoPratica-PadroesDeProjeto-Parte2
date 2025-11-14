package Questao04;

public class validadorXML extends absHandler{
    
    @Override
    public void handleRequest(String tipo, int certificado, String regra, int id, String sefaz) {
        if(this.canHandle(tipo)){
            System.out.println("Arquivo validado XML!");
            nextHandler.handleRequest(tipo, certificado, regra, id, sefaz);
        }
        else{
            System.out.println("Arquivo não validado XML!");
            nextHandler.handleRequest(tipo, certificado, regra, id, sefaz);
        }
    }

    private boolean canHandle(String tipo){
        return (tipo == "XML");
    }

}
