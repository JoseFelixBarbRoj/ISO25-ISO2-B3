package iso2.cliente.Presentacion;

import iso2.cliente.Dominio.Usuario;
import iso2.cliente.Dominio.Control_verificacion;
import iso2.cliente.Dominio.Control_recursos;

public class IU_verificar {

    public void verificar_derechos() {
        System.out.println("[IU_verificar] Verificando derechos del usuario...");
    }

    public static void main(String[] args) {

        System.out.println("=== INICIO DEL SISTEMA ===");

        Usuario u = new Usuario();
        Control_verificacion cv = new Control_verificacion();
        Control_recursos cr = new Control_recursos();

        System.out.println("\n1) Comprobando derechos del usuario...");
        boolean ok = u.comprobarDerechos();

        if(ok && cv.comprobar_derechos()) {
            System.out.println("-> Derechos verificados correctamente");
        } else {
            System.out.println("-> Derechos NO válidos");
        }

        System.out.println("\n2) Pidiendo recursos...");
        String r1 = u.pedirRecursos();
        System.out.println("Usuario recibió: " + r1);

        System.out.println("\n3) Control_recursos los recoge...");
        String r2 = cr.recogerRecursos();
        System.out.println("Control_recursos recibió: " + r2);

        System.out.println("\n=== FIN DEL SISTEMA ===");
    }
}
