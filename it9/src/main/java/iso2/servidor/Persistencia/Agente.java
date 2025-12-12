package iso2.servidor.Persistencia;

public class Agente {

    public Agente() {
        System.out.println("[Agente] Conexión inicializada.");
    }

    public Agente getAgente() {
        System.out.println("[Agente] Retornando instancia Agente.");
        return this;
    }

    public int insert(String SQL) {
        System.out.println("[Agente] Ejecutando SQL: " + SQL);
        return 1;
    }

}
