package patronesEstructurales.adapter;

/** Clase ConexionMongoDB que implementa el comportamiento de ConexionNoSQL. */
public class ConexionMongoDB implements ConexionNoSQL {

    /**
     * Método que crea una conexión como una ConexionNoSQL.
     */
    @Override
    public void conexion() {
        System.out.println("Conexion MongoDB");
    }

    /**
     * Método para ejecutar sentencias como una ConexionNoSQL.
     * 
     * @return String
     */
    @Override
    public String executeSentence() {
        return "Consulta MongoDB";
    }

}
