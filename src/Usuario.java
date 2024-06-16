Usuario

public abstract class Usuario {
    protected int id; // Declaração do atributo 'id', acessível nas subclasses
    protected String nome; // Declaração do atributo 'nome', acessível nas subclasses

    public Usuario() {} // Construtor padrão

    public Usuario(int id, String nome) { // Construtor com parâmetros
        this.id = id;
        this.nome = nome;
    }

    public int getId() { // Método getter para 'id'
        return id;
    }

    public void setId(int id) { // Método setter para 'id'
        this.id = id;
    }

    public String getNome() { // Método getter para 'nome'
        return nome;
    }

    public void setNome(String nome) { // Método setter para 'nome'
        this.nome = nome;
    }

    public abstract void exibirDetalhes(); // Método abstrato a ser implementado pelas subclasses
}
