package iso2.servidor.persistencia;

import java.util.ArrayList;
import java.util.List;

public class Agente {

    public Agente() {}

    public Agente getAgente() {
        return this;
    }

    public List<Object> select(String SQL) {
        System.out.println("[Agente] Ejecutando consulta SQL: " + SQL);
        return new ArrayList<>();
    }
}
