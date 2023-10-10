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
	
	
	
	

}
