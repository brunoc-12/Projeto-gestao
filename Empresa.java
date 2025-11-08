import java.util.ArrayList;


public class Empresa{
private ArrayList<Produto> produtos;


public Empresa() {
    produtos = new ArrayList<>();
}

public void AdicionarProduto(Produto produto) {
    produtos.add(produto);
    System.out.println(" Produto adicionado com sucesso");
}
    public void ListarProduto() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\n=== Lista de Produtos ===");
            for (Produto p : produtos) {
                System.out.println("Nome: " + p.getNome());
                System.out.println("Preço: R$ " + p.getPreco());
                System.out.println("Quantidade: " + p.getQuantidade());
                System.out.println("---------------------------");
            }
        }
    }
public void RemoverProduto(String nome) {
    boolean remover = produtos.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    if (remover) {
        System.out.println("Produto removido com sucesso!");
    } else {
        System.out.println("Produto não encontrado");
    }


}
    
   public void AtualizarProduto(String nome, double preco, int quantidade) {
    for (Produto p : produtos) {
        if (p.getNome().equalsIgnoreCase(nome)) {
            p.setPreco(preco);
            p.setQuantidade(quantidade);
            System.out.println("Produto atualizado com sucesso");
            return;
        }
    }
    System.out.println("Produto não encontrado");
}
}


