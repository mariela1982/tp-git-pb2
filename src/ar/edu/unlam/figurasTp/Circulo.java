package ar.edu.unlam.figurasTp;

public class Circulo extends Figura  {
	
	private Double radio = 0.0;
	private Double resultado;
	private String color;

	public Circulo(String color, Double radio) {
	 this.color= color;
	 this.radio = radio;
	}
	
	

	public Double getRadio() {
		return radio;
	}



	public void setRadio(Double radio) {
		this.radio = radio;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
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
	
	
	
	



