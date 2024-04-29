package br.edu.up.exercicios;
import java.util.Scanner;
import br.edu.up.modelos.Pretendente;
public class Exercicio26 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do pretendente: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a idade do pretendente: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite o grupo de risco (Baixo = 1, Médio = 2, Alto = 3): ");
        int grupoRisco = scanner.nextInt();
        
        Pretendente pretendente = new Pretendente(nome, idade, grupoRisco);
        int categoria = pretendente.calcularCategoria();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Grupo de risco: " + grupoRisco);
        System.out.println("Categoria: " + categoria);
        
        scanner.close();
    }
}
