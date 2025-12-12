package iso2.cliente.Dominio;

import iso2.cliente.Persistencia.Proxy;

public class Control_reserva_sala {

    public boolean guardarDatosReserva(int sala) {
        System.out.println("[Control_reserva_sala] Guardando reserva para sala: " + sala);

        Usuario u = new Usuario();
        boolean ok = u.enviarDatosReserva(sala);

        if (ok) {
            Proxy p = new Proxy();
            return p.hacerReservaSala(sala);
        }

        System.out.println("[Control_reserva_sala] Error al guardar la reserva.");
        return false;
    }

}
