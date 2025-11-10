package Questao03;

public class Main {
    public static void main(String[] args) {
        Usina usina = new Usina();

        usina.ativarAmarelo();
        usina.ligar();
        usina.ativarVermelho();
        usina.ativarAmarelo();
        usina.ativarVermelho();
        usina.ativarEmergencia();
        usina.ativarAmarelo();
        usina.ativarVermelho();
    }
}
