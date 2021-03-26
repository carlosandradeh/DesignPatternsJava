package patronesEstructurales.adapter;

public class Main {
    public static void main(String[] args) {
        // En el fondo espera una ConexiónSQL pero con Adapter lo manejamos como una
        // conexión con una base de datos NoSQL.
        ConexionSQL baseDatos = new AdaptadorDB(new ConexionMongoDB());
        
        // Usamos los métodos de una ConexiónSQL pero nos dará el comportamiento de una
        // ConexionNoSQL.
        baseDatos.conexion();
        System.out.println(baseDatos.runQuery());
    }
}
