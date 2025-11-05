package com.iteracion1.cliente.persistencia;

public class Agente {

    public void getAgente() {
        System.out.println("Agente cliente: Obteniendo agente");
    }

    public Agente() {
        System.out.println("Agente cliente: Constructor");
    }

    /**
     * 
     * @param SQL
     */
    public void insert(int SQL) {
        System.out.println("Agente cliente: Insertando SQL = " + SQL);
    }

}
