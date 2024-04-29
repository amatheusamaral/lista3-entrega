package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.ConversorDolar;

public class Exercicio4 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Valor da cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        
        System.out.print("Quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();
        
        ConversorDolar conversor = new ConversorDolar(cotacaoDolar, quantidadeDolares);
        
        double valorEmReais = conversor.calcularValorEmReais();
        
        System.out.println("Valor em Reais: R$" + valorEmReais);
        scanner.close();

    }
}
