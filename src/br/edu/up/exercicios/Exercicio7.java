package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Carro;

public class Exercicio7 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        
        Carro carro = new Carro(custoFabrica);
        
        double custoConsumidor = carro.calcularCustoConsumidor();
        
        System.out.println("Custo ao Consumidor: " + custoConsumidor);
        scanner.close();

    }

}
