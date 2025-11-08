import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Sistema de Gestão de Mercadorias ===");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Remover produto");
            System.out.println("4. Atualizar produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            // Validação de opção
            while (!sc.hasNextInt()) {
                System.out.println("Digite um número válido!");
                sc.next(); // descarta entrada inválida
            }
            opcao = sc.nextInt();
            sc.nextLine(); // consumir \n restante

            switch (opcao) {
                case 1: // Adicionar produto
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço do produto: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Digite um valor válido para o preço!");
                        sc.next();
                    }
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Digite um número válido para a quantidade!");
                        sc.next();
                    }
                    int quantidade = sc.nextInt();
                    sc.nextLine(); // consumir \n

                    empresa.AdicionarProduto(new Produto(nome, preco, quantidade));
                    break;

                case 2: // Listar produtos
                    empresa.ListarProduto();
                    break;

                case 3: // Remover produto
                    System.out.print("Nome do produto a remover: ");
                    nome = sc.nextLine();
                    empresa.RemoverProduto(nome);
                    break;

                case 4: // Atualizar produto
                    System.out.print("Nome do produto a atualizar: ");
                    nome = sc.nextLine();

                    System.out.print("Novo preço: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Digite um valor válido para o preço!");
                        sc.next();
                    }
                    preco = sc.nextDouble();

                    System.out.print("Nova quantidade: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Digite um número válido para a quantidade!");
                        sc.next();
                    }
                    quantidade = sc.nextInt();
                    sc.nextLine(); // consumir \n

                    empresa.AtualizarProduto(nome, preco, quantidade);
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
