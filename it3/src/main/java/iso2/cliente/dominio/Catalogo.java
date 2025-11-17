package iso2.cliente.dominio;

public class Catalogo {

    public Catalogo solicitarCatalogo(String asignatura) {
        System.out.println("[Cliente.Catalogo] solicitando catálogo de: " + asignatura);

        // En el cliente simplemente devolvemos un catálogo local o simulamos la respuesta
        return new Catalogo();
    }

    public Catalogo buscarCatalogo(String asignatura) {
        System.out.println("[Cliente.Catalogo] buscando catálogo en caché/local...");

        // Simulación: no hay caché, retornamos null para forzar a usar Proxy
        return null;
    }
}
