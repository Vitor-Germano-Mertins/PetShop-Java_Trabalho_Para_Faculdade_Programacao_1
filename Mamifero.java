public class Mamifero extends Pet {
    
    private boolean pelo;

    public Mamifero(String nome, String raca, int idade, boolean pelo) {
        super(nome, raca, idade);
        this.pelo = pelo;
    }

    @Override
    public String toString() {
        return "[Mamifero] " + super.toString() +
                " | Possui pelo: " + pelo;
    }
}
