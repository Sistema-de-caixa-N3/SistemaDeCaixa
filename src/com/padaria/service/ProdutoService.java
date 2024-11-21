package com.padaria.service;

import com.padaria.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private List<Produto> produtos;

    public ProdutoService() {
        this.produtos = new ArrayList<>();

        produtos.add(new Produto("Pão Francês", 0.50, "001"));
        produtos.add(new Produto("Bolo de Chocolate", 15.00, "002"));
        produtos.add(new Produto("Coxinha", 4.00, "003"));
        produtos.add(new Produto("Pão de Queijo", 2.50, "004"));
        produtos.add(new Produto("Café", 5.00, "005"));
        produtos.add(new Produto("Misto-Quente", 7.00, "006"));
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public Produto buscarProdutoPorCodigo(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equalsIgnoreCase(codigo)) {
                return produto;
            }
        }
        return null;
    }
}
