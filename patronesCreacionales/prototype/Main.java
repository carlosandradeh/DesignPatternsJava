package patronesCreacionales.prototype;

public class Main {
    public static void main(String[] args) {

        // Contruimos enemigos a partir de un enemigo base con el constructor copia.
        Enemigo enemigoBase = new Enemigo("imagen.jpg", 10, 100, 2);
        Enemigo enemigo2 = new Enemigo(enemigoBase);
        Enemigo enemigo3 = new Enemigo(enemigoBase);
        enemigo2.setCantidadVida(15);
        enemigo3.setImagen("otraimagen.jpg");

        // Construimos enemigos a partir de un enemigo base con un método para clonar las
        // propiedades del enemigo base.
        Enemigo enemigoBase2 = new Enemigo("imagen2.jpg", 10, 100, 23);
        Enemigo enemigo4 = enemigoBase2.clone();
        Enemigo enemigo5 = enemigoBase2.clone();
        enemigo4.getImagen();
        enemigo5.setPosX(100);
    }
}
