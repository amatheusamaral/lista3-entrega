package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Veiculo15;

public class Exercicio15 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        char opcao = 'S'; 

        double totalDesconto = 0;
        double totalPago = 0;

        do {
            try {
                System.out.print("Digite o valor do veículo (0 para encerrar): ");
                double valorVeiculo = scanner.nextDouble();
                scanner.nextLine(); 

                if (valorVeiculo == 0) {
                    break;
                }

                System.out.print("Digite o tipo de combustível (Álcool/A/Gasolina/G/Diesel/D): ");
                char tipoCombustivel = scanner.nextLine().toUpperCase().charAt(0);

                Veiculo15 veiculo = new Veiculo15(valorVeiculo, tipoCombustivel);

                double desconto = veiculo.calcularDesconto();
                double valorPago = veiculo.calcularValorPago();

                totalDesconto += desconto;
                totalPago += valorPago;

                System.out.println("Desconto: R$" + String.format("%.2f", desconto));
                System.out.println("Valor a ser pago pelo cliente: R$" + String.format("%.2f", valorPago));

                boolean opcaoValida = false;
                while (!opcaoValida) {
                    System.out.print("Deseja continuar? (S/N): ");
                    opcao = scanner.nextLine().toUpperCase().charAt(0);
                    if (opcao == 'S' || opcao == 'N') {
                        opcaoValida = true;
                    } else {
                        System.out.println("Opção inválida. Digite S para Sim ou N para Não.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico válido.");
                opcao = 'S'; 
            }
        } while (opcao == 'S');

        System.out.println("Total de desconto: R$" + String.format("%.2f", totalDesconto));
        System.out.println("Total pago pelos clientes: R$" + String.format("%.2f", totalPago));

        scanner.close();
    }
}
