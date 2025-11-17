package iso2.cliente.dominio;

import iso2.cliente.persistencia.Proxy;
import iso2.servidor.dominio.Catalogo;

public class Control_consulta {

    public Catalogo obtenerCatalogo(String asignatura) {
        System.out.println("[Control_consulta] Solicitando catálogo...");

        Proxy proxy = new Proxy().getProxy();
        Catalogo cat = proxy.pedirCatalogo(asignatura, 1);

        System.out.println("[Control_consulta] Catálogo recibido.");
        return cat;
    }
}
