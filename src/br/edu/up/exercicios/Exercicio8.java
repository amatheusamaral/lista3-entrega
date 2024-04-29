package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.AlunoEx8;

public class Exercicio8 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        AlunoEx8 aluno = new AlunoEx8(nomeAluno, nota1, nota2, nota3);
        
        double media = aluno.calcularMedia();
        
        String mencao = aluno.obterMencao();
        
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Menção: " + mencao);
        
        System.out.println("Média do Aluno: " + media); // Adicionando a impressão da média
        
        scanner.close();
    }
}
