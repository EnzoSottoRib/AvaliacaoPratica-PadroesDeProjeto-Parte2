package Questao04;

public class validadorRegra extends absHandler{

    @Override
    public void handleRequest(String tipo, int certificado, String regra, int id, String sefaz) {
        if(this.canHandle(regra)){
            System.out.println("Regra validada!");
            nextHandler.handleRequest(tipo, certificado, regra, id, sefaz);
        }
        else{
            System.out.println("Regra não validada!");
            nextHandler.handleRequest(tipo, certificado, regra, id, sefaz);
        }
    }

    private boolean canHandle(String regra){
        return (regra == "B");
    }

}
