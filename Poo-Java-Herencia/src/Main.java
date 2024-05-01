//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una figura: 1) Circulo, 2) Triangulo, 3) Rectangulo");
        int opcion = scanner.nextInt();

        Figura figura;

        switch (opcion) {
            case 1:
                figura = new Circulo();
                // Solicitar datos del círculo y calcular área y perímetro
                break;
            case 2:
                figura = new Triangulo();
                // Solicitar datos del triángulo y calcular área y perímetro
                break;
            case 3:
                figura = new Rectangulo();
                // Solicitar datos del rectángulo y calcular área y perímetro
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        figura.calcularArea();
        figura.calcularPerimetro();

        System.out.println("El área es: " + figura.getArea());
        System.out.println("El perímetro es: " + figura.getPerimetro());
    }
}