package prova01;

import java.util.ArrayList;

public class SistemaVeiculos {
    
    ArrayList<Carro> carros = new ArrayList<>();
    ArrayList<Moto> motos = new ArrayList<>();
    
    public void cadastrarCarro(Carro c){
        carros.add(c);
        System.out.println("Carro cadastrado com sucesso!");
    }
    
    public void listarCarros(){
        if(carros.isEmpty()){
            System.out.println("Nenhum Carro Cadastrado");
        }else{
            for(Carro c : carros){
                c.exibirInfo();
            }
        }
    }
    
    public Carro buscarCarro(int id){
        for(Carro c : carros){
            if(c.getId() == id){
                return c;
            }
           
        }
        return null;
    }
    
    public void atualizarCarro(int id, String marca, String modelo, int ano, int portas) {
        Carro c = buscarCarro(id);
        if (c != null) {
            c.setMarca(marca);
            c.setModelo(modelo);
            c.setAno(ano);
            c.setPortas(portas);
            System.out.println("Carro atualizado com sucesso!");
        } else {
            System.out.println("Erro: Carro com ID " + id + " não encontrado para atualização.");
        }
    }
    
    public void removerCarro(int id) {
        Carro c = buscarCarro(id);
        if (c != null) {
            carros.remove(c);
            System.out.println("Carro removido com sucesso!");
        } else {
            System.out.println("Erro: Carro com ID " + id + " não encontrado para remoção.");
        }
    }
    public void cadastrarMoto(Moto m){
        motos.add(m);
        System.out.println("Carro cadastrado com sucesso!");
    }
    
    public void listarMotos(){
        if(carros.isEmpty()){
            System.out.println("Nenhuma Moto Cadastrada");
        }else{
            for(Moto m : motos){
                m.exibirInfo();
            }
        }
    }
    
    public Moto buscarMoto(int id){
        for(Moto m : motos){
            if(m.getId() == id){
                return m;
            }
           
        }
        return null;
    }
    
    public void atualizarMoto(int id, String marca, String modelo, int ano, int cilindradas) {
        Moto m = buscarMoto(id);
        if (m != null) {
            m.setMarca(marca);
            m.setModelo(modelo);
            m.setAno(ano);
            m.setCilindradas(cilindradas);
            System.out.println("Carro atualizado com sucesso!");
        } else {
            System.out.println("Erro: Carro com ID " + id + " não encontrado para atualização.");
        }
    }
    
    public void removerMoto(int id) {
        Moto m = buscarMoto(id);
        if (m != null) {
            motos.remove(m);
            System.out.println("Carro removido com sucesso!");
        } else {
            System.out.println("Erro: Carro com ID " + id + " não encontrado para remoção.");
        }
    }
  
}
