package iso2.cliente.persistencia;

public class Proxy {

    public void getProxy() {
        System.out.println("Proxy cliente: Obteniendo agente");
    }

    public Proxy() {
        System.out.println("Proxy cliente: Constructor");
    }

    /**
     * 
     * @param SQL
     */
    public void insert(int SQL) {
        System.out.println("Proxy cliente: Insertando SQL = " + SQL);
    }

}
