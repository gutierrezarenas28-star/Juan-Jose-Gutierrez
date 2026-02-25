public class ejercicio8 {
    //historial de mensajes
    public static void main(String[] args) {

        String ultimoMensaje = "Hola";
        String copiaTexto = ultimoMensaje;


        copiaTexto = "¿Cómo estás?";

        System.out.println("Último mensaje: " + ultimoMensaje);
        System.out.println("Copia del texto: " + copiaTexto);

        
         //EXPLICACIÓN:
         //En Java, String es inmutable, lo que significa que su contenido
         //no puede modificarse después de crearse.
    }
}
