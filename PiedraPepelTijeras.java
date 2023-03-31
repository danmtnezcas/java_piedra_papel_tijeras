import java.util.Scanner;

public class PiedraPepelTijeras {
    // Constantes para las opciones disponibles
    private static final String PIEDRA = "P";
    private static final String PAPEL = "L";
    private static final String TIJERAS = "T";
    private static final String SALIR = "S";

    private static final String[] JUEGO = {PIEDRA, PAPEL, TIJERAS};

    private static final int EMPATE = 0;
    private static final int GANAS = 1;
    private static final int PIERDES = 2;

    private static final int ERROR_NO_ENCONTRADA = -1;

    // Mensajes al usuario
    private static final String BIENVENIDA = "Bienvenido al juego Piedra-Papel-Tijeras";
    private static final String OPCIONES = PIEDRA + " (piedra), " + PAPEL + " (papel), " + TIJERAS + " (tijeras) o " + SALIR + " (salir)";
    private static final String PEDIR_JUGADA = "¿Cuál es tu jugada? " + OPCIONES;
    private static final String PEDIR_NUEVA_JUGADA = "¿Cuál es tu nueva jugada? " + OPCIONES;
    private static final String MSJ_ERROR_NO_ENCONTRADA = "No entiendo tu jugada";
    private static final String FIN = "Fin de la partida";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Instrucciones
        System.out.println(BIENVENIDA);
        System.out.println(PEDIR_JUGADA);

        while(true) {
            // Jugada del ordenador
            int elecionPC = (int) (Math.random() * JUEGO.length);

            // Jugada del usuario
            String sEleccionUsuario = s.next();

            if (sEleccionUsuario.equalsIgnoreCase(SALIR)) {
                break;
            }

            // Interpretación de la jugada del usuario
            int eleccionUsuario = convertir(sEleccionUsuario);
            if (eleccionUsuario == ERROR_NO_ENCONTRADA) {
                System.err.println(MSJ_ERROR_NO_ENCONTRADA);
            }

            // Calcular el ganador de la jugada
            int resultado = usuarioGana(elecionPC, eleccionUsuario);

            // Mostrar el resultado de la jugada
            switch (resultado) {
                case GANAS:
                System.out.println("¡Enhorabuena! Tu " + JUEGO[eleccionUsuario] + " gana a " + JUEGO[elecionPC]);
                break;
                case PIERDES:
                System.out.println("¡Lo siento Tu " + JUEGO[eleccionUsuario] + " pierde ante " + JUEGO[elecionPC]);
                break;
                case EMPATE:
                System.out.println("¡Empate a " + JUEGO[eleccionUsuario] + "!");
                break;
            }

            System.out.println(PEDIR_NUEVA_JUGADA);
        }

        System.out.println(FIN);
        // Cerramos lo que abrimos
        s.close();
    }

    private static int convertir(String sEleccionUsuario) {
        for (int i = 0; i < JUEGO.length; ++i) {
            if (JUEGO[i].equalsIgnoreCase(sEleccionUsuario)) {
                return i;
            }
        }
        return ERROR_NO_ENCONTRADA;
    }

    private static int usuarioGana(int eleccionPC, int eleccionUsuario) {
        int res = eleccionUsuario - eleccionPC;
        if (res < 0) {
            res += JUEGO.length;
        }
        return res;
    }
}
