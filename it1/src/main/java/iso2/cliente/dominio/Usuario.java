package iso2.cliente.dominio;

public class Usuario {

    /**
     * 
     * @param login
     * @param pass
     */
    public boolean enviarLogin(String login, String pass) {
        System.out.println("Usuario: Enviando login = " + login + ", pass = " + pass);
        return true;
    }

}
