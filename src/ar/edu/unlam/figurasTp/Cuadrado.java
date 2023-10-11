package ar.edu.unlam.figurasTp;

public class Cuadrado extends Figura {
	
	private String color = "";
	private Double lado = 0.0;
	private Double resultado = 0.0;

	public Cuadrado(String color, Double lado) {
		this.color = color;
		this.lado = lado;
	}
	
	

	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public Double getLado() {
		return lado;
	}



	public void setLado(Double lado) {
		this.lado = lado;
	}



	@Override
	public Double calcularArea() {
		resultado = lado * lado ;
		return resultado;
	}

	@Override
	public Double calcularPerimetro() {
		resultado = lado * 4 ;
		return resultado;
	}

}
