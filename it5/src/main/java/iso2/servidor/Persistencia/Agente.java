package iso2.servidor.Persistencia;

import java.util.List;

public class Agente {

    public Agente() {
        System.out.println("[Agente] Inicializado.");
    }

    public Agente getAgente() {
        System.out.println("[Agente] devolviendo instancia del agente...");
        return this;
    }

    public List<Object> select(String SQL) {
        System.out.println("[Agente] Ejecutando SELECT: " + SQL);
        return null; // simula respuesta vacía
    }
}
