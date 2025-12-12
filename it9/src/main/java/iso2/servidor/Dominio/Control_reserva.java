package iso2.servidor.Dominio;

public class Control_reserva {

    public boolean almacenarReserva(int sala) {
        System.out.println("[Control_reserva] Almacenando datos de reserva para sala: " + sala);

        Reserva r = new Reserva();
        return r.leerReserva(sala);
    }

}
