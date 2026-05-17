public class Pet {

    protected String nome;
    protected String raca;
    protected int idade;

    public Pet(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " | Raça: " + raca +
                " | Idade: " + idade;
    }
}