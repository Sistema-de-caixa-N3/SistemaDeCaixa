package com.padaria.model;

public class ItemDaVenda {

    private Produto produto;
    private int quantidade;


    public ItemDaVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return produto.getNome() + " x" + quantidade + " - R$ " + calcularTotal();
    }
}
