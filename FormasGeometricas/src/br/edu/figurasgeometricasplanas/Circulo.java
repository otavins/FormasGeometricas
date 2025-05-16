package br.edu.figurasgeometricasplanas;

public class Circulo {
	private double raio;
	private double pi;
	private double area;
	
	public Circulo() {
		raio = 0;
		pi = 0;
		area = 0;
	}
	
	public void recebeRaio(double raio) {
		this.raio = raio;
	}
	public void recebePi() {
		this.pi = Math.PI;
	}
	public void calcArea() {
		pi = Math.PI;
		area = pi * (raio*raio);
	}
	public void mostrarArea() {
		System.out.println("A área do Circulo é: " + area);
	}
	public double mostrarAreaComRetorno() {
		System.out.println("A área do Circulo é: " + area);
		return area;
	}
}
