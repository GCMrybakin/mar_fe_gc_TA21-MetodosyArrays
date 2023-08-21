import java.util.Scanner;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor minimo: ");
        int min = scanner.nextInt();
        System.out.print("Introduce el valor maximo: ");
        int max = scanner.nextInt();
        System.out.print("Introduce la cantidad de números a generar: ");
        int cantidadNumeros = scanner.nextInt();

        generarYMostrarNumerosAleatorios(min, max, cantidadNumeros);

        scanner.close();
    }

    public static void generarYMostrarNumerosAleatorios(int min, int max, int cantidad) {
        Random random = new Random();
        System.out.println("Numeros aleatorios generados:");

        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = generarNumeroAleatorio(min, max);
            System.out.println(numeroAleatorio);
        }
    }

    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
