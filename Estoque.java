import java.util.ArrayList;

public class Estoque {
    
    private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void listarProdutos() {

        for(Produto p : produtos) {
            System.out.println(p);
        }
    }

    public void removerProdutos(String nome) {

        for (int i = 0; i < produtos.size(); i++) {

            if(produtos.get(i).getNome().equalsIgnoreCase(nome)) {

                produtos.remove(i);

                System.out.println("Produto removido. ");
                return;
            }
        }
    }
}
