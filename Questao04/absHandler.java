package Questao04;

public abstract class absHandler{
    protected  absHandler nextHandler;
    
    public  void setNextHandle(absHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String tipo, int certificado, String regra, int id, String sefaz);
    
    private boolean canHandle(String tipo, int certificado, String regra, int id, String sefaz){
        return false;
    }

}