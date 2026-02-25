public class ejercicio9 {

    //notas de un curso
    public static void main(String[] args) {

        
        double[] notasProfesor = {4.0, 2.5, 3.8, 4.5};

        double[] notasCoordinador = notasProfesor;

        notasCoordinador[1] = 3.0;

       
        System.out.println("Notas vistas por el profesor:");
        for (int i = 0; i < notasProfesor.length; i++) {
            System.out.println("Estudiante " + i + ": " + notasProfesor[i]);
        }

        
        System.out.println("\nNotas vistas por el coordinador:");
        for (int i = 0; i < notasCoordinador.length; i++) {
            System.out.println("Estudiante " + i + ": " + notasCoordinador[i]);
        }

        
        // EXPLICACIÓN:
        //En Java, los arreglos son objetos y se manejan por referencia.

    // Cuando hacemos:
      //  double[] notasCoordinador = notasProfesor;
        // ambas variables apuntan al MISMO arreglo en memoria.
    }
}
