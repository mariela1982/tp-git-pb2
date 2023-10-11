package ar.edu.unlam.figurasTp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTableroPain {

	@Test
	public void queSePuedaCrearUnTableroPaint() {
		String nombre = "paint";
		
		Tablero tablero = new Tablero(nombre);
		
		assertNotNull(tablero);
	}
	
	@Test
	public void queSePuedaAgregarunCirculoUnRectanguloYunCuadrado() {
		String nombre = "paint";
		String color = "verde";
		Double radio = 12.2;
		Double lado1 = 3.1,lado2 = 4.0;
		Integer cantidad = 3, cantidadObtenida = 0 ; 
		
		Figura rectangulo = new Rectangulo(color,lado1, lado2);
		Figura circulo = new Circulo(color,radio);
		Tablero tablero = new Tablero(nombre);
		Figura cuadrado = new Cuadrado(color,lado1);
		
		tablero.setFiguras(cuadrado);
		tablero.setFiguras(circulo);
		tablero.setFiguras(rectangulo);
		
		cantidadObtenida = tablero.getFiguras().size();
		
		assertEquals(cantidadObtenida, cantidad);
			
		
		assertNotNull(tablero);
	}
	
	

}
