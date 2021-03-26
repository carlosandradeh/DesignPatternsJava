package patronesComportamiento.state;

public class AutoApagar implements EstadoAuto {

    private final Auto auto;

    public AutoApagar(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void encender() {
        System.out.println("Auto encendido!");
        auto.setEstadoActual(auto.getAutoEncendido());
    }

    @Override
    public void manejar() {
        System.out.println("Auto no se puede manejar si está apagado!");
    }

    @Override
    public void apagar() {
        System.out.println("Auto ya apagado!");
    }
    
}
