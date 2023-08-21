import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de euros: ");
        double euros = scanner.nextDouble();

        System.out.print("Introduce la moneda a la que deseas convertir (dolares/yenes/libras): ");
        String monedaDestino = scanner.next();

        convertirMoneda(euros, monedaDestino);
    }

    public static void convertirMoneda(double euros, String monedaDestino) {
        double tipoCambio = 0;

        switch (monedaDestino) {
            case "dolares":
                tipoCambio = 1.28611;
                break;
            case "yenes":
                tipoCambio = 129.852;
                break;
            case "libras":
                tipoCambio = 0.86;
                break;
            default:
                System.out.println("Moneda no valida.");
                return;
        }

        double cantidadConvertida = euros * tipoCambio;
        System.out.printf("%.2f euros es equivalente a %.2f %s%n", euros, cantidadConvertida, monedaDestino);
    }

}
