package br.edu.up.modelos;

public class Intervalonumerico {
    private int limiteInferior;
    private int limiteSuperior;

    public Intervalonumerico(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public boolean verificarNumeroNoIntervalo(int numero) {
        return numero >= limiteInferior && numero <= limiteSuperior;
    }
}
