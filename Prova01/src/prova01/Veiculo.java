
package prova01;

public abstract class Veiculo {
    String marca, modelo;
    int id, ano;

    public Veiculo(String marca, String modelo, int id, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

   
    
    public void exibirInfo(){
        System.out.print("ID: " + id + " | " + marca + " " + modelo + " " + ano);
    }
}
