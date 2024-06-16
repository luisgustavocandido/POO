Funcionario

public class Funcionario extends Usuario {
    private String cargo; // Declaração do atributo 'cargo', específico de Funcionario

    public Funcionario() {} // Construtor padrão

    public Funcionario(int id, String nome, String cargo) { // Construtor com parâmetros
        super(id, nome); // Chamada ao construtor da classe pai (Usuario)
        this.cargo = cargo;
    }

    public String getCargo() { // Método getter para 'cargo'
        return cargo;
    }

    public void setCargo(String cargo) { // Método setter para 'cargo'
        this.cargo = cargo;
    }

    @Override
    public void exibirDetalhes() { // Sobrescrita do método abstrato 'exibirDetalhes'
        System.out.println("ID: " + id + ", Nome: " + nome + ", Cargo: " + cargo);
    }
}
