package patronesEstructurales.virtualProxy;

public class ProxyServicio implements IServicio {
    private IServicio servicio; //Costoso
    private Usuario usuario;

    public ProxyServicio(Usuario usuario) {
        this.usuario = usuario;
    }

    private IServicio obtenerServicio() {
        if (servicio == null)
            servicio = new Servicio();
        return servicio;
    }

    @Override
    public void leer() {
        obtenerServicio().leer();
    }

    @Override
    public void escribir() {
        if (usuario.getNivelṔermiso() >= 5)
            obtenerServicio().escribir();
        else
            throw new UnsupportedOperationException();
    }

    @Override
    public void actualizar() {
        if (usuario.getNivelṔermiso() >= 5)
            obtenerServicio().escribir();
        else
            throw new UnsupportedOperationException();
    }

    @Override
    public void eliminar() {
        if (usuario.getNivelṔermiso() >= 5)
            obtenerServicio().escribir();
        else
            throw new UnsupportedOperationException();
    }
}
