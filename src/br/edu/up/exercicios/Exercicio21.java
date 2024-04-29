package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Funcionario21;

public class Exercicio21 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        
        Funcionario21 funcionario = new Funcionario21(horasTrabalhadas, salarioMinimo);

        double valorHora = funcionario.calcularValorHora();
        double salarioBruto = funcionario.calcularSalarioBruto();
        double impostoRenda = funcionario.calcularImpostoRenda();
        double descontoINSS = funcionario.calcularDescontoINSS();
        double salarioLiquido = funcionario.calcularSalarioLiquido();
        
        System.out.println("Valor da Hora Trabalhada: " + valorHora);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Imposto de Renda: " + impostoRenda);
        System.out.println("Desconto do INSS: " + descontoINSS);
        System.out.println("Salário Líquido: " + salarioLiquido);
        scanner.close();

    }
}
