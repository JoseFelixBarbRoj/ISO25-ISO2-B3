package iso2.servidor.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private List<Asignatura> asignaturas;

    public Estudiante() {
        asignaturas = new ArrayList<>();
    }

    public boolean verificarAsignaturaMatriculada(String asignatura, int idEstudiante) {
        return asignaturas.stream().anyMatch(a -> a.getNombre().equals(asignatura));
    }
}
