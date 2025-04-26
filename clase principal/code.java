import java.util.*;

public class CalculadoraPOO {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> resultados = new ArrayList<>();

        int opcion;
        do {
            mostrarMenu();
            opcion = leerInt("Seleccione una opción:");

            if (opcion == 4) {
                System.out.println("👋 Saliendo...");
                break;
            }

            double a = leerDouble("Ingrese el primer número:");
            double b = leerDouble("Ingrese el segundo número:");
            Operacion operacion = null;

            switch (opcion) {
                case 1: operacion = new Suma(a, b); break;
                case 2: operacion = new Resta(a, b); break;
                case 3: operacion = new Potencia(a, b); break;
                default:
                    System.out.println("⚠️ Opción inválida.");
                    continue;
            }

            double resultado = operacion.calcular();
            resultados.add(resultado);
            System.out.println("✅ Resultado: " + resultado);

        } while (true);

        System.out.println("\n📜 Historial de resultados:");
        for (double res : resultados) {
            System.out.println("  ➤ " + res);
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Potencia");
        System.out.println("4. Salir");
    }

    public static int leerInt(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje + " ");
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Ingrese un número válido.");
                sc.next();
            }
        }
    }

    public static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje + " ");
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Ingrese un número decimal válido.");
                sc.next();
            }
        }
    }
}
