// 📁 Operacion.java (INTERFAZ)
public interface Operacion {
    double calcular();
}

// 📁 OperacionBase.java (CLASE ABSTRACTA)
public abstract class OperacionBase implements Operacion {
    protected double a, b;
    public OperacionBase(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
