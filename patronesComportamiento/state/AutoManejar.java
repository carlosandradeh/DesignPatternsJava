package patronesComportamiento.state;

public class AutoManejar implements EstadoAuto {

    private final Auto auto;

    public AutoManejar(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void encender() {
        System.out.println("Auto ya encendido!");
    }

    @Override
    public void manejar() {
        System.out.println("Auto ya en movimiento!");
    }

    @Override
    public void apagar() {
        System.out.println("Auto apagado!");
        auto.setEstadoActual(auto.getAutoApagado());
    }
    
    
}
