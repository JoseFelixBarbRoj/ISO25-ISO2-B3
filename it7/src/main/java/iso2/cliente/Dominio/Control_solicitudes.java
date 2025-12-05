package iso2.cliente.Dominio;

import iso2.cliente.Persistencia.Proxy;

public class Control_solicitudes {

    public boolean enviarSolicitud(int id) {
        System.out.println("[Control_solicitudes] Enviando solicitud con ID: " + id);

        Usuario u = new Usuario();
        boolean enviado = u.mandarSolicitud(id);

        if (enviado) {
            Proxy p = new Proxy();
            return p.subirSolicitud(id);
        }

        System.out.println("[Control_solicitudes] Error al enviar la solicitud.");
        return false;
    }

}
