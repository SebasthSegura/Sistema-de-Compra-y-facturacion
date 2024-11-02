import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*******************************************");
        System.out.println("*Bienvenido al sistema de compra a credito*");
        System.out.println("*******************************************");
        System.out.println("");
        System.out.println("""
                Digite el limite de la tarjeta de credito: 
                """);
        double limit = input.nextDouble();

        /*
        para poder crear la tarjeta de credito le asignamos el parametro
        del limite de credito que el usuario nos dio en el input
         */
        CrediCart crediCard = new CrediCart(limit);

        int option = 1;
        while (option != 0){
            System.out.println("Escriba la descripcion de la compra: ");
            String description = input.next();

            System.out.println("Escriba el valor de la Compra: ");
            double price = Double.valueOf(input.next());

            /*
            creamos una nueva compra teniendo en cuenta que ya tenemos los valores
            necesarios para que una compra sea registrada
             */
            Shop shop = new Shop(price, description);
            boolean shopreales = crediCard.deskShopping(shop);

            System.out.println("*******************************");

            if (shopreales) {
                System.out.println("""
                        Compra Exitosa!
                        """);
                System.out.println("Escriba 0 para salir o 1 para continuar: ");
                option = input.nextInt();
            }else {
                System.out.println("""
                        Saldo insuficiente!
                        """);
                option = 0;
            }
        }
        System.out.println("**********************************");
        System.out.println("COMPRAS REALIZADAS: \n");

        /*
        usamos el Collections.sort para realizar una reorganizacion de
        los objetos en la lista
         */
        Collections.sort(crediCard.getShopList());

        /*
        usamos un forEach para poder recorrer la lista y comparar
        los valores de la misma
         */
        for (Shop shop : crediCard.getShopList()){
            System.out.println(shop.getDescription() + " - " + shop.getPrice());
        }
        System.out.println("\n**********************************");
        System.out.println("\n Saldo de la tarjeta: " + crediCard.getBalance());

    }
}
