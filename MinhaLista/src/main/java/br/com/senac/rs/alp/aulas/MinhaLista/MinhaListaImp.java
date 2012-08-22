package br.com.senac.rs.alp.aulas.MinhaLista;

public class MinhaListaImp<Tipo> implements MinhaLista<Tipo> {

	private Nodo<Tipo> inicio = null;
	
	public MinhaListaImp(Tipo valorinicio){
		
		this.inicio = new Nodo<Tipo>(valorinicio);
		
	}
	
	public void sufixar(Tipo valor) {
		
		Nodo<Tipo> ultimo = buscarUltimoNodo();
		Nodo<Tipo> novoUltimo = new Nodo<Tipo>(valor);
		
		ultimo.setProximo(novoUltimo);
		
	}

	private Nodo<Tipo> buscarUltimoNodo() {
		
		int tamanho = tamanho();
		Nodo<Tipo> resultado = buscarNodo(tamanho - 1);
		
		return resultado;
	}

	private Nodo<Tipo> buscarNodo(int posicao) {
		
		Nodo<Tipo> resultado = getInicio();
		
		for(int i = 0; i < posicao; i++){
			
			resultado = resultado.getProximo();
			
		}
		
		return null;
	}

	private Nodo<Tipo> buscarPrimeiroNodo() {
		
		Nodo<Tipo> primeiro = new Nodo<Tipo>(buscar(0));
		return primeiro;
		
	}

	public void prefixar(Tipo valor) {

		Nodo<Tipo> primeiro = buscarPrimeiroNodo();
		Nodo<Tipo> novoPrimeiro = new Nodo<Tipo>(valor);
		
		novoPrimeiro.setProximo(primeiro);
		
		setInicio(novoPrimeiro);
		
	}

	public Tipo buscar(int posicao) {

		Nodo<Tipo> nodo = buscarNodo(posicao);
		
		return nodo.getValor();
		
	}

	public void inserir(int posicao, Tipo valor) {

		Nodo<Tipo> anterior = buscarNodo(posicao - 1);
		Nodo<Tipo> nodo = new Nodo<Tipo>(valor);
		Nodo<Tipo> proximo = anterior.getProximo();
		
		anterior.setProximo(nodo);
		nodo.setProximo(proximo);
		
	}

	public Tipo remover(int posicao) {
		
		Nodo<Tipo> anterior = buscarNodo(posicao - 1);
		Nodo<Tipo> nodo = anterior.getProximo();
		Nodo<Tipo> proximo = nodo.getProximo();
		
		anterior.setProximo(proximo);
		
		return nodo.getValor();
		
	}

	public int tamanho() {

		Nodo<Tipo> inicio = getInicio();
		Nodo<Tipo> nodoAtual = inicio;
		int resultado = 0;
		
		while (nodoAtual.getProximo()!=null){
		
			nodoAtual = nodoAtual.getProximo();
			resultado++;
		
		}
		
		return resultado;
		
	}

	public Nodo<Tipo> getInicio() {
		return inicio;
	}

	public void setInicio(Nodo<Tipo> inicio) {
		this.inicio = inicio;
	}

}
