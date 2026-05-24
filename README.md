# Sistema de Gerenciamento de PetShop

Este projeto foi desenvolvido como parte da disciplina de **Programação I (Semestre 2026/1)**. O objetivo é criar um sistema de gerenciamento para um PetShop utilizando os principais conceitos de **Programação Orientada a Objetos (POO)** em Java.

---

# Descrição do Projeto

O sistema permite o gerenciamento de clientes, pets, funcionários e produtos do PetShop, simulando funcionalidades básicas de um sistema real.

O projeto foi desenvolvido aplicando conceitos fundamentais da Programação Orientada a Objetos:

1. **Herança:** utilização de subclasses para especialização de pets e funcionários.
2. **Polimorfismo:** armazenamento de diferentes tipos de objetos em listas genéricas.
3. **Encapsulamento:** proteção dos atributos utilizando `private`, getters e setters.
4. **Estruturas de Dados:** utilização de `ArrayList` para gerenciamento dinâmico das informações.

---

# Estrutura do Sistema

## Pets

Os pets cadastrados possuem:
- Nome
- Raça
- Idade

Os tipos disponíveis são:
- Mamíferos
- Aves
- Peixes

Cada tipo possui características específicas.

---

## Funcionários

Os funcionários possuem:
- Nome
- Endereço
- Salário

Os tipos disponíveis são:
- Gestores
- Veterinários

---

## Clientes

Os clientes possuem:
- Nome
- Endereço
- Lista de pets cadastrados

---

## Produtos e Estoque

Cada produto possui:
- Nome
- Valor
- Descrição

Os produtos são armazenados no estoque utilizando `ArrayList`.

---

# Funcionalidades Principais

- Cadastro de clientes e seus pets
- Cadastro de funcionários
- Cadastro de produtos
- Listagem de clientes e pets
- Listagem de funcionários
- Listagem de produtos do estoque
- Remoção de produtos
- Busca de pet por raça
- Busca de todos os peixes
- Busca de clientes
- Busca de funcionário
- Remoção de clientes
- Remoção de Funcionário
- Busca de produto por nome
- Associação entre clientes e múltiplos pets
- Menu interativo utilizando `Scanner`

---

# Conceitos de POO Utilizados

## Herança

Utilizada nas subclasses:

- `Mamifero`, `Ave` e `Peixe` herdando de `Pet`
- `Gestor` e `Veterinario` herdando de `Funcionario`

---

## Polimorfismo

Utilização de listas genéricas como:

```java
ArrayList<Pet>
```

permitindo armazenar diferentes tipos de pets em uma mesma estrutura.

---

## Encapsulamento

Uso de atributos `private` e métodos `get` e `set` para controle de acesso às informações.

---

# Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- ArrayList
- Scanner
- Terminal/CLI

---

# Estrutura do Repositório

```text
Main.java
Pet.java
Mamifero.java
Ave.java
Peixe.java
Cliente.java
Funcionario.java
Gestor.java
Veterinario.java
Produto.java
Estoque.java
```

---

# Como Executar

Compile todos os arquivos:

```bash
javac *.java
```

Execute a classe principal:

```bash
java Main
```

---

Projeto acadêmico desenvolvido para a disciplina de Programação I.
