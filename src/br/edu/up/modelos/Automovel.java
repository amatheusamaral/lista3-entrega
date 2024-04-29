package br.edu.up.modelos;

public class Automovel {
    private double distanciaTotalPercorrida;
    private double combustivelGasto;

    public Automovel(double distanciaTotalPercorrida, double combustivelGasto) {
        this.distanciaTotalPercorrida = distanciaTotalPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    public double getDistanciaTotalPercorrida() {
        return distanciaTotalPercorrida;
    }

    public void setDistanciaTotalPercorrida(double distanciaTotalPercorrida) {
        this.distanciaTotalPercorrida = distanciaTotalPercorrida;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    public double calcularConsumoMedio() {
        return distanciaTotalPercorrida / combustivelGasto;
    }
}
