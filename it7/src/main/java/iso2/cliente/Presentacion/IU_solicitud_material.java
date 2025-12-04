package iso2.cliente.Presentacion;

import iso2.cliente.Dominio.Control_solicitudes;
import iso2.servidor.Presentacion.IU_registro_solicitud;

public class IU_solicitud_material {

    public void solicitarMaterial() {
        System.out.println("[IU_solicitud_material] Iniciando solicitud de material...");

        int id = 100; // Simulación

        Control_solicitudes cs = new Control_solicitudes();
        boolean ok = cs.enviarSolicitud(id);

        if (ok) {
            System.out.println("[IU_solicitud_material] Solicitud enviada correctamente.");
        } else {
            System.out.println("[IU_solicitud_material] Error en la solicitud.");
        }

        IU_registro_solicitud ir = new IU_registro_solicitud();
        ir.procesarSolicitud(id);

        System.out.println("[IU_solicitud_material] Flujo completado.");
    }

    public static void main(String[] args) {
        IU_solicitud_material iu = new IU_solicitud_material();
        iu.solicitarMaterial();
    }

}
