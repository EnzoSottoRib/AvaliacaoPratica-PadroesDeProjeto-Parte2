package Questao03;

public class EmergenciaState implements State{

    private Usina usina;

    public EmergenciaState(Usina usina){
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
        System.out.println("A usina não está em alerta vermelho!");
    }

    public void ativarVermelho(){
        System.out.println("Ativando alerta vermelho!");
        usina.setState(new VermelhoState(usina));
        System.out.println("Alerta vermelho ativado!");
    }

    public void ativarEmergencia(){
        System.out.println("Usina já em alerta de emergência!");
    }

}
