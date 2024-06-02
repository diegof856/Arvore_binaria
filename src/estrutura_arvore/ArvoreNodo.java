package estrutura_arvore;

public class ArvoreNodo<TIPO> {

	// Atributos do nó da árvore
	private TIPO objeto; // O objeto armazenado no nó
	private ArvoreNodo<TIPO> direita; // Referência para o nó filho direito
	private ArvoreNodo<TIPO> esquerda; // Referência para o nó filho esquerdo

	// Construtor para criar um nó com um objeto especificado
	public ArvoreNodo(TIPO objeto) {
		this.objeto = objeto;
		this.direita = null; // Inicialmente, não há nó filho direito
		this.esquerda = null; // Inicialmente, não há nó filho esquerdo
	}

	// Métodos getters e setters para acessar e modificar os atributos do nó

	public TIPO getObjeto() {
		return objeto;
	}

	public void setObjeto(TIPO objeto) {
		this.objeto = objeto;
	}

	public ArvoreNodo<TIPO> getDireita() {
		return direita;
	}

	public void setDireita(ArvoreNodo<TIPO> direita) {
		this.direita = direita;
	}

	public ArvoreNodo<TIPO> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(ArvoreNodo<TIPO> esquerda) {
		this.esquerda = esquerda;
	}

	// Sobrescrevendo o método toString para fornecer uma representação em string do
	// objeto armazenado no nó
	@Override
	public String toString() {
		return this.objeto.toString();
	}
}
