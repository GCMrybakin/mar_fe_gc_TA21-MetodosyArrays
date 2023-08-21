import java.util.Scanner;
import java.util.Random;

public class Ejercicio11 {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Introduce la dimension de los arrays: ");
        int dimension = scanner.nextInt();
        scanner.close();

        int[] array1 = new int[dimension];
        int[] array2 = array1;

        llenarArrayConValoresRandom(array2);
        int[] resultadoArray = multiplicarArrays(array1, array2);

        System.out.println("Contenido del primer array:");
        resultadoArray(array1);

        System.out.println("\nContenido del segundo array:");
        resultadoArray(array2);

        System.out.println("\nContenido del array resultante:");
        resultadoArray(resultadoArray);
    }

    public static void llenarArrayConValoresRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static int[] multiplicarArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }
        return result;
    }

    public static void resultadoArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
