package br.edu.up.modelos;

public class Funcionario22 {
    private double salarioAtual;
    private int tempoServico;

    public Funcionario22(double salarioAtual, int tempoServico) {
        this.salarioAtual = salarioAtual;
        this.tempoServico = tempoServico;
    }

    public double calcularAumento() {
        if (tempoServico >= 5) {
            return salarioAtual * 0.20;
        } else if (tempoServico >= 3) {
            return salarioAtual * 0.15;
        } else if (tempoServico >= 1) {
            return salarioAtual * 0.10;
        } else {
            return salarioAtual * 0.05;
        }
    }

    public double calcularNovoSalario() {
        return salarioAtual + calcularAumento();
    }
}
