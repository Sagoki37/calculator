// 📁 Suma.java
public class Suma extends OperacionBase {
    public Suma(double a, double b) {
        super(a, b);
    }

    public double calcular() {
        return a + b;
    }
}

// 📁 Resta.java
public class Resta extends OperacionBase {
    public Resta(double a, double b) {
        super(a, b);
    }

    public double calcular() {
        return a - b;
    }
}

// 📁 Potencia.java
public class Potencia extends OperacionBase {
    public Potencia(double base, double exponente) {
        super(base, exponente);
    }

    public double calcular() {
        return calcularPotencia((int) a, (int) b);
    }

    private long calcularPotencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * calcularPotencia(base, exp - 1);
    }
}
