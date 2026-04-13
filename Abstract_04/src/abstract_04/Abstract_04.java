
package abstract_04;

import java.util.Scanner;

public class Abstract_04 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta c = new ContaCorrente();
        
        int opcao;
        
        do {
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Sair");
            
            opcao = teclado.nextInt();
            switch(opcao){
                case 1:
                c.depositar();
                break;      
                
                case 2:
                c.sacar();
                break;
                
                default:
                    System.out.println("Escolha uma opcao valida");
            }
        } while (opcao != 3);
    }
    
}
