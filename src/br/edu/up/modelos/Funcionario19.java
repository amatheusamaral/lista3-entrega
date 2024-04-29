package br.edu.up.modelos;

public class Funcionario19 {
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario19(int horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double calcularSalarioBruto() {
        return horasTrabalhadas * valorHora;
    }

    public double calcularDescontoINSS() {
        double salarioBruto = calcularSalarioBruto();
        if (salarioBruto <= 2000) {
            return salarioBruto * 0.1;
        } else if (salarioBruto > 2000 && salarioBruto <= 3000) {
            return salarioBruto * 0.15;
        } else {
            return salarioBruto * 0.2;
        }
    }

    public double calcularSalarioLiquido() {
        return calcularSalarioBruto() - calcularDescontoINSS();
    }
}
