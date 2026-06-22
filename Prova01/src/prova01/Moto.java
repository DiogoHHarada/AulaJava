package prova01;

public class Moto extends Veiculo{
    int cilindradas;

    public Moto( int id, String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, id, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println(" | Cilindradas: " + cilindradas);
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
    
}
