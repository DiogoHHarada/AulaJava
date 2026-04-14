package prova_02;

abstract class Veiculo {
    String id;
    double velocidade;

    public Veiculo(String id, double velocidade) {
        this.id = id;
        this.velocidade = velocidade;
    }
    
    
    
    public void exbirInfo(){
        
    }
    
    abstract void mover();
}
