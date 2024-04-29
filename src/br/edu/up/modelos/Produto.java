package br.edu.up.modelos;

public class Produto {
    private double precoCusto;
    private double percentualAcrescimo;

    public Produto(double precoCusto, double percentualAcrescimo) {
        this.precoCusto = precoCusto;
        this.percentualAcrescimo = percentualAcrescimo;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPercentualAcrescimo() {
        return percentualAcrescimo;
    }

    public void setPercentualAcrescimo(double percentualAcrescimo) {
        this.percentualAcrescimo = percentualAcrescimo;
    }

    public double calcularValorVenda() {
        return precoCusto * (1 + percentualAcrescimo / 100);
    }
}
