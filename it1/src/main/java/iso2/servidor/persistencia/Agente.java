package iso2.servidor.persistencia;

import java.util.ArrayList;

public class Agente {

    public Agente() {
        System.out.println("Agente servidor: Constructor");
    }

    public Agente getAgente() {
        System.out.println("Agente servidor: Obteniendo agente");
        return new Agente();
    }

    /**
     * 
     * @param login
     */
    public ArrayList<Object> select(String SQL) {
        System.out.println("Agente servidor: Seleccionando SQL = " + SQL);
        return new ArrayList<Object>();
    }

}
