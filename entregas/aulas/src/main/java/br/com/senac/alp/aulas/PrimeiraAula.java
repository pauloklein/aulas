package br.com.senac.alp.aulas;

//import java.util.Arrays;
//import org.junit.Assert;

public class PrimeiraAula {

	private static PrimeiraAula instancia = new PrimeiraAula();

	public static double[] valores = null;		
	public static double esperado = 0.0;
	public static double resultado = 0.0;	

	private PrimeiraAula() {

		super();
	}

	public static double somaTotal(double[] valores) {

		double resultado = 0.0;

		if (valores == null) { 
			resultado = Double.NaN;		
		} else { 
			for(int i=0; i<valores.length; i++) {
				resultado += valores[i];		
			}
		}

		return resultado;
	}

	public static PrimeiraAula getInstancia() {

		return PrimeiraAula.instancia;
	}

	public static boolean comparaDouble(double esperado, double resultado){
		boolean retorno;

		if(Double.compare(resultado, esperado) == 0) {
			retorno = true;
		} else {
			retorno = false;
		}

		return retorno;
	}

	public static void exibeResultados(double esperado, double resultado) {
		System.out.println("Resultado esperado: " + esperado);
		System.out.println("Resultado retornado: " + resultado);
	}

	public static void testaResultadoArgumentoNulo(){
		valores = null;
		esperado = Double.NaN;
		resultado = somaTotal(valores);

		if(comparaDouble(resultado, esperado)) {
			System.out.println("Parâmetro: Array nulo funciona.");			
		} else {
			System.out.println("Parâmetro: Array nulo não funciona.");			
		}	

		exibeResultados(esperado, resultado);
	}

	public static void testaResultadoArgumentoArrayVazio(){
		double esperado = 0.0;
		valores = new double[0];
		resultado = somaTotal(valores);

		if(comparaDouble(resultado, esperado)) {
			System.out.println("Parâmetro: Array sem elementos funciona.");			
		} else {
			System.out.println("Parâmetro: Array sem elementos não funciona.");			
		}

		exibeResultados(esperado, resultado);
	}

	public static void testaResultadoArgumentoArrayUnitario(){
		valores = new double[1];
		valores[0] = Math.random();
		esperado = valores[0];
		resultado = somaTotal(valores);

		if(comparaDouble(resultado, esperado)) {
			System.out.println("Parâmetro: Array com um único elemento funciona.");			
		} else {
			System.out.println("Parâmetro: Array com um único elemento não funciona.");			
		}

		exibeResultados(esperado, resultado);		
	}	

	public static void testaResultadoArgumentoArrayVariasPosicoes(){
		esperado = 0.0;
		valores = new double[10];

		for (int i = 0; i < valores.length; i++) {
			double val = Math.random();
			valores[i] = val;
			esperado += val;			
		}

		resultado = somaTotal(valores);

		if(comparaDouble(resultado, esperado)) {
			System.out.println("Parâmetro: Array com mais de um elemento funciona.");			
		} else {
			System.out.println("Parâmetro: Array com mais de um elemento não funciona.");			
		}

		exibeResultados(esperado, resultado);		
	}	

	public static void main(String[] args) {
		testaResultadoArgumentoNulo();						
		System.out.println("----------------------------------------------------");

		testaResultadoArgumentoArrayVazio();
		System.out.println("----------------------------------------------------");

		testaResultadoArgumentoArrayUnitario();
		System.out.println("----------------------------------------------------");

		testaResultadoArgumentoArrayVariasPosicoes();
		System.out.println("----------------------------------------------------");
	}


}