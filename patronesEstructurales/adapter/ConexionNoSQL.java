package patronesEstructurales.adapter;

/** Interfaz que define el comportamiento de una ConexionNoSQL */
public interface ConexionNoSQL {
    /** Método que realizará la conexión NoSQL. */
    public void conexion();

    /** Método que ejecutaro sentencias NoSQL. */
    public String executeSentence();
}
