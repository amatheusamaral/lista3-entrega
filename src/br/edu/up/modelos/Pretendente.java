package br.edu.up.modelos;

public class Pretendente {
    private String nome;
    private int idade;
    private int grupoRisco;

    public Pretendente(String nome, int idade, int grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getGrupoRisco() {
        return grupoRisco;
    }

    public void setGrupoRisco(int grupoRisco) {
        this.grupoRisco = grupoRisco;
    }

    public int calcularCategoria() {
        int categoria;
        if (idade < 17 || idade > 70) {
            categoria = -1; 
        } else if (idade >= 17 && idade <= 20) {
            categoria = grupoRisco;
        } else if (idade >= 21 && idade <= 24) {
            categoria = grupoRisco + 1;
        } else if (idade >= 25 && idade <= 34) {
            categoria = grupoRisco + 2;
        } else if (idade >= 35 && idade <= 64) {
            categoria = grupoRisco + 3;
        } else {
            categoria = grupoRisco + 6;
        }
        return categoria;
    }
}
