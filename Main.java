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
                
                System.out.println("\n====PETSHOP====");
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Cadastrar Funcionario");
                System.out.println("3 - Cadastrar Produto");
                System.out.println("4 - Listas Clientes");
                System.out.println("5 - Listar Funcionarios");
                System.out.println("6 - Listar Produtos");
                System.out.println("7 - Remover Produto");
                System.out.println("0 - Sair");
                
                opcao = sc.nextInt();
                sc.nextLine();
                
                switch(opcao) {
                    
                    case 1 -> {
                        System.out.println("Nome do cliente: ");
                        String nomeCliente = sc.nextLine();
                        
                        System.out.println("Endereço do cliente: ");
                        String enderecoCliente = sc.nextLine();
                        
                        Cliente cliente = new Cliente(nomeCliente, enderecoCliente);
                        
                        System.out.print("Quantos pets possui? ");
                        int qtdPets = sc.nextInt();
                        sc.nextLine();
                        
                        for(int i = 0; i < qtdPets; i++) {
                            
                            System.out.println("\n1 - Mamifero");
                            System.out.println("2 - Ave");
                            System.out.println("3 - Peixe");
                            
                            int tipoPet = sc.nextInt();
                            sc.nextLine();
                            
                            System.out.println("Nome do pet: ");
                            String nomePet = sc.nextLine();
                            
                            System.out.println("Raça do pet: ");
                            String raca = sc.nextLine();
                            
                            System.out.println("Idade do pet: ");
                            int idade = sc.nextInt();
                            sc.nextLine();
                            
                            if(tipoPet == 1) {
                                
                                System.out.println("Possui pelo? (true/false): ");
                                boolean pelo = sc.nextBoolean();
                                sc.nextLine();
                                
                                Mamifero m = new Mamifero(nomePet, raca, idade, pelo);
                                
                                cliente.adicionarPet(m);
                                
                            } else if (tipoPet == 2) {
                                
                                System.out.println("Envergadura da asa: ");
                                double asa = sc.nextDouble();
                                sc.nextLine();
                                
                                Ave a = new Ave(nomePet, raca, idade, asa);
                                
                                cliente.adicionarPet(a);
                                
                            } else if (tipoPet == 3) {
                                
                                System.out.println("Tipo de água: ");
                                String agua = sc.nextLine();
                                
                                Peixe p = new Peixe(nomePet, raca, idade, agua);
                                
                                cliente.adicionarPet(p);
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
                        
                        System.out.println("Nome: ");
                        String nomeFunc = sc.nextLine();
                        
                        System.out.println("Endereço: ");
                        String enderecoFunc = sc.nextLine();
                        
                        System.out.println("Salário: ");
                        double salario = sc.nextDouble();
                        sc.nextLine();
                        
                        if (tipoFunc == 1) {
                            
                            System.out.println("Setor: ");
                            String setor = sc.nextLine();
                            
                            Gestor g = new Gestor(nomeFunc, enderecoFunc, salario, setor);
                            
                            funcionarios.add(g);
                            
                        } else if (tipoFunc == 2) {
                            
                            System.out.println("CRMV: ");
                            String crmv = sc.nextLine();
                            
                            Veterinario v = new Veterinario(nomeFunc, enderecoFunc, salario, crmv);
                            
                            funcionarios.add(v);
                            
                        }
                        
                        System.out.println("Funcionário Cadastrado.");
                    }
                    
                    case 3 -> {
                        System.out.println("Nome do produto: ");
                        String nomeProd = sc.nextLine();
                        
                        System.out.println("Valor do produto: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        
                        System.out.println("Descrição: ");
                        String desc =sc.nextLine();
                        
                        Produto produto = new Produto(nomeProd, valor, desc);
                        
                        estoque.adicionarProduto(produto);
                        
                        System.out.println("Produto cadastrado com sucesso.");
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
                        System.out.println("Nome do produto para remover: ");
                        String remover = sc.nextLine();
                        
                        estoque.removerProdutos(remover);
                    }
                    
                    case 0 -> System.out.println("Sistema encerrado.");
                    
                    default -> System.out.println("Opção inválida.");
                }
            } while (opcao != 0);
        }
    }
}