public class Produto {
    
    private String nome;
    private double valor;
    private String descricao;

    public Produto(String nome, double valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto: " + nome +
                " | Valor: R$" + valor +
                " | Descrição: " + descricao;
    }
}
