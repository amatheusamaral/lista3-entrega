package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Funcionario19;

public class Exercicio19 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();
        
        Funcionario19 funcionario = new Funcionario19(horasTrabalhadas, valorHora);

        double salarioBruto = funcionario.calcularSalarioBruto();
        double descontoINSS = funcionario.calcularDescontoINSS();
        double salarioLiquido = funcionario.calcularSalarioLiquido();
        
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto do INSS: " + descontoINSS);
        System.out.println("Salário Líquido: " + salarioLiquido);
        scanner.close();

    }
}
