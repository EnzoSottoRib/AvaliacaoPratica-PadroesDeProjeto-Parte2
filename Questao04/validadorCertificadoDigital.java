package Questao04;

public class validadorCertificadoDigital extends absHandler{
    
    @Override
    public void handleRequest(String tipo, int certificado, String regra, int id, String sefaz) {
        if(this.canHandle(certificado)){
            System.out.println("Certificado validado!");
            nextHandler.handleRequest(tipo, certificado, regra, id, sefaz);
        }
        else{
            System.out.println("Certificado não validado!");
            nextHandler.handleRequest(tipo, certificado, regra, id, sefaz);
        }
    }

    private boolean canHandle(int certificado){
        return (certificado == 1234);
    }

}
