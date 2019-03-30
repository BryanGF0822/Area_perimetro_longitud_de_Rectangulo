package model;

public class Rectangulo{

	private double weight;

	private double height;



	public Rectangulo(double weight, double height){

		this.weight = weight;

		this.height = height;
	}

	
	public double getCalcularArea(){

		double area = weight * height;

		return area;
	}

	public double getCalcularPerimetro(){

		double perimetro = 2 * (weight + height);

		return perimetro;
	}

	public double getCalcularLongitudDeLaDiagonal(){

		double longitud = Math.sqrt(weight*weight + height*height);

		return longitud;
	}

}