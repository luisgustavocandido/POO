Biblioteca

import java.util.ArrayList; // Importa a classe ArrayList
import java.util.List; // Importa a interface List

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>(); // Declara e inicializa uma lista de livros
    private List<Usuario> usuarios = new ArrayList<>(); // Declara e inicializa uma lista de usuários

    public void adicionarLivro(Livro livro) { // Método para adicionar um livro à lista
        livros.add(livro);
    }

    public void listarLivros() { // Método para listar todos os livros
        for (Livro livro : livros) {
            livro.exibirDetalhes();
        }
    }

    public Livro buscarLivroPorId(int id) { // Método para buscar um livro por ID
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null; // Retorna null se não encontrar o livro
    }

    public void removerLivro(int id) { // Método para remover um livro por ID
        Livro livro = buscarLivroPorId(id);
        if (livro != null) {
            livros.remove(livro);
        }
    }

    public void editarLivro(int id, String novoTitulo, String novoAutor) { // Método para editar um livro
        Livro livro = buscarLivroPorId(id);
        if (livro != null) {
            livro.setTitulo(novoTitulo);
            livro.setAutor(novoAutor);
        }
    }

    public void adicionarUsuario(Usuario usuario) { // Método para adicionar um usuário à lista
        usuarios.add(usuario);
    }

    public void listarUsuarios() { // Método para listar todos os usuários
        for (Usuario usuario : usuarios) {
            usuario.exibirDetalhes();
        }
    }

    public Usuario buscarUsuarioPorId(int id) { // Método para buscar um usuário por ID
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null; // Retorna null se não encontrar o usuário
    }

    public void removerUsuario(int id) { // Método para remover um usuário por ID
        Usuario usuario = buscarUsuarioPorId(id);
        if (usuario != null) {
            usuarios.remove(usuario);
        }
    }

    public void editarUsuario(int id, String novoNome) { // Método para editar um usuário
        Usuario usuario = buscarUsuarioPorId(id);
        if (usuario != null) {
            usuario.setNome(novoNome);
        }
    }
}
