package iso2.cliente.Dominio;

public class Usuario {


    public boolean mandarSolicitud(int id) {
        System.out.println("[Usuario] Mandando solicitud con ID: " + id);
        return true;
    }


    public boolean entregarSolicitud(int id) {
        System.out.println("[Usuario] Entregando solicitud con ID: " + id);
        return true;
    }

}
