package ar.edu.unlam.figurasTp;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
	
	private String nombre = "";
	private List <Figura> figuras ;

	public Tablero(String nombre) {
		this.nombre = nombre;
		figuras = new ArrayList <Figura>();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(Figura figura) {
		this.figuras.add(figura);
	}

	

}
