package ejercicios;

import java.util.Scanner;

public class Clase4 {

	public void ordenarNumeros(int n1, int n2, int n3, boolean orden) {
		int i = 0;
		int vector[] = new int[3];
		vector[0] = n1;
		vector[1] = n2;
		vector[2] = n3;
		int bandera = n1;
		boolean validar = false;
		
		while(i<vector.length-1 || validar) {
			if(i==vector.length-1 && validar) {
				i=0;
				validar=false;
			}
			if(orden) {
				if(vector[i]>vector[i+1]) {
					bandera = vector[i];
					vector[i] = vector[i+1];
					vector[i+1] = bandera;
					validar = true;
				}
			}
			else {
				if(vector[i]<vector[i+1]) {
					bandera = vector[i];
					vector[i] = vector[i+1];
					vector[i+1] = bandera;
					validar = true;
				}
			}
			i++;
		}
		i=0;
		while(i<3) {
			System.out.println(vector[i]);
			i++;
		}
	}
	
	public void ingresarPorConsola() {
		Scanner scn = new Scanner(System.in);
		int i = 0;
		boolean boolOrden;
		int vector[] = new int[3];
		System.out.println("Por favor, ingrese el primer numero: ");
		vector[0] = Integer.parseInt(scn.nextLine());
		System.out.println("Por favor, ingrese el segundo numero: ");
		vector[1] = Integer.parseInt(scn.nextLine());;
		System.out.println("Por favor, ingrese el tercer numero: ");
		vector[2] = Integer.parseInt(scn.nextLine());;
		int bandera = vector[0];
		System.out.println("Desea que sea orden A = ascendente o D = descendente?: ");
		String orden = scn.nextLine().toUpperCase();
		if("A" == orden) {
			boolOrden = false;
		}
		else {
			boolOrden = true;
		}
		boolean validar = false;
		
		while(i<vector.length-1 || validar) {
			if(i==vector.length-1 && validar) {
				i=0;
				validar=false;
			}
			if(boolOrden) {
				if(vector[i]>vector[i+1]) {
					bandera = vector[i];
					vector[i] = vector[i+1];
					vector[i+1] = bandera;
					validar = true;
				}
			}
			else {
				if(vector[i]<vector[i+1]) {
					bandera = vector[i];
					vector[i] = vector[i+1];
					vector[i+1] = bandera;
					validar = true;
				}
			}
			i++;
		}
		i=0;
		while(i<3) {
			System.out.println(vector[i]);
			i++;
		}
	}
	
}
