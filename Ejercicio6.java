import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero entero positivo: ");
        
        int numero = scanner.nextInt();
        
        if (numero >= 0) {
            int cifras = contarCifras(numero);
            System.out.println("El numero de cifras es: " + cifras);
        } else {
            System.out.println("El numero ingresado no es válido. Debe ser un entero positivo.");
        }
        scanner.close();
    }
    
    public static int contarCifras(int numero) {
    	int contador = 0;
    	if (numero == 0) {
            return 1;
        }
    	for (int i=numero;i>0;i/=10){
            contador++;
        }
        return contador;
    }

}
