import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println("El factorial de " + numero + " es " + factorial(numero));
    }
	
	public static int factorial(int numero) {
        int res = numero;
        for (int cont = (numero - 1); cont > 0; cont--) {
            res = res * cont;
        }
        return res;
    }
}
