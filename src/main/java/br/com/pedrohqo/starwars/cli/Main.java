package br.com.pedrohqo.starwars.cli;

import br.com.pedrohqo.starwars.domain.ForceUser;
import br.com.pedrohqo.starwars.factory.ForceUserFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println(" \uD83C\uDF0C A FORJA DA FORÇA - MAY THE 4TH \uD83C\uDF0C ");
        System.out.println("=====================================");

        System.out.println("Qual é o seu nome, Jovem Padawan? ");
        String name = scan.nextLine();

        System.out.println("\nEscolha seu caminho na Força:");
        System.out.println("1 - Lado Luminoso (Jedi)");
        System.out.println("2 - Lado Sombrio (Sith)");
        System.out.print("Sua escolha (1 ou 2): ");
        int alignment = scan.nextInt();

        System.out.println("\nEscolha a cor do seu Cristal Kyber:");
        System.out.println("1 - Azul");
        System.out.println("2 - Verde");
        System.out.println("3 - Vermelho (Tradicional Sith)");
        System.out.println("4 - Roxo (Estilo Mace Windu)");
        System.out.print("Sua escolha (1 a 4): ");
        int color = scan.nextInt();

        System.out.println("\nForjando seu destino...");
        System.out.println("=====================================\n");

        ForceUser character = ForceUserFactory.createCharacter(name, alignment, color);

        System.out.println("Nome: Mestre " + character.getName());

        System.out.println("Habilidade: ");
        character.useForce();

        character.getLightsaber().ignite();

        System.out.println("\nQue a força esteja com você!");

        scan.close();
    }
}
