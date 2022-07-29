import java.sql.Connection;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Conexion conexion = new Conexion();

        int opcion = 0;

        do {
            System.out.println("------------------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. crear mensaje");
            System.out.println("2. listar mensajes");
            System.out.println("3. eliminar mensajes");
            System.out.println("4. editar mensajes");
            System.out.println("5. salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    MensajesService.crearMensajes();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.borrarMensajes();
                    break;
                case 4:
                    MensajesService.editarMensajes();
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}