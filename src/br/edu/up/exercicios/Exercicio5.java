package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.CompraParcelada;

public class Exercicio5 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Valor da compra: ");
        double valorCompra = scanner.nextDouble();
        
        CompraParcelada compra = new CompraParcelada(valorCompra);
        
        double valorPrestacoes = compra.calcularValorPrestacoes(5);
        
        System.out.println("Valor das Prestações: " + valorPrestacoes);
        scanner.close();

    }
}
