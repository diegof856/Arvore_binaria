package estrutura_arvore;

public class ArvoreNodo {

	private Object objeto;
	private ArvoreNodo direita;
	private ArvoreNodo esquerda;

	public ArvoreNodo(Object objeto) {

		this.objeto = objeto;
		this.direita = null;
		this.esquerda = null;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public ArvoreNodo getDireita() {
		return direita;
	}

	public void setDireita(ArvoreNodo direita) {
		this.direita = direita;
	}

	public ArvoreNodo getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(ArvoreNodo esquerda) {
		this.esquerda = esquerda;
	}
	@Override
	public String toString() {
		return this.objeto.toString();
	}
}
