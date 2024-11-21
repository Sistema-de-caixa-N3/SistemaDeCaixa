package com.padaria.model;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Cliente cliente;
    private List<ItemDaVenda> itensDaVenda;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itensDaVenda = new ArrayList<>();
    }

    public void adicionarItem(ItemDaVenda item) {
        itensDaVenda.add(item);
    }


    public double calcularTotalVenda() {
        double total = 0.0;
        for (ItemDaVenda item : itensDaVenda) {
            total += item.calcularTotal();
        }
        return total;
    }

    public void exibirVenda() {
        System.out.println("\nResumo da Venda para " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
        for (ItemDaVenda item : itensDaVenda) {
            System.out.println(item);
        }
        System.out.println("Total da venda: R$ " + calcularTotalVenda());
    }
}
