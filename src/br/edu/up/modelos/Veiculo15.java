package br.edu.up.modelos;

public class Veiculo15 {
    private double valor;
    private char tipoCombustivel;

    public Veiculo15(double valor, char tipoCombustivel) {
        this.valor = valor;
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(char tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double calcularDesconto() {
        double desconto = 0;
        switch (tipoCombustivel) {
            case 'A':
                desconto = valor * 0.25;
                break;
            case 'G':
                desconto = valor * 0.21;
                break;
            case 'D':
                desconto = valor * 0.14;
                break;
        }
        return desconto;
    }

    public double calcularValorPago() {
        return valor - calcularDesconto();
    }
}
