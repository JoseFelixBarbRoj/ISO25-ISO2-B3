package iso2.cliente.dominio;

public class Catalogo {

    public Catalogo solicitarCatalogo(String asignatura) {
        System.out.println("[Cliente.Catalogo] solicitando catálogo de: " + asignatura);

        return new Catalogo();
    }

    public Catalogo buscarCatalogo(String asignatura) {
        System.out.println("[Cliente.Catalogo] buscando catálogo en caché/local...");
        Catalogo ca = new Catalogo();
        return ca;
    }
}
