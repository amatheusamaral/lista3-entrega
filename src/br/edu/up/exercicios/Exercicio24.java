package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.VeiculoExercicio24;

public class Exercicio24 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço de fábrica do veículo: ");
        double precoFabrica = scanner.nextDouble();
        
        VeiculoExercicio24 veiculo = new VeiculoExercicio24(precoFabrica);

        double precoFinal = veiculo.calcularPrecoFinal();
        
        System.out.println("Preço final do veículo: " + precoFinal);
        scanner.close();

    }
}
