import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
        int numeroDecimal = scanner.nextInt();
        
        String binario = decimalToBinary(numeroDecimal);
        System.out.println("El numero " + numeroDecimal + " en binario es: " + binario);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder constBinario = new StringBuilder();
        
        while (decimal > 0) {
            int resto = decimal % 2;
            constBinario.insert(0, resto);
            decimal /= 2;
        }
        return constBinario.toString();
    }
}
