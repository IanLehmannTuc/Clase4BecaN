package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio3 {
	
	public static String codificar(String palabra, int desplazamiento){

		String abecedario = "abcdefghijkmnñopqrstuvwxyz ";
		String palabraCodificada = "";
		char letra;
		char letraCodificada;
		int indice;
		int nuevoIndice;
		for(int i=0; i<palabra.length(); i++) {

			letra = palabra.charAt(i);
			indice = abecedario.indexOf(letra);
			if ((indice + desplazamiento) <= 26) {

				nuevoIndice = (indice + desplazamiento) % abecedario.length();
				letraCodificada = abecedario.charAt(nuevoIndice);
				palabraCodificada += letraCodificada;
			}
			else {
				nuevoIndice = ((indice + desplazamiento)-26) % abecedario.length();
				letraCodificada = abecedario.charAt(nuevoIndice);
				palabraCodificada += letraCodificada;
			}
		}
		return palabraCodificada;
	}
	
	public static String decodificar(String palabra, int desplazamiento){

		String abecedario = "abcdefghijkmnñopqrstuvwxyz ";
		String palabraCodificada = "";
		char letra;
		char letraCodificada;
		int indice;
		int nuevoIndice;
		for(int i=0; i<palabra.length(); i++) {

			letra = palabra.charAt(i);
			indice = abecedario.indexOf(letra);
			if ((indice + desplazamiento) <= 26) {

				nuevoIndice = (indice + desplazamiento) % abecedario.length();
				letraCodificada = abecedario.charAt(nuevoIndice);
				palabraCodificada += letraCodificada;
			}
			else {
				nuevoIndice = ((indice + desplazamiento)-26) % abecedario.length();
				letraCodificada = abecedario.charAt(nuevoIndice);
				palabraCodificada += letraCodificada;
			}
		}
		return palabraCodificada;
	}
	
	public static void main(String[] args) {
		
		String operacion = "";
		String archivoEntrada = "decodificacion.txt";
		String archivoSalida = "codificacion.txt";
		String palabraCodificada = "";
		int desplazamiento = 2;
		String palabra = null;
		try {
			for(String linea : Files.readAllLines(Paths.get(archivoEntrada))){
				if(operacion.equals("codificacion")) {
					palabraCodificada = codificar(linea, desplazamiento);
				}
				else {
					palabraCodificada = decodificar(linea, desplazamiento);
				}
			}
			Files.writeString(Paths.get(archivoSalida), palabraCodificada);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
			System.out.println("Palaba = " + palabra + " - Su codificacion es: " + palabraCodificada);
	}
	
	
}
