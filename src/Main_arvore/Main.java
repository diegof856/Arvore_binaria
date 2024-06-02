package Main_arvore;

import estrutura_arvore.ArvoreNodo;

public class Main {

	
	public static void main(String[] args) {
		ArvoreBinaria ex = new ArvoreBinaria();
		/*ex.getRaiz().setEsquerda(new TreeNode(18));
		ex.getRaiz().setDireita(new TreeNode(14));
		
		System.out.println(ex.getRaiz());
		System.out.println(ex.getRaiz().getDireita());
		System.out.println(ex.getRaiz().getEsquerda());*/
		
		System.out.println("Percuso em ordem: ");
		ex = criarArvoreParaExemplo_Ordem();
		ex.simetric_traversal(ex.getRaiz());
		
		
		ex = criarArvoreParaExemploPos_Ordem();
		System.out.println();
		System.out.println("Percuso em pós ordem: ");
		ex.percuso_pos_ordem(ex.getRaiz());
		System.out.println();
		System.out.println("Altura da árvore: "+ ex.altura(ex.getRaiz()));
		
	}
	
	public static ArvoreBinaria criarArvoreParaExemploPos_Ordem() {
		ArvoreBinaria tree = new ArvoreBinaria();
		ArvoreNodo n1 = new ArvoreNodo("D");
		ArvoreNodo n2 = new ArvoreNodo("i");
		ArvoreNodo n3 = new ArvoreNodo("e");
		ArvoreNodo n4 = new ArvoreNodo("g");
		ArvoreNodo n5 = new ArvoreNodo("o");
		
		n5.setDireita(n4);
		n5.setEsquerda(n3);
		n3.setEsquerda(n1);
		n3.setDireita(n2);
		
		tree.setRaiz(n5);
		return tree;
		
	}
	public static ArvoreBinaria criarArvoreParaExemplo_Ordem() {
		ArvoreBinaria tree = new ArvoreBinaria();
		ArvoreNodo n1 = new ArvoreNodo("a");
		ArvoreNodo n2 = new ArvoreNodo("+");
		ArvoreNodo n3 = new ArvoreNodo("*");
		ArvoreNodo n4 = new ArvoreNodo("b");
		ArvoreNodo n5 = new ArvoreNodo("-");
		ArvoreNodo n6 = new ArvoreNodo("/");
		ArvoreNodo n7 = new ArvoreNodo("c");
		ArvoreNodo n8 = new ArvoreNodo("d");
		ArvoreNodo n9 = new ArvoreNodo("e");
		
		n6.setEsquerda(n7);
		n6.setDireita(n8);
		n5.setEsquerda(n6);
		n5.setDireita(n9);
		n3.setEsquerda(n4);
		n3.setDireita(n5);
		n2.setEsquerda(n1);
		n2.setDireita(n3);
		 
		tree.setRaiz(n2);
		return tree;
	}
}
