package iso2.cliente.persistencia;

public class Proxy {

    public Proxy() {
        System.out.println("[Proxy] inicializado.");
    }

    public Proxy getProxy() {
        System.out.println("[Proxy] devolviendo instancia de Proxy...");
        return this;
    }

    public boolean verificar() {
        System.out.println("[Proxy] verificando permisos...");
        return true;
    }

    public String conseguirRescursos() {
        System.out.println("[Proxy] consiguiendo recursos del servidor...");
        return "recursos_desde_el_servidor";
    }
}
