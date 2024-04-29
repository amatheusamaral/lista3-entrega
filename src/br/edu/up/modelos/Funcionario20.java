package br.edu.up.modelos;

public class Funcionario20 {
    private double salarioMinimo;
    private int horasTrabalhadas;

    public Funcionario20(double salarioMinimo, int horasTrabalhadas) {
        this.salarioMinimo = salarioMinimo;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularValorHora() {
        return salarioMinimo / 8;
    }

    public double calcularSalarioBruto() {
        return horasTrabalhadas * calcularValorHora();
    }

    public double calcularDescontoINSS() {
        double salarioBruto = calcularSalarioBruto();
        if (salarioBruto <= 250) {
            return 0;
        } else if (salarioBruto <= 500) {
            return salarioBruto * 0.05;
        } else if (salarioBruto <= 1200) {
            return salarioBruto * 0.1;
        } else {
            return salarioBruto * 0.15;
        }
    }

    public double calcularSalarioLiquido() {
        return calcularSalarioBruto() - calcularDescontoINSS();
    }
}
