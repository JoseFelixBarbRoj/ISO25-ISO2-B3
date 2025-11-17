package iso2.servidor.dominio;

public class Control_catalogo {

    public Catalogo cargarCatalogo(String asignatura, int idEstudiante) {
        System.out.println("[Control_catalogo] Cargando catálogo desde BD...");

        // Simula verificación de asignatura
        if (!verificarAsignatura("asignatura")) {
            System.out.println("[Control_catalogo] Asignatura no válida.");
            return null;
        }

        Catalogo c = new Catalogo();
        return c.enviarCatalogo(asignatura);
    }

    public boolean verificarAsignatura(String asignatura) {
        System.out.println("[Control_catalogo] Verificando asignatura...");
        return true;
    }
}
