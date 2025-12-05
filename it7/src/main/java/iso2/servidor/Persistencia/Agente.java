package iso2.servidor.Persistencia;

public class Agente {

    public Agente() {
        System.out.println("[Agente] Conexion inicializada.");
    }

    public Agente getAgente() {
        System.out.println("[Agente] Retornando agente.");
        return this;
    }

    public int insert(String SQL) {
        System.out.println("[Agente] Ejecutando SQL: " + SQL);
        return 1;
    }

}
