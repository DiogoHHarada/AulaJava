package prova01;

import java.util.Scanner;

public class Prova01 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaVeiculos sistema = new SistemaVeiculos();
        
        int contadorId = 1; // Controle manual e sequencial do ID único exigido na prova
        int opcao; // Não precisa mais inicializar com -1, pois o do-while vai ler o valor antes de testar

        do {
            System.out.println("\n=== MENU DE GERENCIAMENTO ===");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Moto");
            System.out.println("3 - Listar Carros");
            System.out.println("4 - Listar Motos");
            System.out.println("5 - Atualizar Carro");
            System.out.println("6 - Atualizar Moto");
            System.out.println("7 - Remover Carro");
            System.out.println("8 - Remover Moto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer após ler a opção do menu

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastrar Carro ---");
                    System.out.print("Marca: ");
                    String marcaC = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modeloC = scanner.nextLine();
                    System.out.print("Ano: ");
                    int anoC = scanner.nextInt();
                    System.out.print("Quantidade de Portas: ");
                    int portas = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    Carro novoCarro = new Carro(contadorId, marcaC, modeloC, anoC, portas);
                    sistema.cadastrarCarro(novoCarro);
                    contadorId++; // Incrementa o contador geral para o próximo veículo
                    break;

                case 2:
                    System.out.println("\n--- Cadastrar Moto ---");
                    System.out.print("Marca: ");
                    String marcaM = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modeloM = scanner.nextLine();
                    System.out.print("Ano: ");
                    int anoM = scanner.nextInt();
                    System.out.print("Cilindradas: ");
                    int cilindradas = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    Moto novaMoto = new Moto(contadorId, marcaM, modeloM, anoM, cilindradas);
                    sistema.cadastrarMoto(novaMoto);
                    contadorId++; // Incrementa o contador geral
                    break;

                case 3:
                    System.out.println("\n--- Lista de Carros ---");
                    sistema.listarCarros();
                    break;

                case 4:
                    System.out.println("\n--- Lista de Motos ---");
                    sistema.listarMotos();
                    break;

                case 5:
                    System.out.println("\n--- Atualizar Carro ---");
                    System.out.print("Digite o ID do carro que deseja atualizar: ");
                    int idAtualizarC = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    
                    System.out.print("Nova Marca: ");
                    String novaMarcaC = scanner.nextLine();
                    System.out.print("Novo Modelo: ");
                    String novoModeloC = scanner.nextLine();
                    System.out.print("Novo Ano: ");
                    int novoAnoC = scanner.nextInt();
                    System.out.print("Nova Qtd de Portas: ");
                    int novasPortas = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    
                    sistema.atualizarCarro(idAtualizarC, novaMarcaC, novoModeloC, novoAnoC, novasPortas);
                    break;

                case 6:
                    System.out.println("\n--- Atualizar Moto ---");
                    System.out.print("Digite o ID da moto que deseja atualizar: ");
                    int idAtualizarM = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    
                    System.out.print("Nova Marca: ");
                    String novaMarcaM = scanner.nextLine();
                    System.out.print("Novo Modelo: ");
                    String novoModeloM = scanner.nextLine();
                    System.out.print("Novo Ano: ");
                    int novoAnoM = scanner.nextInt();
                    System.out.print("Nova Cilindrada: ");
                    int novasCilindradas = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    
                    sistema.atualizarMoto(idAtualizarM, novaMarcaM, novoModeloM, novoAnoM, novasCilindradas);
                    break;

                case 7:
                    System.out.println("\n--- Remover Carro ---");
                    System.out.print("Digite o ID do carro a ser removido: ");
                    int idRemoverC = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    sistema.removerCarro(idRemoverC);
                    break;

                case 8:
                    System.out.println("\n--- Remover Moto ---");
                    System.out.print("Digite o ID da moto a ser removida: ");
                    int idRemoverM = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    sistema.removerMoto(idRemoverM);
                    break;

                case 0:
                    System.out.println("Saindo do sistema. Bons estudos para a prova!");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um número de 0 a 8.");
                    break;
            }
        } while (opcao != 0); // A verificação ocorre aqui, no final do laço

        scanner.close();
    }
    
}
