package br.edu.principal;
import br.edu.figurasgeometricasplanas.*;
public class Principal {

	public static void main(String[] args) {
		Triangulo fg1 = new Triangulo();
		fg1.recebeBase(7);
		fg1.recebeAltura(5);
		fg1.calcArea();
		fg1.mostrarArea();
		double recebaArea = fg1.mostrarAreaComRetorno();
		System.out.println("");
		

		Trapezio fg2 = new Trapezio();
		fg2.recebebMaior(10);
		fg2.recebebMenor(6);
		fg2.recebeAltura(4);
		fg2.calcArea();
		fg2.mostrarArea();
		recebaArea = fg2.mostrarAreaComRetorno();
		System.out.println("");
		
		Retangulo fg3 = new Retangulo();
		fg3.recebeBase(8);
		fg3.recebeAltura(10);
		fg3.calcArea();
		fg3.mostraArea();
		recebaArea = fg3.mostrarAreaComRetorno();
		System.out.println("");
		
		Quadrado  fg4 = new Quadrado();
		fg4.recebeLado(10);
		fg4.calcArea();
		fg4.mostrarArea();
		recebaArea = fg4.mostrarAreaComRetorno();
		System.out.println("");
		
		Pentagono fg5 = new Pentagono();
		fg5.recebaLado(5);
		fg5.calcApotema();
		fg5.calcArea();
		fg5.mostrarArea();
		recebaArea = fg5.mostrarAreaComRetorno();
		System.out.println("");
		
		Paralelogramo fg6 = new Paralelogramo();
		fg6.recebeBase(4);
		fg6.recebeAltura(2);
		fg6.calcArea();
		fg6.mostrarArea();
		recebaArea = fg6.mostrarAreaComRetorno();
		System.out.println("");
		

		Losango fg7 = new Losango();
		fg7.recebeDiagonalMaior(10);
		fg7.recebeDiagonalMenor(8);
		fg7.calcArea();
		fg7.mostrarArea();
		recebaArea = fg7.mostrarAreaComRetorno();
		System.out.println("");
		
		Hexagono  fg8 = new Hexagono();
		fg8.recebeLado(3);
		fg8.calcArea();
		fg8.mostrarArea();
		recebaArea = fg8.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Circulo  fg9 = new Circulo();
		fg9.recebeRaio(5);
		fg9.calcArea();
		fg9.mostrarArea();
		recebaArea = fg9.mostrarAreaComRetorno();
		System.out.println("");
		
	}
}