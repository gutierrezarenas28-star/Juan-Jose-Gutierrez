public class Ejercicios_practicos {
    
    public static void main(String[] args) {

        //Ficha del estudiante

        String nombre= "Juan Jose";
        int codigo= 1234;
        int semestre=6;
        double promedio=4.0;
        boolean matriculado= true;

        System.out.println("===Ficha del Estudiante===");
        System.out.println("Nombre: "+ nombre+  "\nCodigo: " + codigo+ "\nSemestre: "+ semestre
            + "\nPromedio: "+ promedio+ "\nMatriculado: "+ matriculado
        );


        //calculadora de una tienda
        double precioProducto=1200;
        int cantidad=5;
        double descuento=0.20;

        double totalDes=(precioProducto*cantidad)*descuento;
        double toPagar=(precioProducto*cantidad)-totalDes;
        System.out.println("el valor a pagar es: "+toPagar);

        //sensor de temperatura

        double temperatura=86.5;
        String nomSensor="Dia";
        int numLectura=1;
        boolean enAlarma=true;
        double temLimite=80;

        if (temperatura>=temLimite) {
            System.out.println(enAlarma);
        }
        


    }
    
}
