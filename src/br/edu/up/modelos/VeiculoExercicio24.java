package br.edu.up.modelos;

public class VeiculoExercicio24 {
    private double precoFabrica;

    public VeiculoExercicio24(double precoFabrica) {
        this.precoFabrica = precoFabrica;
    }

    public double calcularPrecoFinal() {
        double lucroDistribuidor = precoFabrica * 0.28;
        double impostos = precoFabrica * 0.45;
        return precoFabrica + lucroDistribuidor + impostos;
    }
}
