// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // esta parte del codigo calcula el descuento de un producto x
    /* System.out.println("Por favor digite el precio original del producto");
            Scanner teclado = new Scanner(System.in);
                float precioOriginal = teclado.nextFloat();

        System.out.println("Ahora por favor digite el porcentaje a descontar");
            Scanner teclado2 = new Scanner(System.in);
                float porcentajeDescuento = teclado.nextFloat();

        float precioConDescuento = precioOriginal - (precioOriginal * porcentajeDescuento/100);
            System.out.println("El precio final del producto despues del descuento aplicado es de " + precioConDescuento);
        */
// esta seccion de codigo calcula la propina
        System.out.println("Por favor digite el total de la cuenta");
            Scanner teclado = new Scanner(System.in);
                float totalCuenta = teclado.nextFloat();
            float propina1 = 10;
                float propina = totalCuenta * (propina1/100);


        System.out.println("La propina que debe dejar es de "+ propina);

    }
}