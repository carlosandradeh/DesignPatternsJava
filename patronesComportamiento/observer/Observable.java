package patronesComportamiento.observer;

/**
 * Interfáz Observable que define los comportamientos de un objeto observable
 */
public interface Observable {
    /**
     * Método que agrega un Observador
     * 
     * @param observer nuevo observador
     */
    public void agregarObservador(Observer observer);

    /**
     * Método que notifica a todos los observadores.
     */
    public void notificarObservadores();

    /**
     * Método que elimina a un observador de un observable
     * 
     * @param observer observador a remover.
     */
    public void removerObservador(Observer observer);
}
