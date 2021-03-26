package patronesEstructurales.adapter;

/** Interfaz que define el comportamiento de una ConexionSQL */
public interface ConexionSQL {
    /** Método Conexion SQL */
    public void conexion();

    /** Método que ejecutará las consultas. */
    public String runQuery();
}
