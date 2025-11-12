package iso2.servidor.dominio;

public class UsuarioServ {

    /**
     * 
     * @param login
     * @param pass
     */
    public void recibirDatosLogin(String login, String pass) {
        System.out.println("UsuarioServ: Recibiendo login = " + login + ", pass = " + pass);
    }

}
