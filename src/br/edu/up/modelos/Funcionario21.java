package br.edu.up.modelos;

public class Funcionario21 {
    private int horasTrabalhadas;
    private double salarioMinimo;

    public Funcionario21(int horasTrabalhadas, double salarioMinimo) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularValorHora() {
        return salarioMinimo / 8;
    }

    public double calcularSalarioBruto() {
        return horasTrabalhadas * calcularValorHora();
    }

    public double calcularImpostoRenda() {
        double salarioBruto = calcularSalarioBruto();
        if (salarioBruto <= 300) {
            return 0;
        } else if (salarioBruto <= 600) {
            return salarioBruto * 0.05;
        } else {
            return salarioBruto * 0.10;
        }
    }

    public double calcularDescontoINSS() {
        return calcularSalarioBruto() * 0.10;
    }

    public double calcularSalarioLiquido() {
        return calcularSalarioBruto() - calcularImpostoRenda() - calcularDescontoINSS();
    }
}
