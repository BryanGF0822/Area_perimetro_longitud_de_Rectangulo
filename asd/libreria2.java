package model;

import java.util.ArrayList;


public class Libreria{

	private String name;

	private String nit;

	private String location;

	private Arraylist<Libro> libros;


	//relations

	private Libro libros;

	//construcctor

	public Libreria(String name, String nit, String location){

		this.name = name;

		this.nit = nit;

		this.location = location;

		libros = new Arraylist();
	}

	public String getName(){

		return name;
	}

	public void setName(String name){

		this.name = name;
	}

	public String getNit(){

		return nit;
	}

	public void setNit(String nit){

		this.nit = nit;
	}

	public String getLocation(){

		return location;
	}

	public void setLocation(Sring location){

		this.location = location;
	}

	public void agregarLibro(int dia, int mes, int ano, String procedencia, int pags, Sbring nombreL, String nombreAutor, String isbn, boolean editado, int pos){
        boolean agrege = true;
		for(int i = 0;i<500;i++){
			
		}
	}

	public void darLibro(int pos){

		//libro
	}

	public void estaLibro(String name){

		//boolean
	}

	public void contarNacionales(){

		//int
	}

	public void contarPagsTotales(){

		//int
	}

	public void agregarLibro(int dia, int mes, int ano, String procedencia, int pags, String nombreLibro, String nombreAutor, String sbn, boolean editado){

		boolean agrege = false;
	}

	public void calcularTtoal(){

		//double
	}

}

