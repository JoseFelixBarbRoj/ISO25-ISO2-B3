package iso2.cliente.dominio;

public class Controlador_autenticacion {

    /**
     * 
     * @param login
     * @param pass
     */
    public boolean guardarDatosLogin(String login, String pass) {
        System.out.println("Controlador_autenticacion: Guardando login = " + login + ", pass = " + pass);
        return true;
    }

}
