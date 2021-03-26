package patronesComportamiento.state;

public class AutoEncender implements EstadoAuto {

    private final Auto auto;

    public AutoEncender(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void encender() {
        System.out.println("Auto ya encendido!");
    }

    @Override
    public void manejar() {
        System.out.println("Auto en movimiento!");
        auto.setEstadoActual(auto.getAutoMovimiento());
    }

    @Override
    public void apagar() {
        System.out.println("Auto apagado!");
        auto.setEstadoActual(auto.getAutoApagado());
    }

}
