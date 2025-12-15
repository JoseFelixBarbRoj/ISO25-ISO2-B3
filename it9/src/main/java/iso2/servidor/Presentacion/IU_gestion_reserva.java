package iso2.servidor.Presentacion;

import iso2.servidor.Dominio.Control_reserva;

public class IU_gestion_reserva {

    public boolean obtenerReserva(int sala) {
        System.out.println("[IU_gestion_reserva] Obteniendo información de reserva para sala: " + sala);

        Control_reserva cr = new Control_reserva();
        return cr.almacenarReserva(sala);
    }

}
