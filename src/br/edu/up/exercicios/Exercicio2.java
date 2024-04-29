package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Automovel;

public class Exercicio2 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância total percorrida pelo automóvel: ");
        double distanciaTotal = scanner.nextDouble();
        
        System.out.print("Digite o total de combustível gasto: ");
        double combustivelGasto = scanner.nextDouble();
        
        Automovel automovel = new Automovel(distanciaTotal, combustivelGasto);
        
        double consumoMedio = automovel.calcularConsumoMedio();
        
        System.out.println("Consumo médio do automóvel: " + consumoMedio);
        scanner.close();

    }
}
