package ar.edu.unlam.figurasTp;

public class Rectangulo extends Figura {
	
	
	private Double lado1 = 0.0, lado2 = 0.0;
	private Double resultado = 0.0;

	public Rectangulo(String color, Double lado1, Double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	

	


	public Double getLado1() {
		return lado1;
	}



	public void setLado1(Double lado1) {
		this.lado1 = lado1;
	}



	public Double getLado2() {
		return lado2;
	}



	public void setLado2(Double lado2) {
		this.lado2 = lado2;
	}



	@Override
	public Double calcularArea() {
		resultado = lado1 *lado2;
		return resultado;
	}

	@Override
	public Double calcularPerimetro() {
		resultado = (2*lado1) +(2 * lado2);
		return resultado;
	}

}
