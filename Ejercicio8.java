import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
        int[] array = new int[10];
        
        llenarArray(array);
        mostrarArray(array);
    }
    
    public static void llenarArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 10 numeros:");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
    }
    
    public static void mostrarArray(int[] arr) {
        System.out.println("Indice\tValor");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}
