package br.edu.up.modelos;

public class Funcionario23 {
    private double salarioAtual;
    private int tempoServico;

    public Funcionario23(double salarioAtual, int tempoServico) {
        this.salarioAtual = salarioAtual;
        this.tempoServico = tempoServico;
    }

    public double calcularAumento() {
        if (tempoServico >= 15) {
            return salarioAtual * 0.20;
        } else if (tempoServico >= 10) {
            return salarioAtual * 0.15;
        } else if (tempoServico >= 5) {
            return salarioAtual * 0.10;
        } else {
            return salarioAtual * 0.05;
        }
    }

    public double calcularNovoSalario() {
        return salarioAtual + calcularAumento();
    }
}
