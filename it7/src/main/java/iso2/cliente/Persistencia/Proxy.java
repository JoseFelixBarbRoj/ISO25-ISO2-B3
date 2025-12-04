package iso2.cliente.Persistencia;

import iso2.servidor.Persistencia.Agente;

public class Proxy {

    public Proxy() {
        System.out.println("[Proxy] Creado proxy de conexión.");
    }

    public Proxy getProxy() {
        System.out.println("[Proxy] Retornando instancia Proxy.");
        return this;
    }

    public boolean subirSolicitud(int id) {
        System.out.println("[Proxy] Subiendo solicitud con ID: " + id);

        Agente a = new Agente();
        a.insert("INSERT INTO solicitudes VALUES (" + id + ")");
        return true;
    }

}
