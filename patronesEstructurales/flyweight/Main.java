package patronesEstructurales.flyweight;

public class Main {
    public static void main(String[] args) {
        
        NubeFactory factory = new NubeFactory();

        for (int i = 0; i < 100; i++) {
            Nube nube = factory.getNube(TipoNube.Chica);   
        }

        for (int i = 0; i < 200; i++) {
            Nube nube = factory.getNube(TipoNube.Mediana);   
        }

        for (int i = 0; i < 300; i++) {
            Nube nube = factory.getNube(TipoNube.Grande);   
        }

        System.out.println("Cantidad de objetos tipo Nube creados: " + factory.countNubesMap());
    }
}
