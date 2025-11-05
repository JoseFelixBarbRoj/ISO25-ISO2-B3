package com.iteracion1.servidor.persistencia;

public class AgenteS {

    public AgenteS() {
        System.out.println("Agente servidor: Constructor");
    }

    public void getAgente() {
        System.out.println("Agente servidor: Obteniendo agente");
    }

    /**
     * 
     * @param SQL
     */
    public void select(int SQL) {
        System.out.println("Agente servidor: Seleccionando SQL = " + SQL);
    }

}
