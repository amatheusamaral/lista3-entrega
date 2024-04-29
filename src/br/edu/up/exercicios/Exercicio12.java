package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Carro12;

public class Exercicio12 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int totalCarrosAte2000 = 0;
        int totalCarrosGeral = 0;
        
        char opcao;
        do {
            System.out.print("Digite o ano do carro: ");
            int anoCarro = scanner.nextInt();
            
            System.out.print("Digite o valor do carro: ");
            double valorCarro = scanner.nextDouble();
            
            Carro12 carro = new Carro12(anoCarro, valorCarro);
            
            double desconto = carro.calcularDesconto();
            double valorPago = carro.calcularValorPago();
            
            if (anoCarro <= 2000) {
                totalCarrosAte2000++;
            }
            totalCarrosGeral++;
            
            System.out.println("Desconto: " + desconto);
            System.out.println("Valor a ser pago pelo cliente: " + valorPago);
            
            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            opcao = scanner.next().toUpperCase().charAt(0);
        } while (opcao == 'S');
        
        System.out.println("Total de carros até 2000: " + totalCarrosAte2000);
        System.out.println("Total Geral: " + totalCarrosGeral);
        scanner.close();

    }

}
