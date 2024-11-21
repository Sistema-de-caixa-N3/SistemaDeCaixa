package com.padaria.model;

public class Produto {

    private String nome;
    private double preco;
    private String codigo;

    public Produto(String nome, double preco, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}
