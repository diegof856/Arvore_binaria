package Main_arvore;

import estrutura_arvore.ArvoreNodo;

public class ArvoreBinaria<TIPO> {
	private Integer numero; // Número de nós na árvore (não está sendo utilizado)
	private ArvoreNodo<TIPO> raiz; // Referência para a raiz da árvore
	
	// Construtor padrão para criar uma árvore binária vazia
	public ArvoreBinaria() {
		this.raiz = null;
	}
	// Construtor para criar uma árvore binária com raiz especificada
	public ArvoreBinaria(TIPO obj, ArvoreNodo<TIPO> nodo) {
		if (nodo != null) {
			this.raiz = nodo;
		} else {
			this.raiz = new ArvoreNodo<>(obj);
		}
	}
	// Métodos getters e setters para acessar e modificar os atributos da árvore
	public Integer getNumero() {
		return numero;
	}

	public ArvoreNodo<TIPO> getRaiz() {
		return raiz;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setRaiz(ArvoreNodo<TIPO> raiz) {
		this.raiz = raiz;
	}

	// percuso em ordem simetrica escrita com correta in-order
	public void simetric_traversal(ArvoreNodo<TIPO> nodo) {
		 // Implementação recursiva do percurso em ordem simétrica
        // Percorre a subárvore esquerda, visita o nó atual e depois percorre a subárvore direita
		if (nodo == null) {
			nodo = this.raiz;
			if (nodo.getEsquerda() != null) {
				System.out.print("(");
				simetric_traversal(nodo.getEsquerda());
			}
			System.out.println(nodo);
			if (nodo.getDireita() != null) {
				simetric_traversal(nodo.getDireita());
				System.out.print(")");
			}

		} else {

			if (nodo.getEsquerda() != null) {
				System.out.print("(");
				simetric_traversal(nodo.getEsquerda());
			}
			System.out.print(nodo);
			if (nodo.getDireita() != null) {
				simetric_traversal(nodo.getDireita());
				System.out.print(")");
			}
		}

	}

	// percuso em pós-ordem
	public void percuso_pos_ordem(ArvoreNodo<TIPO> nodo) {
		// Implementação recursiva do percurso em pós-ordem
        // Percorre a subárvore esquerda, depois a subárvore direita e finalmente visita o nó atual
		if (nodo == null) {
			nodo = this.raiz;
			if (nodo.getEsquerda() != null) {
				percuso_pos_ordem(nodo.getEsquerda());
			}
			if (nodo.getDireita() != null) {
				percuso_pos_ordem(nodo.getDireita());
			}
			System.out.print(nodo);
		} else {
			if (nodo.getEsquerda() != null) {
				percuso_pos_ordem(nodo.getEsquerda());
			}
			if (nodo.getDireita() != null) {
				percuso_pos_ordem(nodo.getDireita());
			}
			System.out.print(nodo);
		}
	}

	// percuso em ordem generico
	public void inOrder_traversal(ArvoreNodo<TIPO> nodo) {
		 // Implementação recursiva do percurso em ordem genérico
        // Percorre a subárvore esquerda, visita o nó atual e depois percorre a subárvore direita
		if (nodo == null) {
			nodo = this.raiz;
			if (nodo.getEsquerda() != null) {

				inOrder_traversal(nodo.getEsquerda());
			}
			System.out.print(nodo + " ");
			if (nodo.getDireita() != null) {
				inOrder_traversal(nodo.getDireita());

			}

		} else {

			if (nodo.getEsquerda() != null) {

				inOrder_traversal(nodo.getEsquerda());
			}
			System.out.print(nodo+ " ");
			if (nodo.getDireita() != null) {
				inOrder_traversal(nodo.getDireita());

			}
		}

	}

	// calcular altura
	public Integer altura(ArvoreNodo<TIPO> nodo) {
		
		 // Implementação recursiva para calcular a altura da árvore
        // Retorna a altura da árvore, que é a altura máxima entre as subárvores esquerda e direita, mais 1
		int altura_esquerda = 0;
		int altura_direita = 0;
		if (nodo == null) {
			nodo = this.raiz;
			if (nodo.getEsquerda() != null) {
				altura_esquerda = altura(nodo.getEsquerda());
			}
			if (nodo.getDireita() != null) {
				altura_direita = altura(nodo.getDireita());
			}
			if (altura_direita > altura_esquerda) {
				return altura_direita + 1;
			} else {
				return altura_esquerda + 1;
			}

		} else {
			if (nodo.getEsquerda() != null) {
				altura_esquerda = altura(nodo.getEsquerda());
			}
			if (nodo.getDireita() != null) {
				altura_direita = altura(nodo.getDireita());
			}
			if (altura_direita > altura_esquerda) {
				return altura_direita + 1;
			} else {
				return altura_esquerda + 1;
			}

		}
	}

}
