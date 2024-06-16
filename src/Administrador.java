Administrador

public class Administrador extends Funcionario {
    private String nivelAcesso; // Declaração do atributo 'nivelAcesso', específico de Administrador

    public Administrador() {} // Construtor padrão

    public Administrador(int id, String nome, String cargo, String nivelAcesso) { // Construtor com parâmetros
        super(id, nome, cargo); // Chamada ao construtor da classe pai (Funcionario)
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso() { // Método getter para 'nivelAcesso'
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) { // Método setter para 'nivelAcesso'
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public void exibirDetalhes() { // Sobrescrita do método 'exibirDetalhes'
        System.out.println("ID: " + getId() + ", Nome: " + getNome() + ", Cargo: " + getCargo() + ", Nível de Acesso: " + nivelAcesso);
    }
}
