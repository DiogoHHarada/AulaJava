package prova_02;

public class Patinete extends Veiculo implements Eletrico, Compartilhavel{

    public Patinete(String id, double velocidade) {
        super(id, velocidade);
    }

    @Override
    void mover() {
        System.out.println("Patinete esta se movendo....");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Patinete esta carregando");
    }

    @Override
    public double calcularCusto(double distancia) {
        
        return distancia * 1.0;
        
    }
    
}
