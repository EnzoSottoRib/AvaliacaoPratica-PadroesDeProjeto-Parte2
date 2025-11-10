package Questao03;

public class Usina {

    private State state;

    public Usina(){
        this.state = new DesligadaState(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public void ligar(){
        state.ligar();
    }

    public void ativarAmarelo(){
        state.ativarAmarelo();
    }

    public void ativarVermelho(){
        state.ativarVermelho();
    }

    public void ativarEmergencia(){
        state.ativarEmergencia();
    }

}
