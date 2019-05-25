/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Rodrigo
 */
import java.util.LinkedList;

public class GrafoPonderado {
    static class Aresta {
        int origem;
        int destino;
        int peso;

        public Aresta(int origem, int destino, int peso) {
            this.origem = origem;
            this.destino = destino;
            this.peso = peso;
        }
    }

    static class Grafo {
        int vertices;
        LinkedList<Aresta> [] listaDeAdjacencias;

        Grafo(int vertices) {
            this.vertices = vertices;
            listaDeAdjacencias = new LinkedList[vertices];
            for (int i = 0; i <vertices ; i++) {
                listaDeAdjacencias[i] = new LinkedList<>();
            }
        }

        public void addVertice(int origem, int destino, int peso) {
            Aresta Aresta = new Aresta(origem, destino, peso);
            listaDeAdjacencias[origem].addFirst(Aresta);
        }

        public void printGrafo(){
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Aresta> list = listaDeAdjacencias[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("Vértice - " + i + " está conectado com " +
                            list.get(j).destino + " com peso " +  list.get(j).peso);
                }
            }
        }
    }
}