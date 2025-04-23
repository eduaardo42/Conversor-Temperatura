package br.dev.eduardo.temperatura.model;

public class Temperatura {

	private double celsius;
	
	public double getCelsius() {
		return celsius;
	};
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	};
	
	
	public void converterParaCelsius () {
		
		double resultado = celsius + 273;
		
	};
	
	public void converterParaFahreinheit () {
		
		//double resultado = celsius / 5 -32 / 9;
		
		double resultadoCelsius = celsius - 32 / 9 /5;
	};
	
	
	
}
