package com.iteracion1.cliente.presentacion;

import com.iteracion1.cliente.dominio.Controlador_autenticacion;
import com.iteracion1.cliente.dominio.Usuario;
import com.iteracion1.cliente.persistencia.Agente;

import com.iteracion1.servidor.dominio.Controlador_sesion;
import com.iteracion1.servidor.dominio.UsuarioServ;
import com.iteracion1.servidor.persistencia.AgenteS;
import com.iteracion1.servidor.presentacion.Interfaz_sso_universidad;

public class Pantalla_login_sso {

    public void obtenerDatosLogin() {
        System.out.println("Pantalla_login_sso: Obteniendo datos de login del usuario");
    }

    public static void main(String[] args) {
        System.out.println("=== Pantalla de login SSO de la universidad ===");

        // Simular obtener datos de login
        Pantalla_login_sso pantalla = new Pantalla_login_sso();
        pantalla.obtenerDatosLogin();
        int login = 1234;
        int pass = 5678;
        System.out.println("Datos ingresados por el usuario: login=" + login + ", pass=" + pass);

        // Cliente: Guardar login en el controlador
        Controlador_autenticacion controlador = new Controlador_autenticacion();
        controlador.guardarDatosLogin(login, pass);

        // Cliente: Usuario envía login
        Usuario usuarioCliente = new Usuario();
        usuarioCliente.enviarLogin(login, pass);

        // Cliente: Guardar en persistencia
        Agente agenteCliente = new Agente();
        agenteCliente.getAgente();
        agenteCliente.insert(login);

        // Servidor: Usuario recibe login
        UsuarioServ usuarioServ = new UsuarioServ();
        usuarioServ.recibirDatosLogin(login, pass);

        // Servidor: Comprobar login
        Controlador_sesion controladorServ = new Controlador_sesion();
        controladorServ.comprobarDatosLogin(login, pass);

        // Servidor: Persistencia
        AgenteS agenteServidor = new AgenteS();
        agenteServidor.getAgente();
        agenteServidor.select(login);

        // Servidor: Presentación/validación final
        Interfaz_sso_universidad interfaz = new Interfaz_sso_universidad();
        interfaz.validarDatosLogin();

        System.out.println("=== Proceso de login completado ===");
    }
}
