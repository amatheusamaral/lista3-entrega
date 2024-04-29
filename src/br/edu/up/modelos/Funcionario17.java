package br.edu.up.modelos;

public class Funcionario17 {
    private String nome;
    private double salarioAtual;

    public Funcionario17(String nome, double salarioAtual) {
        this.nome = nome;
        this.salarioAtual = salarioAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double calcularNovoSalario() {
        return salarioAtual * 1.10;
    }

    public double calcularAumentoFolha() {
        return calcularNovoSalario() - salarioAtual;
    }

    public double calcularAumentoTotalFolha(int numeroFuncionarios) {
        return calcularAumentoFolha() * numeroFuncionarios;
    }
}
