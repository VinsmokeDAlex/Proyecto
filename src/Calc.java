import java.util.Scanner;
     //Hacer una calculadora 
public class Calc {
	
		//Pedir entrada
	Scanner sc = new Scanner(System.in);
		
      System.out.println("Ingresa un numero: ");
      Scanner entrada = new Scanner (System.in);
      double i = entrada.nextDouble()
        // Evaluar la entrada para que sea un valor positivo, del punto 6°
        do {
         	if (i < 0) 
         		System.out.println("Numero invalido, ingrese un valor positivo: ");
         		Scanner entrada = new Scanner (System.in);
                double i = entrada.nextDouble();
        } while(i < 0);
        
      
      System.out.println("Selecciona una operacion: ");
      Scanner entrada1 = new Scanner (System.in);
      String g = entrada1.toString();
      // Seleccionar un enum para poder trabajar con los numeros, uso de Switch para los diferentes casos
      try {
        if (g == s)
        else(g==r)
        	
      }catch       
      
	   
	}
}
