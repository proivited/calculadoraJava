package calculator;

import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {

		int primerNumero;
		int segundoNumero;
		int operacion = 0;
		String mensaje = "";
		Scanner leerprimerNumero = new Scanner(System.in); 
			System.out.println("Introduce tu primer numero:");
			primerNumero = leerprimerNumero.nextInt();
			
			System.out.println("Introduce tu segundo numero:");
			segundoNumero = leerprimerNumero.nextInt();
			
			System.out.println("Selecciona la opcion que quieras"
					+ " 1. Suma"
					+ " 2. Resta"
					+ " 3. Multiplicaion"
					+ " 4. Division");
			operacion = leerprimerNumero.nextInt();
		
		leerprimerNumero.close();
		
		
		switch(operacion) {
		case 1:
			mensaje ="El resultado de la suma es = " +
		(primerNumero + segundoNumero);
			break;
		case 2:
			mensaje ="El resultado de la resta es = " +
		(primerNumero - segundoNumero);
			break;
		case 3:
			mensaje ="El resultado de la multiplicacion es = " +
		(primerNumero * segundoNumero);
			break;
		case 4:
			mensaje ="El resultado de la division es = " +
		(primerNumero / segundoNumero);
			break;
			default:
				mensaje = "Tranquilo elige un numero del 1 al 4 para las "
						+ "opciones";
				break;
			
		}
		
		System.out.println("Tu primer numero es:" + primerNumero);
		System.out.println("Tu segundo numero es:" + segundoNumero);
		System.out.println( mensaje);
	}

}
