Livro

public class Livro {
    private int id; // Declaração do atributo 'id'
    private String titulo; // Declaração do atributo 'titulo'
    private String autor; // Declaração do atributo 'autor'

    public Livro() {} // Construtor padrão

    public Livro(int id, String titulo, String autor) { // Construtor com parâmetros
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() { // Método getter para 'id'
        return id;
    }

    public void setId(int id) { // Método setter para 'id'
        this.id = id;
    }

    public String getTitulo() { // Método getter para 'titulo'
        return titulo;
    }

    public void setTitulo(String titulo) { // Método setter para 'titulo'
        this.titulo = titulo;
    }

    public String getAutor() { // Método getter para 'autor'
        return autor;
    }

    public void setAutor(String autor) { // Método setter para 'autor'
        this.autor = autor;
    }

    public void exibirDetalhes() { // Método para exibir os detalhes do livro
        System.out.println("ID: " + id + ", Título: " + titulo + ", Autor: " + autor);
    }
}
