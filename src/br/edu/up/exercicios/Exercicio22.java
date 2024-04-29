package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Funcionario22;

public class Exercicio22 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();
        
        System.out.print("Digite o tempo de serviço do funcionário (em anos): ");
        int tempoServico = scanner.nextInt();
        
        Funcionario22 funcionario = new Funcionario22(salarioAtual, tempoServico);

        double aumento = funcionario.calcularAumento();
        double novoSalario = funcionario.calcularNovoSalario();
        
        System.out.println("Aumento: " + aumento);
        System.out.println("Novo Salário: " + novoSalario);
        scanner.close();

    }
}
