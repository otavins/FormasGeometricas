package br.edu.figurasgeometricasplanas;

public class Losango {
	private double DiagonalMaior;
	private double DiagonalMenor;
	private double area;
	
	public Losango() {
		DiagonalMaior = 0;
		DiagonalMenor = 0;
		area = 0;
	}	
	
	public void recebeDiagonalMaior(double DiagonalMaior) {
		this.DiagonalMaior = DiagonalMaior;
	}
	public void recebeDiagonalMenor(double DiagonalMenor) {
		this.DiagonalMenor = DiagonalMenor;
	}
	public void calcArea() {
		area = (DiagonalMaior * DiagonalMenor)/2;
	}
	public void mostrarArea() {
		System.out.println("A área do Losango é: " + area);
	}
	public double mostrarAreaComRetorno() {
		System.out.println("A área do Losango é: " + area);
		return area;
	}
}

