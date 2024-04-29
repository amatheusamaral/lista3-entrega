package br.edu.up.modelos;

public class Poupanca {
    private double depositoInicial;
    private double taxaJuros;

    public Poupanca(double depositoInicial, double taxaJuros) {
        this.depositoInicial = depositoInicial;
        this.taxaJuros = taxaJuros;
    }

    public double calcularSaldoFinal(int meses) {
        double rendimentoMensal = depositoInicial * (taxaJuros / 100);
        return depositoInicial + meses * rendimentoMensal;
    }
}
