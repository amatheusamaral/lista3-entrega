package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Intervalonumerico;

public class Exercicio9 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        Intervalonumerico intervalo = new Intervalonumerico(10, 150);
        int numerosNoIntervalo = 0;
        
        for (int i = 0; i < 80; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();
            if (intervalo.verificarNumeroNoIntervalo(numero)) {
                numerosNoIntervalo++;
            }
        }
        
        System.out.println("Quantidade de números no intervalo [10, 150]: " + numerosNoIntervalo);
        scanner.close();

    }

}
