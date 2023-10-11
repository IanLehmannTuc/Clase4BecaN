package main;

import ejercicios.*;

public class Main {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=0;
		int n3=0;
		boolean orden;
		Clase4 c4 = new Clase4();
		
		if(args.length<4) {
			c4.ingresarPorConsola();
		}
		else {
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			n3 = Integer.parseInt(args[2]);
			orden = Boolean.parseBoolean(args[3]);
			c4.ordenarNumeros(n1, n2, n3, orden);
		}
		
	}

}
