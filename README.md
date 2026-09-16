# Resumo dos Projetos de Programação Orientada a Objetos (POO)

Este documento centraliza as explicações sobre os projetos desenvolvidos ao longo da disciplina, separados por assunto para facilitar os estudos.

## 01. Introdução e Básico
Esta categoria engloba os conceitos iniciais da disciplina, como criação de classes, atributos, métodos, instanciação de objetos e entrada/saída de dados básica (ex: classe `Scanner`).

* **prjAluno**, **prjCirculo**, **prjExemplo1** a **prjExemplo7**, **prjExemploRetangulo_1**, **prjExemploRetangulo_2**: Projetos introdutórios que abordam modelagem básica de entidades do mundo real (Aluno, Conta, Formas Geométricas) aplicando encapsulamento (getters e setters) e métodos operacionais simples.

## 02. Construtores, This e ArrayList
Foco em métodos construtores, uso da palavra reservada `this` para auto-referência e coleções dinâmicas utilizando `ArrayList`.

* **prjCirculoMetodoConstrutor** / **prjRetanguloMetodoConstrutor**: Adaptações dos projetos básicos para forçar a inicialização de atributos obrigatórios no momento da instanciação utilizando métodos construtores.
* **prjExemploArrayListThisAtualizado** / **prjAtividade4ArrayListThis**: Demonstram como gerenciar múltiplos objetos utilizando listas (`ArrayList`) e manipulação de coleções, evitando o uso de arrays estáticos.

## 03. Associação Binária
Trata do relacionamento onde uma classe possui como atributo uma referência a outra classe (relacionamento "tem-um" ou "conhece-um").

* **prjExemploAssociacaoBinaria**: Exemplo didático mostrando como uma classe se liga a outra bidirecionalmente ou unidirecionalmente.
* **prjPessoaFisicaJuridicaAssocBin**: Aplicação da associação binária em um contexto de negócio envolvendo pessoas físicas e jurídicas.

## 04. Herança e Polimorfismo (Generalização e Especialização)
Conceitos fundamentais de POO onde classes filhas herdam características e comportamentos de classes pais ("é-um"), com a possibilidade de reescrever métodos (polimorfismo).

* **pjrExemploGenerEspecSemPolimorfismo** / **prjExercicioGenerEspecSemPolimorfismo**: Exercícios focados em criar a hierarquia de herança sem a sobrescrita (override) de métodos.
* **prjExemploGenerEspecComPolimorfismo** / **prjExercicioGenerEspecComPolimorfismo**: Aplica o conceito de polimorfismo, onde a classe filha adapta um método genérico da classe pai para sua própria necessidade (ex: cálculo de bônus ou rendimento de forma distinta).

## 05. GUI (Interface Gráfica) e Banco de Dados (BD)
Integração do paradigma orientado a objetos com interfaces visuais desktop (Swing) e persistência de dados em Banco de Dados Relacional (Oracle/MySQL).

* **prjExemploGuiRetangulo**: Introdução à criação de telas, lidando com eventos de botões e campos de texto utilizando `JFrame` e companhia.
* **prjExemplo_OO_GUI_BD** / **prjExercicioCliente_BD**: Evolução natural para sistemas completos. Implementam a arquitetura MVC (Model, View, Control), o padrão DAO (Data Access Object) para conversar com o banco de dados via conexão JDBC. Demonstram as operações básicas de CRUD (Create, Read, Update, Delete).

## 06. Trabalhos Finais
Projetos avaliativos que consolidam os conhecimentos do semestre.

* **prjTrab1POOJoaoReche** (Trabalho 1): 
  * **Sistema GameShop**: Aplicação com interface gráfica (GUI) para controle de saldo de horas de gamers (Frequentes e Esporádicos). Permite comprar horas (ganhando bônus de horas adicionais se for frequente), jogar (debitando horas) e ganhar brindes, fazendo uso de `JOptionPane` para mensagens de erro/sucesso.
* **prjTrab2POOJoaoRecheLeonardoCordeiro** (Trabalho 2):
  * **Sistema de Gestão de Hotel e Reservas**: Sistema robusto em camadas (Model, View, Control/DAO) com integração ao Banco de Dados Oracle (usando `ojdbc6_g.jar`). 
  * Possui telas para cadastro de Hotel e cadastro de Reservas (Check-in e Check-out).
  * Realiza cálculos complexos de datas (dias corridos desde 1900) e associação 1..* (um hotel tem várias reservas) utilizando `ArrayList`.

## 07. Atividades
Projetos desenvolvidos como atividades práticas guiadas pelos PDFs de instruções.

* **prjLivro** (Atividade 1): Implementa a classe `Livro` e uma aplicação console para simular o empréstimo e devolução de livros, controlando a situação (disponível/emprestado) e calculando multas por atraso na devolução.
* **prjExPessoaFisicaJuridica** (Atividade 2): Implementa a hierarquia onde `PessoaFisica` e `PessoaJuridica` herdam da superclasse `Pessoa` ou da estrutura de funcionários, calculando bônus e salários com regras específicas de negócio.
* **prjContaCorrente** (Atividade 3): Implementação da modelagem de uma conta corrente com operações básicas de saque e depósito.
* **prjAtividade4** (Atividade 4): Projeto que envolve a modelagem de `Pessoa`, `Palestrante`, `Participante` e `Palestra`. Aborda associação de objetos e cálculo de taxas e recebimentos para palestras dependendo do tipo de participante (Comum, Estudante, Idoso).
