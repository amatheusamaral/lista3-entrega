package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Funcionario23;

public class Exercicio23 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();
        
        System.out.print("Digite o tempo de serviço do funcionário (em anos): ");
        int tempoServico = scanner.nextInt();
        
        Funcionario23 funcionario = new Funcionario23(salarioAtual, tempoServico);

        double aumento = funcionario.calcularAumento();
        double novoSalario = funcionario.calcularNovoSalario();
        
        System.out.println("Valor do Aumento: " + aumento);
        System.out.println("Novo Salário: " + novoSalario);
        scanner.close();

    }
}
