package br.edu.up.modelos;

public class ConversorDolar {
    private double cotacaoDolar;
    private double quantidadeDolares;

    public ConversorDolar(double cotacaoDolar, double quantidadeDolares) {
        this.cotacaoDolar = cotacaoDolar;
        this.quantidadeDolares = quantidadeDolares;
    }

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double getQuantidadeDolares() {
        return quantidadeDolares;
    }

    public void setQuantidadeDolares(double quantidadeDolares) {
        this.quantidadeDolares = quantidadeDolares;
    }

    public double calcularValorEmReais() {
        return cotacaoDolar * quantidadeDolares;
    }
}
