package abstract_02;

import java.util.Scanner;

public class Retangulo extends FormaGeometrica {

    @Override
    void cacularArea() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a largura do Retangulo: ");
        int largura = teclado.nextInt();
        
        System.out.println("Digite o comprimento do retangulo");
        int comprimento = teclado.nextInt();
        
        int area = largura * comprimento;
        
        System.out.println("Area: " + area);
    }
    
}
