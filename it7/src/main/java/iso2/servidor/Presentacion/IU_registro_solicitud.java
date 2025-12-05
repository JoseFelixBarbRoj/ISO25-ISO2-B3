package iso2.servidor.Presentacion;

import iso2.servidor.Dominio.Control_adquisiciones;

public class IU_registro_solicitud {

    public boolean procesarSolicitud(int id) {
        System.out.println("[IU_registro_solicitud] Procesando solicitud con ID: " + id);

        Control_adquisiciones ca = new Control_adquisiciones();
        return ca.obtenerSolicitud(id);
    }

}
