package br.edu.up.modelos;

public class CompraParcelada {
    private double valorCompra;

    public CompraParcelada(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double calcularValorPrestacoes(int numParcelas) {
        return valorCompra / numParcelas;
    }
}
