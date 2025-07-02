# 📚 Projeto Livro em Java

Este projeto é um exercício prático do **Curso em Vídeo de Java**, que simula a leitura de livros utilizando os conceitos de **Programação Orientada a Objetos (POO)**.

## 💡 Objetivo

O objetivo do projeto é praticar:
- Criação de classes
- Implementação de interfaces
- Encapsulamento
- Métodos e atributos
- Composição entre objetos

## 🧱 Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### 🔸 `Pessoa.java`# 📚 Projeto Livro em Java

Este projeto é um exercício prático desenvolvido durante meus estudos no **Curso em Vídeo de Java**, com foco na aplicação dos conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

## 🎯 Objetivo

O principal objetivo deste projeto é consolidar o aprendizado dos seguintes conceitos:

- Criação e manipulação de classes
- Implementação de interfaces
- Encapsulamento de atributos e métodos
- Composição entre objetos
- Controle de estados através de métodos

Além disso, o projeto simula a leitura de um livro, onde um leitor pode abrir, folhear, avançar ou voltar páginas, trazendo uma experiência prática e didática.

## 🧱 Estrutura do Projeto

O projeto é composto por três componentes principais:

### 🔸 `Pessoa.java`

Classe que representa um leitor, com atributos básicos como:

- `nome` (String)
- `idade` (int)
- `sexo` (char)

Possui métodos, por exemplo:

- `fazerAniver()` — para incrementar a idade do leitor

---

### 🔸 `Livro.java`

Classe que representa um livro, implementando a interface `Publicacao`. Seus principais atributos são:

- `titulo` (String)
- `autor` (String)
- `totPaginas` (int) — total de páginas do livro
- `pagAtual` (int) — página atual que está sendo lida
- `aberto` (boolean) — indica se o livro está aberto ou fechado
- `leitor` (Pessoa) — objeto que representa quem está lendo o livro

Métodos importantes:

- `abrir()`, `fechar()` — para abrir e fechar o livro
- `folhear(int p)` — para ir para uma página específica
- `avancarPag()`, `voltarPag()` — para navegar pelas páginas
- `toString()` — apresenta um resumo do livro e do leitor

---

### 🔸 `Publicacao.java` (Interface)

Define os comportamentos essenciais que qualquer publicação deve ter:

```java
void abrir();
void fechar();
void folhear(int p);
void avancarPag();
void voltarPag();

Representa um leitor com os atributos:
- `nome`
- `idade`
- `sexo`

E métodos como:
- `fazerAniver()`

---

### 🔸 `Livro.java`
Representa um livro e implementa a interface `Publicacao`.  
Atributos:
- `titulo`
- `autor`
- `totPaginas`
- `pagAtual`
- `aberto` (boolean)
- `leitor` (instância da classe `Pessoa`)

Métodos principais:
- `abrir()`, `fechar()`
- `folhear(int p)`
- `avancarPag()`, `voltarPag()`
- `toString()` — mostra os dados do livro e do leitor

---

### 🔸 `Publicacao.java` (interface)
Define os comportamentos que uma publicação deve ter:
```java
void abrir();
void fechar();
void folhear(int p);
void avancarPag();
void voltarPag();
