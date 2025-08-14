import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion=0;
        while (opcion!=8){
            System.out.println("\n\n************************************\n"+
                    "Bienvenido/a al Conversor de Moneda.\n\n"+
                    "Ingrese la conversión que deseas realizar.\n\n"+
                    "1.- Dólar => Peso Mexicano\n"+
                    "2.- Peso Mexicano => Dolar\n"+
                    "3.- Dólar => Peso Argentino\n"+
                    "4.- Peso Argentino => Dólar\n"+
                    "5.- Dólar => Real Brasileño\n"+
                    "6.- Real Brasileño => Dólar\n"+
                    "7.- Dólar => Peso Colombiano\n"+
                    "8.- Peso Colombiano => Dólar\n"+
                    "9.- Convertir otra moneda => Dólar\n"+
                    "10.- Salir");
            System.out.println("************************************");
            System.out.println("Elija una Opción :");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","MXN",consulta,teclado);
                    break;
                case 2:
                    ConvertirMoneda.convertir("MXN","USD",consulta,teclado);
                    break; //
                case 3:
                    ConvertirMoneda.convertir("USD","ARS",consulta,teclado);
                    break;
                case 4:
                    ConvertirMoneda.convertir("ARS","USD",consulta,teclado);
                    break; //
                case 5:
                    ConvertirMoneda.convertir("USD","BRL",consulta,teclado);
                    break;
                case 6:
                    ConvertirMoneda.convertir("BRL","USD",consulta,teclado);
                    break;
                case 7:
                    ConvertirMoneda.convertir("USD","COP",consulta,teclado);
                    break;
                case 8:
                    ConvertirMoneda.convertir("COP","USD",consulta,teclado);
                    break;
                case 9:
                    ConvertirMoneda.convertirOtraMoneda(consulta,teclado);
                    break;
                case 10:
                    System.out.println("Gracias por Usar el Conversor de Monedas...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no valida, elija opción, hasta luego... ");
                    break;
            }
        }
    }
}
