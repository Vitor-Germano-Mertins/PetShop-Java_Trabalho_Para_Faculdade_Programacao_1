public class Ave extends Pet {
    
    private double envergaduraAsa;

    public Ave(String nome, String raca, int idade, double envergaduraAsa) {
        super(nome, raca, idade);
        this.envergaduraAsa = envergaduraAsa;
    }

    @Override
    public String toString() {
        return "[Ave] " + super.toString() +
                " | Envergadura da Asa: " + envergaduraAsa;
    }
}
