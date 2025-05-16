package br.edu.figurasgeometricasplanas;

public class Triangulo {
	 private double base;
	 private double altura;
	 private double area;
	
	public void recebeAltura(double altura) {
		this.altura = altura;
	}
	public void recebeBase(double base) {
		this.base = base;
	}
	public void calcArea() {
		area = (base*altura)/2;
	}
	public void mostrarArea() {
		System.out.println("A área do Triângulo é: " + area);
	}
	public double mostrarAreaComRetorno() {
		System.out.println("A área do Triângulo é: " + area);
		return area;
	}
}