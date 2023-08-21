import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int size = scanner.nextInt();
        System.out.print("Introduce el valor mínimo: ");
        int min = scanner.nextInt();
        System.out.print("Introduce el valor máximo: ");
        int max = scanner.nextInt();

        int[] primeArray = generarArrayRandomdePrimos(size, min, max);
        System.out.println("Array de numeros primos generados: " + Arrays.toString(primeArray));

        int maxPrime = encontrarMaximo(primeArray);
        System.out.println("El mayor numero primo es: " + maxPrime);
    }

    public static int[] generarArrayRandomdePrimos(int size, int min, int max) {
        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (esPrimo(i)) {
            	primos.add(i);
            }
        }

        int[] primosArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
        	primosArray[i] = primos.get(random.nextInt(primos.size()));
        }

        return primosArray;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int encontrarMaximo(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

}
