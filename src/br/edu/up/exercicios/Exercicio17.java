package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Funcionario17;

public class Exercicio17 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();
        
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        Funcionario17 funcionario = new Funcionario17(nomeFuncionario, salarioAtual);

        double novoSalario = funcionario.calcularNovoSalario();
        double aumentoFolha = funcionario.calcularAumentoFolha();
        
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: " + aumentoFolha);
        System.out.println("Novo salário: " + novoSalario);
        
        double aumentoTotalFolha = funcionario.calcularAumentoTotalFolha(584);
        System.out.println("Aumento total na folha de pagamento: " + aumentoTotalFolha);
        
        scanner.close();
    }
}

