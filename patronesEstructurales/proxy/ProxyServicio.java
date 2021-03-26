package patronesEstructurales.proxy;

public class ProxyServicio implements IServicio {
    private IServicio servicio;
    private Usuario usuario;

    public ProxyServicio(IServicio servicio, Usuario usuario) {
        this.servicio = servicio;
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        servicio.leer();
    }

    @Override
    public void escribir() {
        if (usuario.getNivelṔermiso() >= 5)
            servicio.escribir();
        else
            throw new UnsupportedOperationException();
    }

    @Override
    public void actualizar() {
        if (usuario.getNivelṔermiso() >= 5)
            servicio.escribir();
        else
            throw new UnsupportedOperationException();
    }

    @Override
    public void eliminar() {
        if (usuario.getNivelṔermiso() >= 5)
            servicio.escribir();
        else
            throw new UnsupportedOperationException();
    }
}
