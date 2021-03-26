package patronesComportamiento.state;

/**
 * Clase Auto que tendrá tres estados:
 * 
 * Encendido : Se puede mover y Se puede apagar. 
 * En movimiento: Ya está encendido y Se puede apagar. 
 * Apagado: Se puede encender y No se puede manejar.
 */
public class Auto implements EstadoAuto {

    // Estado del auto encendido.
    private EstadoAuto autoEncendido;
    // Estado del auto en movimiento.
    private EstadoAuto autoMovimiento;
    // Estado del auto apagado.
    private EstadoAuto autoApagado;

    // Estado en el que se encuentra ahora el Auto.
    private EstadoAuto actual;

    /**
     * Constructor de Auto que inicializa los estados del Auto y define un estado
     * actual apagado.
     */
    public Auto() {
        this.autoEncendido = new AutoEncender(this);
        this.autoMovimiento = new AutoManejar(this);
        this.autoApagado = new AutoApagar(this);
        this.actual = this.autoApagado;
    }

    @Override
    public void encender() {
        actual.encender();
    }

    @Override
    public void manejar() {
        actual.manejar();
    }

    @Override
    public void apagar() {
        actual.apagar();
    }

    /** Método que establece un nuevo estado atual del Auto.
     * @param actual Estado nuevo en el que se enuentra.
     */
    public void setEstadoActual(EstadoAuto actual) {
        this.actual = actual;
    }

    public EstadoAuto getAutoEncendido() {
        return autoEncendido;
    }

    public EstadoAuto getAutoMovimiento() {
        return autoMovimiento;
    }

    public EstadoAuto getAutoApagado() {
        return autoApagado;
    }
}
