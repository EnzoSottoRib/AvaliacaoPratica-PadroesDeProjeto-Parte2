package Questao03;

public class AmareloState implements State{

    private Usina usina;

    public AmareloState(Usina usina){
        this.usina = usina;
    }

    public void ligar(){
        System.out.println("Usina já ligada");
    }

    public void desligar(){
        System.out.println("Desligando a usina");
        usina.setState(new DesligadaState(usina));
        System.out.println("Usina desligada!");
    }

    public void ativarAmarelo(){
        System.out.println("A usina já está em alerta amarelo");
    }

    public void ativarVermelho(){
        System.out.println("Ativando alerta vermelho!");
        usina.setState(new VermelhoState(usina));
        System.out.println("Alerta vermelho ativado!");
    }

    public void ativarEmergencia(){
        System.out.println("A usina não está em alerta vermelho!");
    }

}
