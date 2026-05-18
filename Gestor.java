public class Gestor extends Funcionario {
    
    private String setor;

    public Gestor(String nome, String endereco, double salario, String setor) {
        super(nome, endereco, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "[Gestor] " + super.toString() +
                " | Setor:: " + setor;
    }
}
