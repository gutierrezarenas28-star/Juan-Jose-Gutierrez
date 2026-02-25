public class ejercicio3 {
    public static void main(String[] args) {
        
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
