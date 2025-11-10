package Questao03;

public class VermelhoState implements State{

    private Usina usina;

    public VermelhoState(Usina usina){
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
        System.out.println("Ativando alerta amarelo!");
        usina.setState(new AmareloState(usina));
        System.out.println("Alerta amarelo ativado!");
    }

    public void ativarVermelho(){
        System.out.println("Usina já em alerta vermelho!");
    }

    public void ativarEmergencia(){
        System.out.println("Ativando alerta de emergência!");
        usina.setState(new EmergenciaState(usina));
        System.out.println("Alerta de emergência ativado!");
    }

}
