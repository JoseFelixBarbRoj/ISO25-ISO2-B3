package iso2.servidor.Dominio;

public class Control_adquisiciones {

    public boolean obtenerSolicitud(int id) {
        System.out.println("[Control_adquisiciones] Obteniendo solicitud con ID: " + id);

        Solicitud_adquisicion sa = new Solicitud_adquisicion();
        return sa.registrarSolicitud(id);
    }

}
