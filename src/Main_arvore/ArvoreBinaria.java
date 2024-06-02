package Main_arvore;

import estrutura_arvore.ArvoreNodo;

public class ArvoreBinaria {
	private Integer numero;
	private ArvoreNodo raiz;

	public ArvoreBinaria() {
		this.raiz = null;
	}

	public ArvoreBinaria(Integer numero) {
		ArvoreNodo nodo = new ArvoreNodo(numero);
		this.raiz = nodo;
	}

	public ArvoreBinaria(String operador) {
		ArvoreNodo nodo = new ArvoreNodo(operador);
		this.raiz = nodo;
	}

	public Integer getNumero() {
		return numero;
	}

	public ArvoreNodo getRaiz() {
		return raiz;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setRaiz(ArvoreNodo raiz) {
		this.raiz = raiz;
	}

	// percuso em ordem simetrica escrita com correta in-order
	public void simetric_traversal(ArvoreNodo nodo) {
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
	public void percuso_pos_ordem(ArvoreNodo nodo) {
		if(nodo == null) {
			nodo = this.raiz;
			if(nodo.getEsquerda() != null) {
				percuso_pos_ordem(nodo.getEsquerda());
			}
			if(nodo.getDireita() != null) {
				percuso_pos_ordem(nodo.getDireita());
			}
			System.out.print(nodo);
		}else {
			if(nodo.getEsquerda() != null) {
				percuso_pos_ordem(nodo.getEsquerda());
			}
			if(nodo.getDireita() != null) {
				percuso_pos_ordem(nodo.getDireita());
			}
			System.out.print(nodo);
		}
	}
	//calcular altura
	public Integer altura(ArvoreNodo nodo) {
		int altura_esquerda = 0;
		int altura_direita = 0;
		if(nodo == null) {
			nodo = this.raiz;
			if(nodo.getEsquerda() != null) {
				altura_esquerda = altura(nodo.getEsquerda());
			}
			if(nodo.getDireita() != null) {
				altura_direita = altura(nodo.getDireita());
			}
			if(altura_direita > altura_esquerda) {
				return altura_direita +1;
			}else {
				return altura_esquerda +1;
			}
			
		}else {
			if(nodo.getEsquerda() != null) {
				altura_esquerda = altura(nodo.getEsquerda());
			}
			if(nodo.getDireita() != null) {
				altura_direita = altura(nodo.getDireita());
			}
			if(altura_direita > altura_esquerda) {
				return altura_direita +1;
			}else {
				return altura_esquerda +1;
			}
			
		}
	}
	

}
