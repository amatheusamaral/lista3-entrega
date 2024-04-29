package br.edu.up.modelos;

public class Carro12 {
    private int ano;
    private double valor;

    public Carro12(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularDesconto() {
        return (ano <= 2000) ? (valor * 0.12) : (valor * 0.07);
    }

    public double calcularValorPago() {
        return valor - calcularDesconto();
    }
}
