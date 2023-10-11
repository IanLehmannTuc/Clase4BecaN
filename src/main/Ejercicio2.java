package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		String archivo = args[0];
		String operacion = args[1];
		int acumulador = 0;
		if(operacion.equals("multiplicacion")){
				acumulador = 1;
		}
		try {
			for(String linea : Files.readAllLines(Paths.get(archivo))) {
				if(operacion.equals("suma")) {
					acumulador += Integer.parseInt(linea);
					
				}
				if(operacion.equals("multiplicacion")) {
					acumulador = acumulador * Integer.parseInt(linea);
					
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(acumulador);
	}
	
}
