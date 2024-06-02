package Main_arvore;

import estrutura_arvore.ArvoreNodo;

public class ArvoreBinariaDeBusca<TIPO extends Comparable<TIPO>> extends ArvoreBinaria<TIPO> {

	// Método para inserir um novo valor na árvore de busca
	public void inserir(TIPO valor) {
		ArvoreNodo<TIPO> parente = null;
		ArvoreNodo<TIPO> aux = getRaiz();

		// Percorre a árvore até encontrar a posição correta para inserir o novo valor
		while (aux != null) {
			parente = aux;
			if (valor.compareTo(aux.getObjeto()) < 0) {
				// Se o valor a ser inserido for menor que o valor do nó atual, move para a
				// esquerda
				aux = aux.getEsquerda();
			} else {
				// Se o valor a ser inserido for maior ou igual ao valor do nó atual, move para
				// a direita
				aux = aux.getDireita();
			}
		}

		// Cria um novo nó com o valor a ser inserido
		ArvoreNodo<TIPO> novoNodo = new ArvoreNodo<>(valor);

		// Insere o novo nó na posição correta na árvore
		if (parente == null) {
			// Se a árvore estiver vazia, o novo nó se torna a raiz da árvore
			setRaiz(novoNodo);
		} else if (valor.compareTo(parente.getObjeto()) < 0) {
			// Se o valor a ser inserido for menor que o valor do nó pai, o novo nó se torna
			// o filho esquerdo do nó pai
			parente.setEsquerda(novoNodo);
		} else {
			// Se o valor a ser inserido for maior ou igual ao valor do nó pai, o novo nó se
			// torna o filho direito do nó pai
			parente.setDireita(novoNodo);
		}
	}

	// Método para procurar um objeto na árvore de busca
	public ArvoreBinariaDeBusca<TIPO> procurar(TIPO obj, ArvoreNodo<TIPO> nodo) {
		if (nodo == null) {
			return null; // Retorna null se o nó atual for nulo
		} else if (nodo.getObjeto().equals(obj)) {
			return this; // Retorna a instância atual se o objeto for encontrado no nó atual
		} else if (obj.compareTo(nodo.getObjeto()) < 0) {
			return procurar(obj, nodo.getEsquerda()); // Procura na subárvore esquerda se o objeto for menor
		} else {
			return procurar(obj, nodo.getDireita()); // Procura na subárvore direita se o objeto for maior
		}
	}
}
