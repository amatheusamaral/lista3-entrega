package br.edu.up.modelos;

public class Carro {
    private double custoFabrica;

    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double custoDistribuidor = custoFabrica * 0.28;
        double impostos = custoFabrica * 0.45;
        return custoFabrica + custoDistribuidor + impostos;
    }
}
