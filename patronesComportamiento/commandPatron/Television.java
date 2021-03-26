package patronesComportamiento.commandPatron;

/** Clase Televisión que implementa el comportamiento de Dispositivo. */
public class Television implements Dispositivo {
    
    /**
     * Método que implementa de Dispitivo, mostrará un mensaje de televisión
     * prendida.
     */
    @Override
    public void on() {
        System.out.println("Television prendida");
    }

    /**
     * Método que implementa de Dispitivo, mostrará un mensaje de televisión
     * apagada.
     */
    @Override
    public void off() {
        System.out.println("Television apagada");
    }

}
