public class Funcionario {
    
    protected String nome;
    protected String endereco;
    protected double salario;

    public Funcionario(String nome, String endereco, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " | Endereço: " + endereco +
                " | Salário: R$" + salario;
    }
}
