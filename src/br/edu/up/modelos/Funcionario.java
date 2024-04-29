package br.edu.up.modelos;

public class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularReajuste(double salarioMinimo) {
        double reajuste;
        if (salario < 3 * salarioMinimo) {
            reajuste = salario * 0.50;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            reajuste = salario * 0.20;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            reajuste = salario * 0.15;
        } else {
            reajuste = salario * 0.10;
        }
        return reajuste;
    }

    public double calcularNovoSalario(double salarioMinimo) {
        return salario + calcularReajuste(salarioMinimo);
    }
}
