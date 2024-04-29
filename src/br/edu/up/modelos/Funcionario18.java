package br.edu.up.modelos;

public class Funcionario18 {
    private String nome;
    private char sexo;
    private int idade;
    private double salarioFixo;

    public Funcionario18(String nome, char sexo, int idade, double salarioFixo) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.salarioFixo = salarioFixo;
    }

    public double calcularAbono() {
        if (sexo == 'M') {
            if (idade >= 30) {
                return 100.00;
            } else {
                return 50.00;
            }
        } else { 
            if (idade >= 30) {
                return 200.00;
            } else {
                return 80.00;
            }
        }
    }

    public double calcularSalarioLiquido() {
        return salarioFixo + calcularAbono();
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Sexo: " + sexo + ", Idade: " + idade + ", Salário Fixo: " + salarioFixo;
    }
}
