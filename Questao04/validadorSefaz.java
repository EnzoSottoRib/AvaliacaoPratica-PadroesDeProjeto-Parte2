package Questao04;

public class validadorSefaz extends absHandler{

    @Override
    public void handleRequest(String tipo, int certificado, String regra, int id, String sefaz) {
        if(this.canHandle(sefaz)){
            System.out.println("Sefaz validado!");
        }
        else{
            System.out.println("Sefaz não validado!");
        }
    }

    private boolean canHandle(String sefaz){
        return (sefaz == "A1B2");
    }


}
