package prova_02;

public class CarroEletrico extends Veiculo implements Eletrico, Compartilhavel{

    public CarroEletrico(String id, double velocidade) {
        super(id, velocidade);
    }

    @Override
    void mover() {
        System.out.println("Carro esta se movendo...");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carro esta carregando...");
    }

    @Override
    public double calcularCusto(double distancia) {
        
        return distancia * 2.5;
        
    }
    
}
