package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Poupanca;

public class Exercicio25 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do depósito inicial: ");
        double depositoInicial = scanner.nextDouble();
        
        System.out.print("Digite a taxa de juros mensal (em percentual): ");
        double taxaJuros = scanner.nextDouble();
        
        Poupanca conta = new Poupanca(depositoInicial, taxaJuros);

        double saldoFinal = conta.calcularSaldoFinal(24);
        
        System.out.println("Saldo final após 24 meses: " + saldoFinal);
        scanner.close();

    }
}
