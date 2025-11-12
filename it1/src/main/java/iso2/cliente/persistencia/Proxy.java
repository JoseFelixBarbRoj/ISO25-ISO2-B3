package iso2.cliente.persistencia;

public class Proxy {

    public Proxy getProxy() {
        System.out.println("Proxy cliente: Obteniendo agente");
        return new Proxy();
    }

    public Proxy() {
        System.out.println("Proxy cliente: Constructor");
    }

    /**
     * 
     * @param SQL
     */
    public boolean inicioSesion(String login, String pass) {
        System.out.println("Proxy cliente: Iniciando sesión para usuario = " + login);
        return true;
    }

}
