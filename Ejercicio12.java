import java.util.Scanner;
import java.util.Random;

public class Ejercicio12 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int size = scanner.nextInt();

        System.out.print("Introduce el digito (0-9): ");
        int digit = scanner.nextInt();
        
        if (digit < 0 || digit > 9) {
            System.out.println("Digito no valido. Debe estar entre 0 y 9.");
            return;
        }

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(300) + 1;
        }

        int[] filteredArray = new int[size];
        int count = 0;
        for (int num : array) {
            if (num % 10 == digit) {
                filteredArray[count] = num;
                count++;
            }
        }

        System.out.println("Numeros que terminan en " + digit + ":");
        for (int i = 0; i < count; i++) {
            System.out.println(filteredArray[i]);
        }
    }

}
