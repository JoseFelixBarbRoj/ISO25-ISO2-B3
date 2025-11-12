package iso2.cliente.presentacion;

import iso2.cliente.dominio.Controlador_autenticacion;
import iso2.cliente.dominio.Usuario;
import iso2.cliente.persistencia.Proxy;

import iso2.servidor.dominio.Controlador_sesion;
import iso2.servidor.dominio.UsuarioServ;
import iso2.servidor.persistencia.Agente;
import iso2.servidor.presentacion.Interfaz_sso_universidad;

public class Pantalla_login_sso {

    public void obtenerDatosLogin() {
        System.out.println("Pantalla_login_sso: Obteniendo datos de login del usuario");
    }

    public static void main(String[] args) {
        System.out.println("=== Pantalla de login SSO de la universidad ===");

        // Simular obtener datos de login
        Pantalla_login_sso pantalla = new Pantalla_login_sso();
        pantalla.obtenerDatosLogin();
        String login = "usuario";
        String pass = "pass";
        String sql = "";
        System.out.println("Datos ingresados por el usuario: login=" + login + ", pass=" + pass);

        // Cliente: Guardar login en el controlador
        Controlador_autenticacion controlador = new Controlador_autenticacion();
        controlador.guardarDatosLogin(login, pass);

        // Cliente: Usuario envía login
        Usuario usuarioCliente = new Usuario();
        usuarioCliente.enviarLogin(login, pass);

        // Cliente: Guardar en persistencia
        Proxy proxyCliente = new Proxy();
        proxyCliente.getProxy();
        proxyCliente.inicioSesion(login, pass);

        // Servidor: Usuario recibe login
        UsuarioServ usuarioServ = new UsuarioServ();
        usuarioServ.recibirDatosLogin(login, pass);

        // Servidor: Comprobar login
        Controlador_sesion controladorServ = new Controlador_sesion();
        controladorServ.comprobarDatosLogin(login, pass);

        // Servidor: Persistencia
        Agente agenteServidor = new Agente();
        agenteServidor.getAgente();
        agenteServidor.select(sql);

        // Servidor: Presentación/validación final
        Interfaz_sso_universidad interfaz = new Interfaz_sso_universidad();
        interfaz.validarDatosLogin();

        System.out.println("=== Proceso de login completado ===");
    }
}
