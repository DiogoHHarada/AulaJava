package prova_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Prova_02 {

    public static void main(String[] args) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        int op;

        do {
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Patinete");
            System.out.println("3 - Cadastrar Onibus");

            op = teclado.nextInt();
            switch (op) {
                case 1:
                    String id;
                    double vel;

                    System.out.println("Digite ID: ");
                    id = teclado.nextLine();

                    System.out.println("Digite a velocidade: ");
                    vel = teclado.nextDouble();
                    
                    listaVeiculos.add(new CarroEletrico(id, vel));
                    break;

                case 2:
                    System.out.println("Digite ID: ");
                    id = teclado.nextLine();
                    
                    System.out.println("Digite a velocidade: ");
                    vel = teclado.nextDouble();
                    
                    listaVeiculos.add(new Patinete(id, vel));
                    break;

                case 3:
                    System.out.println("Digite ID: ");
                    id = teclado.nextLine();

                    System.out.println("Digite a velocidade: ");
                    vel = teclado.nextDouble();
                    
                    listaVeiculos.add(new OnibusAutonomo(id, vel));
                    break;

                default:
            }
        } while (op != 0);

    }

}
