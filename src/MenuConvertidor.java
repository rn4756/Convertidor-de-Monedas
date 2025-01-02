import java.util.Scanner;

public class MenuConvertidor {
    public static void main(String[] args) {

        String busqueda = "";
        String cambio = "";
        Scanner lectura = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("Sea bienvenida/o al Conversor de Monedas:\n" +
                "           1) Dolar ==> Peso Argentino\n" +
                "           2) Peso Argentino ==>Dolar\n" +
                "           3) Dolar ==> Real brasileño\n" +
                "           4) Real brasileño ==> Dolar\n" +
                "           5) Dolar ==>Peso colombian\n" +
                "           6) Peso Colombiano ==> Dolar\n" +
                "           7) Salir"
        );


        System.out.println("Ingrese una opcion:");
        String opcion = lectura.nextLine(); // Capturas el valor como String
        int op = Integer.parseInt(opcion);




            System.out.println("Ingrese la cantidad que desea convertir");
            String val = lectura.nextLine(); // Capturas el valor como String
            double valor = Integer.parseInt(val);

            switch (op) {
                case 1:
                    busqueda = "USD";
                    cambio = "ARS";
                    break;

                case 2:
                    busqueda = "ARS";
                    cambio = "USD";
                    break;

                case 3:
                    busqueda = "USD";
                    cambio = "BRL";
                    break;

                case 4:
                    busqueda = "BRL";
                    cambio = "USD";
                    break;

                case 5:
                    busqueda = "USD";
                    cambio = "COP";
                    break;

                case 6:
                    busqueda = "COP";
                    cambio = "USD";
                    break;

                case 7:
                    break;
                default:
                    System.out.println("Opcion ingresada no valida");
            }

            double tasaCambio = Convertidor.convertidor(busqueda, cambio);
            double resultado = tasaCambio * valor;
            System.out.println("La cantidad de " + valor + " es equivalente a " + resultado + cambio);
            System.out.println("*******************************************");




    }
}
