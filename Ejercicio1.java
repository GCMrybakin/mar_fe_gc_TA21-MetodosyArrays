import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una figura para calcular el área:");
        System.out.println("1. Circulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Cuadrado");
        int num = scanner.nextInt();

        double area = 0.0;

        switch (num) {
            case 1:
                System.out.println("Introduce el radio del circulo:");
                double circleRadius = scanner.nextDouble();
                area = calculateCircleArea(circleRadius);
                break;
            case 2:
                System.out.println("Introduce la base del triangulo:");
                double triangleBase = scanner.nextDouble();
                System.out.println("Introduce la altura del triangulo:");
                double triangleHeight = scanner.nextDouble();
                area = calculateTriangleArea(triangleBase, triangleHeight);
                break;
            case 3:
                System.out.println("Introduce el lado del cuadrado:");
                double squareSide = scanner.nextDouble();
                area = calculateSquareArea(squareSide);
                break;
            default:
                System.out.println("Opcion no válida.");
                scanner.close();
                return;
        }

        System.out.println("El area calculada es: " + area);
        scanner.close();
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

}
