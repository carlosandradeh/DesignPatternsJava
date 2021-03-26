package patronesComportamiento.state;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        
        // Realizamos cambios de estado sobre un automovil.
        auto.manejar();
        auto.encender();
        auto.apagar();
        auto.manejar();
        auto.encender();
        auto.manejar();
        auto.apagar();
    }
}
