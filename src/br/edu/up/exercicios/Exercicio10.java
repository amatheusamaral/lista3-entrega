package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Pessoa;

public class Exercicio10 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();
        
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            
            Pessoa pessoa = new Pessoa(idade);
            
            if (pessoa.isMaiorIdade()) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }
        scanner.close();

    }

}
