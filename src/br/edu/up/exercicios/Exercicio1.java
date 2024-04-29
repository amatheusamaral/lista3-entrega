package br.edu.up.exercicios;
import java.util.Scanner;
import br.edu.up.modelos.Aluno; 

public class Exercicio1 {
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Nota da segunda prova: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Nota da terceira prova: ");
        double nota3 = scanner.nextDouble();
        
        Aluno aluno = new Aluno(nomeAluno, nota1, nota2, nota3);
        
        double media = aluno.calcularMedia();
        
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + media);
        scanner.close();

    }

}
