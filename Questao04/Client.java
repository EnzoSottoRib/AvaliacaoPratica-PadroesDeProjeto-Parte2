package Questao04;

public class Client {
    public static void main(String[] args) {
        
        absHandler validadorXML = new validadorXML();
        absHandler validadorXSD = new validadorXSD();
        absHandler validadorCertificado = new validadorCertificadoDigital();
        absHandler validadorRegra = new validadorRegra();
        absHandler validadorId = new validadorId();
        absHandler validadorSefaz = new validadorSefaz();

        validadorXML.setNextHandle(validadorXSD);
        validadorXSD.setNextHandle(validadorCertificado);
        validadorCertificado.setNextHandle(validadorRegra);
        validadorRegra.setNextHandle(validadorId);
        validadorId.setNextHandle(validadorSefaz);

        validadorXML.handleRequest("XML", 1234, "B", 12, "A1B2");

    }
}
