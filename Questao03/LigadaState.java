package Questao03;

public class LigadaState implements State{

    private Usina usina;

    public LigadaState(Usina usina){
        this.usina = usina;
    }

    public void ligar(){
        System.out.println("Usina já operando!");
    }

    public void desligar(){
        System.out.println("Desligando a usina");
        usina.setState(new DesligadaState(usina));
        System.out.println("Usina desligada!");
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
