package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Funcionario18;

public class Exercicio18 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o sexo do funcionário (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        
        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();
        
        Funcionario18 funcionario = new Funcionario18(nome, sexo, idade, salarioFixo);

        double salarioLiquido = funcionario.calcularSalarioLiquido();
        
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário líquido acrescido do abono: " + salarioLiquido);
        scanner.close();

    }
}
