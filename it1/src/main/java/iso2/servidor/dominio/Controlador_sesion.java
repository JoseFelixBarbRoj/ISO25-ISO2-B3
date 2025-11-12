package iso2.servidor.dominio;

public class Controlador_sesion {

    /**
     * 
     * @param login
     * @param pass
     */
    public boolean comprobarDatosLogin(String login, String pass) {
        System.out.println("Controlador_sesion: Comprobando login = " + login + ", pass = " + pass);
        return true;
    }

}
