import java.util.ArrayList;

public class Cliente {
    
    private String nome;
    private String endereco;
    private ArrayList<Pet> pets;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

        pets = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void adicionarPet(Pet pet){
        pets.add(pet);
    }

    public void listarPets() {

        System.out.println("\nPets de " + nome + ":");

        for (Pet p : pets) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " | Endereco: " + endereco;
    }
}
