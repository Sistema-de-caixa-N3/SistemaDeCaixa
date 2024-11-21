import com.padaria.model.Cliente;
import com.padaria.model.ItemDaVenda;
import com.padaria.model.Produto;
import com.padaria.model.Venda;
import com.padaria.service.ProdutoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProdutoService produtoService = new ProdutoService();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        Venda venda = new Venda(cliente);

        while (true) {
            System.out.println("\nProdutos disponíveis:");
            for (Produto produto : produtoService.listarProdutos()) {
                System.out.println(produto.getCodigo() + " - " + produto.getNome() + " - R$ " + produto.getPreco());
            }

            System.out.print("Digite o código ou nome do produto para adicionar ou 'finalizar' para terminar: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("finalizar")) {
                break;
            }

            Produto produto = produtoService.buscarProdutoPorNome(entrada);
            if (produto == null) {
                produto = produtoService.buscarProdutoPorCodigo(entrada);
            }

            if (produto != null) {
                System.out.print("Digite a quantidade do produto: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();
                
                ItemDaVenda item = new ItemDaVenda(produto, quantidade);
                venda.adicionarItem(item);
            } else {
                System.out.println("Produto não encontrado, tente novamente.");
            }
        }


        venda.exibirVenda();
    }
}
