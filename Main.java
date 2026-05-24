import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Cliente> clientes = new ArrayList<>();
            
            ArrayList<Funcionario> funcionarios = new ArrayList<>();
            
            Estoque estoque = new Estoque();
            
            int opcao;
            
            do {
                
                System.out.println("\n===== PETSHOP =====");
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Cadastrar Funcionário");
                System.out.println("3 - Cadastrar Produto");
                System.out.println("4 - Listar Clientes");
                System.out.println("5 - Listar Funcionários");
                System.out.println("6 - Listar Produtos");
                System.out.println("7 - Remover Produto");
                System.out.println("8 - Buscar Pets por Raça");
                System.out.println("9 - Buscar Todos os Peixes");
                System.out.println("10 - Buscar Cliente");
                System.out.println("11 - Buscar Funcionário");
                System.out.println("12 - Remover Cliente");
                System.out.println("13 - Remover Funcionário");
                System.out.println("14 - Buscar Produto");
                System.out.println("0 - Sair");
                
                opcao = sc.nextInt();
                sc.nextLine();
                
                switch(opcao) {
                    
                    case 1 -> {
                        System.out.print("Nome do cliente: ");
                        String nomeCliente = sc.nextLine();
                        
                        System.out.print("Endereço do cliente: ");
                        String enderecoCliente = sc.nextLine();
                        
                        Cliente cliente = new Cliente(nomeCliente, enderecoCliente);
                        
                        System.out.print("Quantos pets possui? ");
                        int qtdPets = sc.nextInt();
                        sc.nextLine();
                        
                        for(int i = 0; i < qtdPets; i++) {
                            
                            System.out.println("\n1 - Mamífero");
                            System.out.println("2 - Ave");
                            System.out.println("3 - Peixe");
                            
                            int tipoPet = sc.nextInt();
                            sc.nextLine();
                            
                            System.out.print("Nome do pet: ");
                            String nomePet = sc.nextLine();
                            
                            System.out.print("Raça: ");
                            String raca = sc.nextLine();
                            
                            System.out.print("Idade: ");
                            int idade = sc.nextInt();
                            sc.nextLine();
                            
                            switch (tipoPet) {
                                case 1 -> {
                                    System.out.print("Possui pelo? (true/false): ");
                                    boolean pelo = sc.nextBoolean();
                                    sc.nextLine();
                                    Mamifero m = new Mamifero(nomePet, raca, idade, pelo);
                                    cliente.adicionarPet(m);
                                }
                                case 2 -> {
                                    System.out.print("Envergadura da asa: ");
                                    double asa = sc.nextDouble();
                                    sc.nextLine();
                                    Ave a = new Ave(nomePet, raca, idade, asa);
                                    cliente.adicionarPet(a);
                                }
                                case 3 -> {
                                    System.out.print("Tipo da água: ");
                                    String agua = sc.nextLine();
                                    Peixe p = new Peixe(nomePet, raca, idade, agua);
                                    cliente.adicionarPet(p);
                                }
                                default -> {
                                }
                            }
                        }
                        
                        clientes.add(cliente);
                        
                        System.out.println("Cliente cadastrado.");
                    }
                    
                    case 2 -> {
                        System.out.println("1 - Gestor");
                        System.out.println("2 - Veterinário");
                        
                        int tipoFunc = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Nome: ");
                        String nomeFunc = sc.nextLine();
                        
                        System.out.print("Endereço: ");
                        String enderecoFunc = sc.nextLine();
                        
                        System.out.print("Salário: ");
                        double salario = sc.nextDouble();
                        sc.nextLine();
                        
                        if(tipoFunc == 1) {
                            
                            System.out.print("Setor: ");
                            String setor = sc.nextLine();
                            
                            Gestor g = new Gestor(nomeFunc, enderecoFunc, salario, setor);
                            
                            funcionarios.add(g);
                            
                        } else {
                            
                            System.out.print("CRMV: ");
                            String crmv = sc.nextLine();
                            
                            Veterinario v = new Veterinario(nomeFunc, enderecoFunc, salario, crmv);
                            
                            funcionarios.add(v);
                        }
                        
                        System.out.println("Funcionário cadastrado.");
                    }
                    
                    case 3 -> {
                        System.out.print("Nome do produto: ");
                        String nomeProd = sc.nextLine();
                        
                        System.out.print("Valor do produto: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        
                        System.out.print("Descrição: ");
                        String desc = sc.nextLine();
                        
                        Produto produto = new Produto(nomeProd, valor, desc);
                        
                        estoque.adicionarProduto(produto);
                        
                        System.out.println("Produto cadastrado.");
                    }
                    
                    case 4 -> {
                        for(Cliente c : clientes) {
                            
                            System.out.println("\n" + c);
                            
                            c.listarPets();
                        }
                    }
                    
                    case 5 -> {
                        for(Funcionario f : funcionarios) {
                            System.out.println(f);
                        }
                    }
                    
                    case 6 -> estoque.listarProdutos();
                    
                    case 7 -> {
                        System.out.print("Nome do produto para remover: ");
                        String removerProduto = sc.nextLine();
                        
                        estoque.removerProdutos(removerProduto);
                    }
                    
                    case 8 -> {
                        System.out.print("Digite a raça: ");
                        String buscaRaca = sc.nextLine();
                        
                        boolean encontrouRaca = false;
                        
                        for(Cliente c : clientes) {
                            
                            for(Pet p : c.getPets()) {
                                
                                if(p.getRaca().equalsIgnoreCase(buscaRaca)) {
                                    
                                    System.out.println(p);
                                    
                                    encontrouRaca = true;
                                }
                            }
                        }
                        
                        if(!encontrouRaca) {
                            System.out.println("Nenhum pet encontrado.");
                        }
                    }
                    
                    case 9 -> {
                        boolean encontrouPeixe = false;
                        
                        for(Cliente c : clientes) {
                            
                            for(Pet p : c.getPets()) {
                                
                                if(p instanceof Peixe) {
                                    
                                    System.out.println(p);
                                    
                                    encontrouPeixe = true;
                                }
                            }
                        }
                        
                        if(!encontrouPeixe) {
                            System.out.println("Nenhum peixe encontrado.");
                        }
                    }
                    
                    case 10 -> {
                        System.out.print("Digite o nome do cliente: ");
                        String buscaCliente = sc.nextLine();
                        
                        boolean encontrouCliente = false;
                        
                        for(Cliente c : clientes) {
                            
                            if(c.getNome().equalsIgnoreCase(buscaCliente)) {
                                
                                System.out.println(c);
                                
                                c.listarPets();
                                
                                encontrouCliente = true;
                            }
                        }
                        
                        if(!encontrouCliente) {
                            System.out.println("Cliente não encontrado.");
                        }
                    }
                    
                    case 11 -> {
                        System.out.print("Digite o nome do funcionário: ");
                        String buscaFuncionario = sc.nextLine();
                        
                        boolean encontrouFuncionario = false;
                        
                        for(Funcionario f : funcionarios) {
                            
                            if(f.getNome().equalsIgnoreCase(buscaFuncionario)) {
                                
                                System.out.println(f);
                                
                                encontrouFuncionario = true;
                            }
                        }
                        
                        if(!encontrouFuncionario) {
                            System.out.println("Funcionário não encontrado.");
                        }
                    }
                    
                    case 12 -> {
                        System.out.print("Digite o nome do cliente para remover: ");
                        String removerCliente = sc.nextLine();
                        
                        boolean clienteRemovido = false;
                        
                        for(int i = 0; i < clientes.size(); i++) {
                            
                            if(clientes.get(i).getNome().equalsIgnoreCase(removerCliente)) {
                                
                                clientes.remove(i);
                                
                                clienteRemovido = true;
                                
                                System.out.println("Cliente removido.");
                                break;
                            }
                        }
                        
                        if(!clienteRemovido) {
                            System.out.println("Cliente não encontrado.");
                        }
                    }
                    
                    case 13 -> {
                        System.out.print("Digite o nome do funcionário para remover: ");
                        String removerFuncionario = sc.nextLine();
                        
                        boolean funcionarioRemovido = false;
                        
                        for(int i = 0; i < funcionarios.size(); i++) {
                            
                            if(funcionarios.get(i).getNome().equalsIgnoreCase(removerFuncionario)) {
                                
                                funcionarios.remove(i);
                                
                                funcionarioRemovido = true;
                                
                                System.out.println("Funcionário removido.");
                                break;
                            }
                        }
                        
                        if(!funcionarioRemovido) {
                            System.out.println("Funcionário não encontrado.");
                        }
                    }

                    case 14 -> {
                        System.out.print("Digite o nome do produto que deseja buscar: ");
                        String buscaProduto = sc.nextLine();
                        
                        boolean encontrouProduto = false;

                        for(Produto p : estoque.getProdutos()) {
                            
                            if(p.getNome().equalsIgnoreCase(buscaProduto)) {

                                System.out.println(p);

                                encontrouProduto = true;
                            }
                        }

                        if(!encontrouProduto) {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    
                    case 0 -> System.out.println("Sistema encerrado.");
                    
                    default -> System.out.println("Opção inválida.");
                }
                
            } while(opcao != 0);
        }
    }
}