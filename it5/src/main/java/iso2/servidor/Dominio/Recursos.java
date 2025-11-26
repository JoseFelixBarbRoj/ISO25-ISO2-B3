package iso2.servidor.Dominio;

public class Recursos {

    public boolean comprobar_derechos(int id) {
        System.out.println("[Recursos] Comprobando derechos para id: " + id);
        return true;
    }

    public String enviarRecursos() {
        System.out.println("[Recursos] Enviando recursos al cliente...");
        return "recursos_servidor";
    }
}
