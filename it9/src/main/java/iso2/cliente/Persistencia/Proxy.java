package iso2.cliente.Persistencia;

import iso2.servidor.Persistencia.Agente;

public class Proxy {

    public Proxy() {
        System.out.println("[Proxy] Iniciado Proxy de Persistencia.");
    }

    public Proxy getProxy() {
        System.out.println("[Proxy] Retornando instancia del Proxy.");
        return this;
    }

    public boolean hacerReservaSala(int sala) {
        System.out.println("[Proxy] Procesando reserva en la base de datos para sala: " + sala);

        Agente a = new Agente();
        a.insert("INSERT INTO reservas VALUES (" + sala + ")");
        return true;
    }

}
