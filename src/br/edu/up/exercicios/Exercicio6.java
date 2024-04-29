package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Produto;

public class Exercicio6 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();
        
        System.out.print("Percentual de acréscimo (%): ");
        double percentualAcrescimo = scanner.nextDouble();
        
        Produto produto = new Produto(precoCusto, percentualAcrescimo);
        
        double valorVenda = produto.calcularValorVenda();
        
        System.out.println("Valor de Venda: " + valorVenda);
        scanner.close();

    }

}
