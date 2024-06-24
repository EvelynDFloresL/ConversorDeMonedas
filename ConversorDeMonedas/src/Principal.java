import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
            Scanner lectura = new Scanner(System.in);
            String eleccion;
            do {
            System.out.println("***********************************");
            System.out.println("Eliga una una conversion");
            System.out.println("""
                    1. ARS (peso argentino) --> COP (peso colombiano)
                    2. ARS (peso argentino) --> USD (dolar estadounidense)
                    3. COP (peso colombiano) --> ARS (peso argentino)
                    4. COP (peso colombiano) --> USD (dolar estadounidense)
                    5. USD (dolar estadounidense) --> ARS (peso argentino)
                    6. USD (dolar estadounidense) --> COP (peso colombiano)
                    7. SALIR
                    """);
            eleccion = lectura.nextLine();
            switch (eleccion) {
                case "1": {
                    String codigoMoneda = "ARS"; //codigo de moneda argentino
                    String codigoMonedaDestino = "COP"; // codigo de moneda destino colombiano
                    Monedas monedas = new Monedas();
                    System.out.println("ARS (peso argentino) --> COP (peso colombiano)");
                    try {
                        double tasaCambio = monedas.obtenerTasaCambio(codigoMoneda, codigoMonedaDestino);
                        System.out.println("La tasa de cambio de " + codigoMoneda + " a " + codigoMonedaDestino + " es: " + tasaCambio);

                        System.out.println("Ingrese el valor que desee convertir: ");
                        int cantidadMonedas = lectura.nextInt();

                        System.out.println("La conversion de " + cantidadMonedas + "(ARS) a (COP) es: " + cantidadMonedas * tasaCambio);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                }
                case "2": {
                    String codigoMoneda = "ARS"; //codigo de moneda argentino
                    String codigoMonedaDestino = "USD"; // codigo de moneda destino dolar estadounidense
                    Monedas monedas = new Monedas();
                    System.out.println("ARS (peso argentino) --> USD (dolar estadounidense)");
                    try {
                        double tasaCambio = monedas.obtenerTasaCambio(codigoMoneda, codigoMonedaDestino);
                        System.out.println("La tasa de cambio de " + codigoMoneda + " a " + codigoMonedaDestino + " es: " + tasaCambio);

                        System.out.println("Ingrese el valor que desee convertir: ");
                        int cantidadMonedas = lectura.nextInt();

                        System.out.println("La conversion de " + cantidadMonedas + "(ARS) a (USD) es: " + cantidadMonedas * tasaCambio);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                    break;
                }
                case "3": {
                    System.out.println("COP (peso colombiano) --> ARS (peso argentino)");
                    break;
                }
                case "4": {
                    System.out.println("COP (peso colombiano) --> USD (dolar estadounidense)");
                    break;
                }
                case "5": {
                    System.out.println("USD (dolar estadounidense) --> ARS (peso argentino)");
                    break;
                }

                case "6": {
                    System.out.println("USD (dolar estadounidense) --> COP (peso colombiano)");
                    break;
                }
                case "7": {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Opción no válida.");
                    break;
                }

            }
        }while (!eleccion.equals("7"));
        lectura.close();


    }
}
