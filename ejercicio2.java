public class ejercicio2 {
    public static void main(String[] args) {
        
        //calculadora de una tienda
        double precioProducto=1200;
        int cantidad=5;
        double descuento=0.20;

        double totalDes=(precioProducto*cantidad)*descuento;
        double toPagar=(precioProducto*cantidad)-totalDes;
        System.out.println("el valor a pagar es: "+toPagar);
    }
}
