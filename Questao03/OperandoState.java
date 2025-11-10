package Questao03;

public class OperandoState implements State{

    private Usina usina;

    public OperandoState(Usina usina){
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
        System.out.println("A usina não está em alerta amarelo");
    }

    public void ativarEmergencia(){
        System.out.println("A usina não está em alerta vermelho");
    }

}
