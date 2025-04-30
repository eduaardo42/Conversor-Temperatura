package br.dev.eduardo.temperatura.model;

public class Temperatura {

	private double celsius;
	
	//o get é utilizado para retornar o valor atribuido ao celsius
	public double getCelsius() {
		return celsius;
	};
	
	// o set é utilizado para fazer uma atribuição de valor a variável Celsius
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	};
	
	//Aqui será onde a converção de celsius para Kelvin será realizado
	public double converterParaKelvin () {
		
		double resultadoKelvin = celsius + 273.15;
		return resultadoKelvin;
		
	};
	
	//Aqui será onde a converção de celsius para Kelvin será realizado
	public double converterParaFahreinheit () {
		
		double resultadoFahreinheit  = celsius * 1.8 + 32;
		return resultadoFahreinheit ;
		
	};
	
	
	
}
