package patronesEstructurales.adapter;

/** Clase Adaptadora para poder usar dos clases incompatibles. */
public class AdaptadorDB implements ConexionSQL {

    // Atributo de tipo ConexiónNoSQL para poder adaptarlo.
    private ConexionNoSQL noSQL;

    /**
     * Construtor para adaptar una ConexionNoSQL como una ConexionSQL.
     * 
     * @param noSQL
     */
    public AdaptadorDB(ConexionNoSQL noSQL) {
        this.noSQL = noSQL;
    }

    /**
     * Método que adapta el método conexion de ConexionSQL al método conexion de
     * ConexionNoSQL.
     */
    @Override
    public void conexion() {
        noSQL.conexion();
    }

    /**
     * Método que adapta el método runQuery de ConexionSQL al método executeSentence
     * de ConexiónNoSQL.
     * 
     * @return String
     */
    @Override
    public String runQuery() {
        return noSQL.executeSentence();
    }
}