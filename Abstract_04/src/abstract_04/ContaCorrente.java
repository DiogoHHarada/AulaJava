package abstract_04;

import java.util.Scanner;

public class ContaCorrente extends Conta {

    @Override
    void depositar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor a ser depositado: ");
        float deposito = teclado.nextFloat();
        saldo += deposito;
        System.out.println("Saldo: " + saldo);
    }

    @Override
    void sacar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor a ser sacado: ");
        float saque = teclado.nextFloat();
        saldo -= saque;
        System.out.println("Saldo: " + saldo);
    }

}
