package prova_02;

public class OnibusAutonomo  extends  Veiculo implements Autonomo{

    public OnibusAutonomo(String id, double velocidade) {
        super(id, velocidade);
    }

    @Override
    void mover() {
        System.out.println("Onibusto esta se movendo...");
    }

    @Override
    public void dirigirSozinho() {
        System.out.println("O onibus esta com o piloto automatico ativado...");
    }
    
}
