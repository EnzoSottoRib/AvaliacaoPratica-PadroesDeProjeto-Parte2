package Questao04;

public abstract class AbsValidador {

    protected AbsValidador proximoValidador;

    public void setNextHandler(AbsValidador nextValidador){
        this.proximoValidador = proximoValidador;
    }

    public abstract void handleRequest(NotaFiscal notaFiscal);

    public abstract boolean canHandle(NotaFiscal notaFiscal);

}
