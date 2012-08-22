package br.com.senac.rs.alp.aulas.MinhaLista;

public class Nodo<Tipo extends Object>{
	
	private Tipo valor;
	private Nodo<Tipo> proximo = null;
	
	public Nodo(Tipo valor2) {
		
		this.valor = valor2;
		
	}

	public void setProximo(Nodo<Tipo> proximo){
	
		this.proximo = proximo;
	
	}
	
	public Nodo<Tipo> getProximo(){
	
		return this.proximo;
	
	}

	public Tipo getValor(){
		
		return valor;
	
	}

	public void setValor(Tipo valor) {
	
		this.valor = valor;
	
	}

}
