package patronesCreacionales.singleton;

/**
 * Clase ConexionDB Singleton, nos asegura que solo me manejará una y solo una
 * instancia de esta clase.
 */
public class ConexionDB {

    // Atributo para asegurarnos que solo hay una instancia.
    private static ConexionDB conexion;
    // Atributo para mostar como ejemplo que solo existirá una instancia.
    public String host;

    /** Constructor privado para evitar la creación de más instancias. */
    private ConexionDB() {
    }

    /**
     * Método para crear una y sola una instancia.
     * 
     * @return ConexiónBD que será la ya creada anteriormente o si no se ha creado,
     *         una nueva.
     */
    public static ConexionDB obtenerConexion() {
        if (conexion == null) { // Si no se ha instanciado
            conexion = new ConexionDB();
        }
        return conexion;
    }
}
