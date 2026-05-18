public class Veterinario extends Funcionario {
    
    private String crmv;

    public Veterinario(String nome, String endereco, double salario, String crmv) {
        super(nome, endereco, salario);
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    @Override
    public String toString() {
        return "[Veterinário] " + super.toString() +
                " | CMRV: " + crmv;
    }
}
