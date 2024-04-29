package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Vendedor;

public class Exercicio3 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();
        
        System.out.print("Salário do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Total de vendas efetuadas pelo vendedor (em dinheiro): ");
        double totalVendas = scanner.nextDouble();
        
        Vendedor vendedor = new Vendedor(nomeVendedor, salarioFixo, totalVendas);
        
        double salarioFinal = vendedor.calcularSalarioFinal();
        
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Salário Fixo: " + vendedor.getSalarioFixo());
        System.out.println("Salário Final: " + salarioFinal);
        scanner.close();

    }
}
