
public class PiedraPepelTijeras {
    // Constantes para las opciones disponibles
    private static final String PIEDRA = "P";
    private static final String PAPEL = "L";
    private static final String TIJERAS = "T";
    private static final String SALIR = "S";

    // Mensajes al usuario
    private static final String BIENVENIDA = "Bienvenido al juego Piedra-Papel-Tijeras";
    private static final String PEDIR_JUGADA = "¿Cuál es tu jugada? " + PIEDRA + " (piedra), " + PAPEL + " (papel), " + TIJERAS + " (tijeras) o " + SALIR + " (salir)";

    public static void main(String[] args) {
        // Instrucciones
        System.out.println(BIENVENIDA);
        System.out.println(PEDIR_JUGADA);
        
    }
}
