package iso2.cliente.Presentacion;

import iso2.cliente.Dominio.Control_reserva_sala;
import iso2.servidor.Presentacion.IU_gestion_reserva;

public class IU_reserva_sala {

    public void introducirDatosReserva() {
        System.out.println("[IU_reserva_sala] Introduciendo datos para una reserva...");

        int sala = 3; // Ejemplo de sala a reservar

        Control_reserva_sala crs = new Control_reserva_sala();
        boolean ok = crs.guardarDatosReserva(sala);

        if (ok) {
            System.out.println("[IU_reserva_sala] Reserva realizada correctamente.");
        } else {
            System.out.println("[IU_reserva_sala] Error al realizar la reserva.");
        }

        IU_gestion_reserva ig = new IU_gestion_reserva();
        ig.obtenerReserva(sala);

        System.out.println("[IU_reserva_sala] Flujo de reserva completado.");
    }

    public static void main(String[] args) {
        IU_reserva_sala iu = new IU_reserva_sala();
        iu.introducirDatosReserva();
    }

}
