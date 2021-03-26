package patronesCreacionales.singleton;

public class Main {
    public static void main(String[] args) {
        ConexionDB conexion1 = ConexionDB.obtenerConexion();
        ConexionDB conexion2 = ConexionDB.obtenerConexion();
        ConexionDB conexion3 = ConexionDB.obtenerConexion();

        conexion1.host = "local host";
        
        // Van a ser la misma instancia
        System.out.println(conexion1);
        System.out.println(conexion2);
        System.out.println(conexion3);

        //Van a tener el mismo host ya que modificamos uno de ellos y son los mismos.
        System.out.println(conexion1.host);
        System.out.println(conexion2.host);
        System.out.println(conexion3.host);
    }
}
