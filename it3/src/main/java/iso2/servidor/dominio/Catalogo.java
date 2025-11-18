package iso2.servidor.dominio;

public class Catalogo {

    public Catalogo enviarCatalogo(String asignatura) {
        System.out.println("[Catalogo] Enviando catálogo de: " + asignatura);
        return this;
    }

    public Catalogo() {}
}
