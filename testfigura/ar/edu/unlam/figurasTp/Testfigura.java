package ar.edu.unlam.figurasTp;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testfigura {

	@Test
	public void queSePuedaCrearUnCirculo() {
		String color = "verde";
		Double radio = 12.2;
		
		Figura circulo = new Circulo(color,radio);
		
		assertNotNull(circulo);
	
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnCirculo() {
		String color = "verde";
		Double radio = 2.2;
		Double resultado = 0.0 ,resultadoDeseado = 15.20;
		
		Figura circulo = new Circulo(color,radio);
		
		resultado= circulo.calcularArea();
		assertEquals(resultadoDeseado,resultado,2);
		
	
	}
	
	@Test
	public void queSePuedaCalcularElPerimetroDeUnCirculo() {
		String color = "verde";
		Double radio = 2.2;
		Double resultado = 0.0 ,resultadoDeseado = 13.82;
		
		Figura circulo = new Circulo(color,radio);
		
		resultado= circulo.calcularPerimetro();
		assertEquals(resultadoDeseado,resultado,2);
		
	}
	
	@Test
	public void queSePuedaCrearUnRectangulo() {
		String color = "verde";
		Double lado1 = 3.1,lado2 = 4.0;
		
		Figura rectangulo = new Rectangulo(color,lado1, lado2);
		
		assertNotNull(rectangulo);
	
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnRectangulo() {
		String color = "verde";
		Double lado1 = 3.1,lado2 = 4.0;
		Double resultadoEsperado = 12.40, resultadoObtenido = 0.0 ;
		Figura rectangulo = new Rectangulo(color,lado1, lado2);
		resultadoObtenido = rectangulo.calcularArea();
		
		assertEquals(resultadoEsperado, resultadoObtenido, 2);
		
	}
	
	@Test
	public void queSePuedaCalcularElPerimetroDeUnRectangulo() {
		String color = "verde";
		Double lado1 = 3.1,lado2 = 4.0;
		Double resultadoEsperado = 14.20, resultadoObtenido = 0.0 ;
		Figura rectangulo = new Rectangulo(color,lado1, lado2);
		resultadoObtenido = rectangulo.calcularPerimetro();
		
		assertEquals(resultadoEsperado, resultadoObtenido, 2);
		
	}
	
	@Test
	public void queSePuedaCrearUnCuadrado() {
		String color = "verde";
		Double lado1 = 3.0;
		
		Figura cuadrado = new Cuadrado(color,lado1);
		
		assertNotNull(cuadrado);
	
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnCuadrado() {
		String color = "verde";
		Double lado1 = 3.0;
		Double resultadoObtenido = 0.0,resultadoEsperado = 9.0;
		
		Figura cuadrado = new Cuadrado(color,lado1);
		resultadoObtenido =cuadrado.calcularArea();
		
		assertEquals(resultadoEsperado, resultadoObtenido,2);
	
	}
	
	@Test
	public void queSePuedaCalcularElPerimetroDeUnCuadrado() {
		String color = "verde";
		Double lado1 = 3.0;
		Double resultadoObtenido = 0.0,resultadoEsperado = 12.0;
		
		Figura cuadrado = new Cuadrado(color,lado1);
		resultadoObtenido =cuadrado.calcularPerimetro();
		
		assertEquals(resultadoEsperado, resultadoObtenido,2);
	
	}

 // como puedo poner color en figura si es que se puede como atributo general 
	// interface de tipo  poliedro 
	
	
	

}
