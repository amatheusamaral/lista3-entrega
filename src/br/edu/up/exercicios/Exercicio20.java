package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Funcionario20;

public class Exercicio20 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        
        Funcionario20 funcionario = new Funcionario20(salarioMinimo, horasTrabalhadas);

        double valorHora = funcionario.calcularValorHora();
        double salarioBruto = funcionario.calcularSalarioBruto();
        double descontoINSS = funcionario.calcularDescontoINSS();
        double salarioLiquido = funcionario.calcularSalarioLiquido();
        
        System.out.println("Valor da Hora Trabalhada: " + valorHora);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto do INSS: " + descontoINSS);
        System.out.println("Salário Líquido: " + salarioLiquido);
        scanner.close();

    }
}
