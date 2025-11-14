package Questao04;

public class validadorId extends absHandler{

    @Override
    public void handleRequest(String tipo, int certificado, String regra, int id, String sefaz) {
        if(this.canHandle(id)){
            System.out.println("Id validado!");
            nextHandler.handleRequest(tipo, certificado, regra, id, sefaz);
        }
        else{
            System.out.println("Id não validado!");
            nextHandler.handleRequest(tipo, certificado, regra, id, sefaz);
        }
    }

    private boolean canHandle(int id){
        return (id == 12);
    }

}
