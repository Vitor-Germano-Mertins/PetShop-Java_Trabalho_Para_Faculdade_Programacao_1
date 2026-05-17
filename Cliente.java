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
