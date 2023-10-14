package ar.edu.unlam.figurasTp;

public class Circulo extends Figura  {
	
	private Double radio = 0.0;
	private Double resultado;
	

	public Circulo(String color, Double radio) {
	 super(color);
	 this.radio = radio;
	}
	
	

	public Double getRadio() {
		return radio;
	}



	public void setRadio(Double radio) {
		this.radio = radio;
	}



	


	@Override
	public Double calcularArea() {
		resultado = Math.PI*radio*radio;
		return resultado;
	}

	@Override
	public Double calcularPerimetro() {
		resultado = 2*Math.PI*radio;
		return resultado;
	}
}
	
	
	
	



