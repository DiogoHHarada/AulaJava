package prova01;

public class Carro extends Veiculo {
    
  int portas;

    public Carro(int id, String marca, String modelo,  int ano, int portas) {
        super(marca, modelo, id, ano);
        this.portas = portas;
    }
    
  @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println(" | Portas: " + portas);
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    
  
  
    
}
