import java.util.Scanner;
import java.util.Random;

public class Ejercicio9 {
	private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int tamaño = scanner.nextInt();

        int[] array = generarArray(tamaño, 0, 9);

        mostrarArray(array);
        mostrarSuma(array);

        scanner.close();
    }

    private static int[] generarArray(int tamaño, int min, int max) {
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = generarNumeroAleatorio(min, max);
        }
        return array;
    }

    private static int generarNumeroAleatorio(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    private static void mostrarArray(int[] array) {
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }

    private static void mostrarSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        System.out.println("Suma de los valores: " + suma);
    }

}
