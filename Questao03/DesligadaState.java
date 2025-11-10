package Questao03;

public class DesligadaState implements State{

    private Usina usina;

    public DesligadaState(Usina usina){
        this.usina = usina;
    }

    public void ligar(){
        System.out.println("Usina ligando...");
        usina.setState(new OperandoState(usina));
        System.out.println("Usina operando normalmente!");
    }

    public void desligar(){
        System.out.println("Usina já desligada!");
    }

    public void ativarAmarelo(){
        System.out.println("A usina não está em operação");
    }

    public void ativarVermelho(){
        System.out.println("A usina não está em operação");
    }

    public void ativarEmergencia(){
        System.out.println("A usina não está em operação");
    }

}
