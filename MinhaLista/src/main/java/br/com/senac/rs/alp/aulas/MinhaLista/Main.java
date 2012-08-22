package br.com.senac.rs.alp.aulas.MinhaLista;

public class Main {

	public static void main(String[] args) {

		MinhaLista<String> lista = new MinhaListaImp<String>("Início");
		
		
		System.out.println(lista.tamanho());
		System.out.println(lista.buscar(0));
		

	}

}
