public class ejercicio5 {
    public static void main(String[] args) {
        
        // conversor de unidades
        double tazas = 2.5;

        // Conversión a mililitros
        double mililitros = tazas * 236.588;

        // Conversión a litros
        double litros = mililitros / 1000;

        // Mostrar resultados
        System.out.println("Tazas: " + tazas);
        System.out.println("Mililitros: " + mililitros);
        System.out.println("Litros: " + litros);
    }
}
