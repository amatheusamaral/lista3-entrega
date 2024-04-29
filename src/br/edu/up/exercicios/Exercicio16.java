package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Funcionario;

public class Exercicio16 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de funcionários: ");
        int numeroFuncionarios = scanner.nextInt();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        double aumentoFolha = 0;

        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            double salario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(salario);

            double reajuste = funcionario.calcularReajuste(salarioMinimo);
            aumentoFolha += reajuste;
            double novoSalario = funcionario.calcularNovoSalario(salarioMinimo);

            System.out.println("Reajuste para o funcionário " + (i + 1) + ": " + reajuste);
            System.out.println("Novo salário do funcionário " + (i + 1) + ": " + novoSalario);
        }

        System.out.println("Aumento total da folha de pagamento: " + aumentoFolha);
        scanner.close();

    }
}
