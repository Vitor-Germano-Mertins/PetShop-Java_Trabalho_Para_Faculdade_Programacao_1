public class Peixe extends Pet {
    
    private String tipoAgua;

    public Peixe(String nome, String raca, int idade, String tipoAgua) {
        super(nome, raca, idade);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public String toString() {
        return "[Peixe} " + super.toString() +
                "| Tipo de água: " + tipoAgua;
    }
}
