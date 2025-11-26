package iso2.cliente.Dominio;

public class Usuario {

    public boolean validar_derechos() {
        System.out.println("[Usuario] validando derechos...");
        return true;
    }

    public String obtener_recursos() {
        System.out.println("[Usuario] obteniendo recursos...");
        return "recursos_del_usuario";
    }

    public boolean comprobarDerechos() {
        System.out.println("[Usuario] comprobando derechos...");
        return validar_derechos();
    }

    public String pedirRecursos() {
        System.out.println("[Usuario] pidiendo recursos...");
        return obtener_recursos();
    }
}
