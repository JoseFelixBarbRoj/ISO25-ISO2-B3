package iso2.servidor.dominio;

public class UsuarioServ {

    /**
     * 
     * @param login
     * @param pass
     */
    public boolean recibirDatosLogin(String login, String pass) {
        System.out.println("UsuarioServ: Recibiendo login = " + login + ", pass = " + pass);
        return true;
    }

}
