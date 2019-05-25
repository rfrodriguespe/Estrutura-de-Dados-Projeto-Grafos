/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class GrafoPonderadoTeste {
    
    public static GrafoPonderado.Grafo grafo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        boolean grafoCriado = false;
        do {

            System.out.println("PROJETO 03 - GRAFO PONDERADO\n");
            System.out.println("a) Criar Grafo");
            System.out.println("b) Inserir Aresta");
            System.out.println("c) Exibir Grafo");
            System.out.println("d) Sair\n");
            System.out.print("Escolha sua opcao: ");

            String opcao = sc.next();

            switch (opcao) {
                case "a":
                    System.out.print("Quantos véstives terá esse grafo: ");
                    grafo = new GrafoPonderado.Grafo(sc.nextInt());
                    grafoCriado = true;
                    break;
                case "b":
                    System.out.print("Insira Origem: ");
                    int origem = sc.nextInt();
                    System.out.print("Insira Destino: ");
                    int destino = sc.nextInt();
                    System.out.print("Insira o peso: ");
                    int peso = sc.nextInt();
                    grafo.addVertice(origem, destino, peso);
                    break;
                case "c":
                    if (grafoCriado) grafo.printGrafo();
                    else System.out.println("Voce ainda não criou seu grafo");
                    break;
                case "d":
                    System.out.println("OBRIGADO E ATE LOGO");
                    sair = true;
                    break;
                default:
                    System.out.println("\n\nOPCAO INVALIDA");
            }

        } while (sair != true);
    }
}