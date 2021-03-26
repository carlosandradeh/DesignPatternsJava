package patronesEstructurales.adapter;

/** ConexionMYSQL que implementa el comportamiento de ConexionSQL. */
public class ConexionMySQL implements ConexionSQL {

    /**
     * Método que realiza una conexión como ConexionSQL
     */
    @Override
    public void conexion() {
        System.out.println("Conexión con MySQL");
    }

    /**
     * Método que corre consultas como una ConexionSQL.
     * 
     * @return String
     */
    @Override
    public String runQuery() {
        return "Consulta MySQL";
    }
}
