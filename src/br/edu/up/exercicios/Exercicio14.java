package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Produto14;

public class Exercicio14 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;
        int totalLucro = 0;
        int totalPrejuizo = 0;
        int totalEmpate = 0;
        
        for (int i = 0; i < 40; i++) {
            System.out.print("Digite o preço de custo do produto " + (i + 1) + ": ");
            double precoCusto = scanner.nextDouble();
            
            System.out.print("Digite o preço de venda do produto " + (i + 1) + ": ");
            double precoVenda = scanner.nextDouble();
            
            Produto14 produto = new Produto14(precoCusto, precoVenda);
            
            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;
            
            if (produto.temLucro()) {
                totalLucro++;
                System.out.println("Lucro para o produto " + (i + 1));
            } else if (produto.temPrejuizo()) {
                totalPrejuizo++;
                System.out.println("Prejuízo para o produto " + (i + 1));
            } else {
                totalEmpate++;
                System.out.println("Empate para o produto " + (i + 1));
            }
        }
        
        double mediaPrecoCusto = somaPrecoCusto / 40;
        double mediaPrecoVenda = somaPrecoVenda / 40;
        
        System.out.println("Total de produtos com lucro: " + totalLucro);
        System.out.println("Total de produtos com prejuízo: " + totalPrejuizo);
        System.out.println("Total de produtos com empate: " + totalEmpate);
        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);
        scanner.close();

    }

}
