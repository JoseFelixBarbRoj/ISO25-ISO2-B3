package iso2.cliente.dominio;

public class Usuario {

    /**
     * 
     * @param login
     * @param pass
     */
    public void enviarLogin(int login, int pass) {
        System.out.println("Usuario: Enviando login = " + login + ", pass = " + pass);
    }

}
