# 🌌 Star Wars: A Forja da Força (May the 4th)

<img width="1209" height="572" alt="saida-terminal" src="https://github.com/user-attachments/assets/7a30a5c5-fade-4815-8299-b6f12108b11e" />

## 📜 Sobre o Projeto
Desenvolvido em celebração ao **May the 4th**, este projeto é uma aplicação de linha de comando (CLI) que simula a criação de um utilizador da Força. O foco principal foi a aplicação prática dos pilares da **Programação Orientada a Objetos (POO)** e a implementação do padrão de projeto **Factory Method** em Java puro.

O utilizador interage com o terminal para definir o seu caminho (Jedi ou Sith) e forjar o seu sabre de luz com cristais Kyber específicos, resultando numa ficha de personagem personalizada com representação visual colorida.

## 🛠️ Destaques Técnicos e Arquitetura

Este projeto foi estruturado seguindo as melhores práticas de Clean Code, utilizando uma arquitetura em camadas para garantir a separação de responsabilidades:

* **Abstração e Herança:** Utilização da classe abstrata `ForceUser` como base para as especializações `Jedi` e `Sith`, garantindo que comportamentos comuns sejam partilhados enquanto regras específicas são impostas.
* **Polimorfismo:** Implementação do método `useForce()`, onde a aplicação decide dinamicamente, em tempo de execução, qual habilidade será executada com base no objeto instanciado.
* **Design Pattern - Factory Method:** Criação da classe `ForceUserFactory` para centralizar a lógica de instanciação. Isto isola a complexidade da criação dos objetos, permitindo que a classe `Main` se preocupe apenas com a interação do utilizador.
* **Encapsulamento:** Gestão rigorosa dos estados internos das classes `Lightsaber` e `KyberCrystal`.

## 🎨 Funcionalidades
* **Customização de Personagem:** Escolha de alinhamento e nome.
* **Forja de Sabre de Luz:** Atribuição de cristais Kyber com cores reais via **códigos ANSI** (Azul, Verde, Vermelho e Roxo).
* **Visualização Dinâmica:** Exibição de ASCII Art colorida do sabre de luz diretamente no terminal.

## 📂 Estrutura de Pacotes
```text
br.com.pedrohqo.starwars
├── cli        # Classe Main e gestão do fluxo de entrada (Scanner)
├── domain     # Entidades, Enums (KyberCrystal) e Classes Abstratas
└── factory    # Implementação do Factory Method
```

## 🚀 Como Executar
1. Certifique-se de que tem o JDK 17 ou superior instalado.

2. Clone o repositório:

```
git clone [https://github.com/seu-usuario/star-wars-forja-jedi.git](https://github.com/seu-usuario/star-wars-forja-jedi.git)
```

3. Navegue até a pasta e compile:

```
javac br/com/pedrohqo/starwars/cli/Main.java
```

4. Execute a aplicação:

```
java br.com.pedrohqo.starwars.cli.Main
```
Desenvolvido por Pedro HQO Backend Developer
