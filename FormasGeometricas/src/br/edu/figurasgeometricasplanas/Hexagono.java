package br.edu.figurasgeometricasplanas;

public class Hexagono {
	private double lado;
	private double area;
	
	public Hexagono() {
		lado = 0;
		area = 0;
	}
	
	public void recebeLado(double lado) {
		this.lado = lado;
	}
	public void calcArea() {
		area = (3 * 3* Math.sqrt(3)* (lado * lado)/2);
	}
	public void mostrarArea() {
		System.out.println("A área do Hexagono é: " + area);
	}
	public double mostrarAreaComRetorno() {
		System.out.println("A área do Hexagono é: " + area);
		return area;
	}
}
