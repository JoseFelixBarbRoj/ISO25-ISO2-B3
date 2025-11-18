package iso2.cliente.persistencia;

import iso2.servidor.dominio.Catalogo;

public class Proxy {

    public Proxy() {}

    public Proxy getProxy() {
        return this;
    }

    public Catalogo pedirCatalogo(String asignatura, int idEstudiante) {
        System.out.println("[Proxy] Pidiendo catálogo al servidor...");
        return new Catalogo();
    }
}
