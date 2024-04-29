package br.edu.up.modelos;

public class Pessoa13 {
    private String nome;
    private char sexo;
    private int idade;
    private boolean apto;

    public Pessoa13(String nome, char sexo, int idade, boolean apto) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.apto = apto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }
}
