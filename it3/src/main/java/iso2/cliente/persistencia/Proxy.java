package iso2.cliente.persistencia;

import iso2.servidor.dominio.Catalogo;
import iso2.servidor.dominio.Control_catalogo;

public class Proxy {

    public Proxy() {}

    public Proxy getProxy() {
        return this;
    }

    public Catalogo pedirCatalogo(String asignatura, int idEstudiante) {
        System.out.println("[Proxy] Pidiendo catálogo al servidor...");
        Control_catalogo cc = new Control_catalogo();
        return cc.cargarCatalogo(asignatura, idEstudiante);
    }
}
