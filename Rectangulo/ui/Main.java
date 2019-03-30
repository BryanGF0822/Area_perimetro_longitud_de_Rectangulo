package ui;

import model.*;

import java.util.Scanner;

public class Main{

	//Relations

	private Rectangulo control;


		public static void main(String[] args){

			Scanner entrada = new Scanner(System.in);

			Rectangulo r1;

			double weight, height;

			System.out. println("------------------------------------------------------------------------------");

			System.out. println("			DEPARTAMENTO DE MATEMATICAS - GOOGLE");

			System.out. println("------------------------------------------------------------------------------");

			System.out.println(" ");



			System.out.print("Escribe el alcho del rectangulo: ");
			weight = entrada.nextInt();

			System.out.print("Escribe la altura del rectangulo: ");
			height= entrada.nextInt();


			r1 = new Rectangulo(weight, height);

			System.out.println("El area del rectangulo es: " + r1.getCalcularArea());

			System.out.println("El perimetro del rectangulo es: " + r1.getCalcularPerimetro());

			System.out.println("La longitud de la diagonal es: " + r1.getCalcularLongitudDeLaDiagonal());

		}
}