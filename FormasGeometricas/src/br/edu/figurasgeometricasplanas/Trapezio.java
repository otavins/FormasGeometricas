package br.edu.figurasgeometricasplanas;

public class Trapezio {
	private double bMaior;
	private double bMenor;
	private double altura;
	private double area;
	public void recebebMaior(double bMaior) {
		this.bMaior = bMaior;
	}
	public void recebebMenor(double bMenor) {
		this.bMenor = bMenor;
	}
	public void recebeAltura(double altura) {
		this.altura = altura;
	}
	public void calcArea() {
		area = (bMaior + bMenor) * altura/2;
	}
	public void mostrarArea() {
		System.out.println("A área do Trapezio é: " + area);
	}
	public double mostrarAreaComRetorno() {
		System.out.println("A área do Trapezio é: " + area);
		return area;
	}
}
