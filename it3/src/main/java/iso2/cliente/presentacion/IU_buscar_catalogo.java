package iso2.cliente.presentacion;

import iso2.cliente.dominio.Control_consulta;
import iso2.servidor.dominio.Catalogo;

public class IU_buscar_catalogo {

    public void consultarCatalogo() {
        System.out.println("[IU_buscar_catalogo] Introduciendo asignatura: Programación");

        Control_consulta cc = new Control_consulta();
        Catalogo catalogo = cc.obtenerCatalogo("Programación");

        if (catalogo != null) {
            System.out.println("[IU_buscar_catalogo] Catálogo recibido y mostrado al usuario.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Búsqueda de catálogo ===");
        IU_buscar_catalogo ui = new IU_buscar_catalogo();
        ui.consultarCatalogo();
        System.out.println("=== Fin de la búsqueda ===");
    }
}
