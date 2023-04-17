package calculadora;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0, num2=0, opcion=0, total=0;
		
		System.out.println("diga los numeros");
		System.out.println("num 1");
		num1=Leer.datoInt();
		System.out.println("num 2");
		num2=Leer.datoInt();
		
		System.out.println("1- Sumar \n"
				+ "2- Restar \n"
				+ "3- Multiplicar \n"
				+ "4- Division \n"
				+ "5- Resto");
		
		opcion=Leer.datoInt();
		
		switch (opcion) {
		case 1:
			
			total=num1 + num2;
			
			System.out.println(num1 + "+" + num2 + "=" + total);
			
			break;
			
		case 2:
			
			total=num1 - num2;
			
			System.out.println(num1 + "-" + num2 + "=" + total);
			
			
			break;
		case 3:
	
			break;
		case 4:
	
			break;
		case 5:
	
			break;

		}
		
		
	}

}
