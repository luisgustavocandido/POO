SistemaGerenciamento

import java.util.Scanner; // Importa a classe Scanner

public class SistemaGerenciamento {
    private static Biblioteca biblioteca = new Biblioteca(); // Inicializa um objeto Biblioteca
    private static Scanner scanner = new Scanner(System.in); // Inicializa um objeto Scanner para entrada de dados

    public static void main(String[] args) {
        int opcao = 0; // Declara uma variável para armazenar a opção do menu

        do {
            exibirMenu(); // Chama o método para exibir o menu
            opcao = scanner.nextInt(); // Lê a opção do usuário
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    cadastrarLivro(); // Chama o método para cadastrar um livro
                    break;
                case 2:
                    listarLivros(); // Chama o método para listar todos os livros
                    break;
                case 3:
                    visualizarLivro(); // Chama o método para visualizar um livro específico
                    break;
                case 4:
                    excluirLivro(); // Chama o método para excluir um livro
                    break;
                case 5:
                    editarLivro(); // Chama o método para editar um livro
                    break;
                case 6:
                    cadastrarUsuario(); // Chama o método para cadastrar um usuário
                    break;
                case 7:
                    listarUsuarios(); // Chama o método para listar todos os usuários
                    break;
                case 8:
                    visualizarUsuario(); // Chama o método para visualizar um usuário específico
                    break;
                case 9:
                    excluirUsuario(); // Chama o método para excluir um usuário
                    break;
                case 10:
                    editarUsuario(); // Chama o método para editar um usuário
                    break;
                case 0:
                    System.out.println("Saindo..."); // Mensagem de saída
                    break;
                default:
                    System.out.println("Opção inválida!"); // Mensagem para opção inválida
                    break;
            }
        } while (opcao != 0); // Continua exibindo o menu até o usuário escolher sair
    }

    private static void exibirMenu() { // Método para exibir o menu
        System.out.println("Menu:");
        System.out.println("1. Cadastrar Livro");
        System.out.println("2. Listar Livros");
        System.out.println("3. Visualizar Livro");
        System.out.println("4. Excluir Livro");
        System.out.println("5. Editar Livro");
        System.out.println("6. Cadastrar Usuario");
        System.out.println("7. Listar Usuarios");
        System.out.println("8. Visualizar Usuario");
        System.out.println("9. Excluir Usuario");
        System.out.println("10. Editar Usuario");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarLivro() {
        System.out.print("ID do livro: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        System.out.print("Título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor do livro: ");
        String autor = scanner.nextLine();

        Livro livro = new Livro(id, titulo, autor);
        biblioteca.adicionarLivro(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void listarLivros() {
        biblioteca.listarLivros();
    }

    private static void visualizarLivro() {
        System.out.print("ID do livro: ");
        int id = scanner.nextInt();

        Livro livro = biblioteca.buscarLivroPorId(id);
        if (livro != null) {
            livro.exibirDetalhes();
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    private static void excluirLivro() {
        System.out.print("ID do livro: ");
        int id = scanner.nextInt();

        biblioteca.removerLivro(id);
        System.out.println("Livro removido com sucesso!");
    }

    private static void editarLivro() {
        System.out.print("ID do livro: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        System.out.print("Novo título do livro: ");
        String novoTitulo = scanner.nextLine();

        System.out.print("Novo autor do livro: ");
        String novoAutor = scanner.nextLine();

        biblioteca.editarLivro(id, novoTitulo, novoAutor);
        System.out.println("Livro editado com sucesso!");
    }

    private static void cadastrarUsuario() {
        System.out.print("ID do usuário: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        System.out.print("Nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Cargo do funcionário: ");
        String cargo = scanner.nextLine();

        Usuario usuario = new Funcionario(id, nome, cargo);
        biblioteca.adicionarUsuario(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void listarUsuarios() {
        biblioteca.listarUsuarios();
    }

    private static void visualizarUsuario() {
        System.out.print("ID do usuário: ");
        int id = scanner.nextInt();

        Usuario usuario = biblioteca.buscarUsuarioPorId(id);
        if (usuario != null) {
            usuario.exibirDetalhes();
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }

    private static void excluirUsuario() {
        System.out.print("ID do usuário: ");
        int id = scanner.nextInt();

        biblioteca.removerUsuario(id);
        System.out.println("Usuário removido com sucesso!");
    }

    private static void editarUsuario() {
        System.out.print("ID do usuário: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        System.out.print("Novo nome do usuário: ");
        String novoNome = scanner.nextLine();

        biblioteca.editarUsuario(id, novoNome);
        System.out.println("Usuário editado com sucesso!");
    }
}
