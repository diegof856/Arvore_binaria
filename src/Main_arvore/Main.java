package Main_arvore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import estrutura_arvore.ArvoreNodo;

public class Main {

    public static void main(String[] args) {
        // Criando uma instância da árvore binária e da árvore binária de busca
        ArvoreBinaria<String> ex = new ArvoreBinaria<>();
        ArvoreBinariaDeBusca<Integer> arvoreDeBusca = new ArvoreBinariaDeBusca<Integer>();

        // Percorrendo em ordem a árvore de exemplo
        System.out.println("Percuso em ordem: ");
        ex = criarArvoreParaExemplo_Ordem();
        ex.simetric_traversal(ex.getRaiz());

        // Percorrendo em pós-ordem a árvore de exemplo
        ex = criarArvoreParaExemploPos_Ordem();
        System.out.println();
        System.out.println("Percuso em pós ordem: ");
        ex.percuso_pos_ordem(ex.getRaiz());

        // Calculando a altura da árvore de exemplo
        System.out.println();
        System.out.println("Altura da árvore: " + ex.altura(ex.getRaiz()));

        // Criando uma árvore de busca e exibindo a travessia em ordem
        arvoreDeBusca = criarArvoreDeBusca();
        System.out.println("Arvore de Busca:");
        arvoreDeBusca.inOrder_traversal(arvoreDeBusca.getRaiz());

        // Vetor de valores para busca na árvore de busca
        int[] vetor = { 5, 6, 9, 100, 1, 0, 31, 64, 11, 200 };
        // Realizando buscas na árvore de busca
        buscar(vetor, arvoreDeBusca);
    }

    // Criando a árvore de exemplo para percurso em pós-ordem
    private static ArvoreBinaria<String> criarArvoreParaExemploPos_Ordem() {
        ArvoreBinaria<String> arvore = new ArvoreBinaria<>();

        ArvoreNodo<String> n1 = new ArvoreNodo<>("D");
        ArvoreNodo<String> n2 = new ArvoreNodo<>("i");
        ArvoreNodo<String> n3 = new ArvoreNodo<>("e");
        ArvoreNodo<String> n4 = new ArvoreNodo<>("g");
        ArvoreNodo<String> n5 = new ArvoreNodo<>("o");

        n5.setDireita(n4);
        n5.setEsquerda(n3);
        n3.setEsquerda(n1);
        n3.setDireita(n2);

        arvore.setRaiz(n5);
        return arvore;
    }

    // Criando a árvore de exemplo para percurso em ordem
    private static ArvoreBinaria<String> criarArvoreParaExemplo_Ordem() {
        ArvoreBinaria<String> arvore = new ArvoreBinaria<>();
        ArvoreNodo<String> n1 = new ArvoreNodo<>("a");
        ArvoreNodo<String> n2 = new ArvoreNodo<>("+");
        ArvoreNodo<String> n3 = new ArvoreNodo<>("*");
        ArvoreNodo<String> n4 = new ArvoreNodo<>("b");
        ArvoreNodo<String> n5 = new ArvoreNodo<>("-");
        ArvoreNodo<String> n6 = new ArvoreNodo<>("/");
        ArvoreNodo<String> n7 = new ArvoreNodo<>("c");
        ArvoreNodo<String> n8 = new ArvoreNodo<>("d");
        ArvoreNodo<String> n9 = new ArvoreNodo<>("e");

        n6.setEsquerda(n7);
        n6.setDireita(n8);
        n5.setEsquerda(n6);
        n5.setDireita(n9);
        n3.setEsquerda(n4);
        n3.setDireita(n5);
        n2.setEsquerda(n1);
        n2.setDireita(n3);

        arvore.setRaiz(n2);
        return arvore;
    }

    // Criando uma árvore binária de busca com valores fixos
    private static ArvoreBinariaDeBusca<Integer> criarArvoreDeBusca() {
        List<Integer> valores = gerarValoresFixos();
        ArvoreBinariaDeBusca<Integer> arvore = new ArvoreBinariaDeBusca<Integer>();
        for (Integer v : valores) {
            arvore.inserir(v);
        }
        return arvore;
    }

    // Método para gerar uma lista de valores aleatórios
    private static List<Integer> gerarValoresAleatorios(int contador, int min, int max) {
        List<Integer> valores = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < contador; i++) {
            int valor = ran.nextInt(max - min + 1) + min;
            valores.add(valor);
        }
        return valores;
    }

    // Gerando valores fixos para a árvore de busca
    private static List<Integer> gerarValoresFixos() {
        List<Integer> valores = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            valores.add(i);
        }
        return valores;
    }
    
    // Método para buscar valores na árvore de busca e exibir os resultados
    private static void buscar(int[] vetor, ArvoreBinariaDeBusca<Integer> arvore) {
        ArvoreBinariaDeBusca<Integer> arvoreDeBusca = criarArvoreDeBusca();
        for (int valor : vetor) {
            ArvoreBinariaDeBusca<Integer> resultado = arvoreDeBusca.procurar(valor, arvoreDeBusca.getRaiz());
            if (resultado != null && resultado.getRaiz() != null) {
                System.out.println(valor + " encontrado");
            } else {
                System.out.println(valor + " não encontrado");
            }
        }
    }
}
