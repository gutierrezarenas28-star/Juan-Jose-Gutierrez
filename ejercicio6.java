public class ejercicio6 {

    //variables por referencia
    public static void main(String[] args) {
        int turnoActual = 25;
        int turnoEnPantalla = turnoActual;

        // Cambiamos el valor de la copia
        turnoEnPantalla = 30;

        // Mostramos resultados
        System.out.println("Turno actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);

        /*
         EXPLICACIÓN:
         En Java, los tipos primitivos (como int) se pasan por valor.
         Esto significa que turnoEnPantalla recibe una COPIA del valor
         de turnoActual, no la misma variable.

         Por eso, al modificar turnoEnPantalla, turnoActual no cambia.
        */

    }
}
