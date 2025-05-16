package br.edu.figurasgeometricasplanas;

public class Paralelogramo {
	private double base;
	private double altura;
	private double area;
	
	public Paralelogramo() {
		base = 0;
		altura = 0;
		area = 0;
	}
	
	public void recebeBase(double base) {
		this.base = base;
	}
	public void recebeAltura(double altura) {
		this.altura = altura;
	}
	public void calcArea() {
		area = base * altura;
	}
	public void mostrarArea() {
		System.out.println("A área do Pararelogramo é: " + area);
	}
	public double mostrarAreaComRetorno() {
		System.out.println("A área do Paralelogramo é: " + area);
		return area;
	}
}


