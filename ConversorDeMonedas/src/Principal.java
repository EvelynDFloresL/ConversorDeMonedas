import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
            Scanner lectura = new Scanner(System.in);
            String eleccion;
            do {
            System.out.println("***********************************");
            System.out.println("¡Bienvenido al conversor de monedas!");
            System.out.println("Eliga una conversion");
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
            Monedas monedas = new Monedas();
            switch (eleccion) {
                case "1": {
                    String codigoMoneda = "ARS"; //codigo de moneda argentino
                    String codigoMonedaDestino = "COP"; // codigo de moneda destino colombiano

                    System.out.println("ARS (peso argentino) --> COP (peso colombiano)");
                    try {
                        double tasaCambio = monedas.obtenerTasaCambio(codigoMoneda, codigoMonedaDestino);
                        System.out.println("Ingrese el valor que desee convertir: ");
                        int cantidadMonedas = lectura.nextInt();
                        lectura.nextLine();

                        System.out.println("La conversion de " + cantidadMonedas + " (ARS) a (COP) es: "
                                + String.format("%.4f", cantidadMonedas * tasaCambio));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                }
                case "2": {
                    String codigoMoneda = "ARS"; //codigo de moneda argentino
                    String codigoMonedaDestino = "USD"; // codigo de moneda destino dolar estadounidense
                    System.out.println("ARS (peso argentino) --> USD (dolar estadounidense)");
                    try {
                        double tasaCambio = monedas.obtenerTasaCambio(codigoMoneda, codigoMonedaDestino);
                        System.out.println("Ingrese el valor que desee convertir: ");
                        int cantidadMonedas = lectura.nextInt();
                        lectura.nextLine();

                        System.out.println("La conversion de " + cantidadMonedas + " (ARS) a (USD) es: "
                                + String.format("%.4f", cantidadMonedas * tasaCambio));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                    break;
                }
                case "3": {
                    String codigoMoneda = "COP"; //codigo de moneda colombiana
                    String codigoMonedaDestino = "ARS"; // codigo de moneda destino peso argentino
                    System.out.println("COP (peso colombiano) --> ARS (peso argentino)");
                    try {
                        double tasaCambio = monedas.obtenerTasaCambio(codigoMoneda, codigoMonedaDestino);
                        System.out.println("Ingrese el valor que desee convertir: ");
                        int cantidadMonedas = lectura.nextInt();
                        lectura.nextLine();

                        System.out.println("La conversion de " + cantidadMonedas + " (COP) a (ARS) es: "
                                + String.format("%.4f", cantidadMonedas * tasaCambio));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case "4": {
                    String codigoMoneda = "COP"; //codigo de moneda colombiana
                    String codigoMonedaDestino = "USD"; // codigo de moneda destino dolar estadounidense
                    System.out.println("COP (peso colombiano) --> USD (dolar estadounidense)");
                    try {
                        double tasaCambio = monedas.obtenerTasaCambio(codigoMoneda, codigoMonedaDestino);
                        System.out.println("Ingrese el valor que desee convertir: ");
                        int cantidadMonedas = lectura.nextInt();
                        lectura.nextLine();

                        System.out.println("La conversion de " + cantidadMonedas + " (COP) a (USD) es: "
                                +  String.format("%.4f", cantidadMonedas * tasaCambio));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case "5": {
                    String codigoMoneda = "USD"; //codigo de moneda dolar estadonidense
                    String codigoMonedaDestino = "ARS"; // codigo de moneda destino peso argentino
                    System.out.println("USD (dolar estadounidense) --> ARS (peso argentino)");
                    try {
                        double tasaCambio = monedas.obtenerTasaCambio(codigoMoneda, codigoMonedaDestino);
                        System.out.println("Ingrese el valor que desee convertir: ");
                        int cantidadMonedas = lectura.nextInt();
                        lectura.nextLine();

                        System.out.println("La conversion de " + cantidadMonedas + " (USD) a (ARS) es: "
                                + String.format("%.4f", cantidadMonedas * tasaCambio));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }

                case "6": {
                    String codigoMoneda = "USD"; //codigo de moneda destino dolar estadounidense
                    String codigoMonedaDestino = "COP"; // codigo de moneda destino peso colombiano
                    System.out.println("USD (dolar estadounidense) --> COP (peso colombiano)");
                    try {
                        double tasaCambio = monedas.obtenerTasaCambio(codigoMoneda, codigoMonedaDestino);
                        System.out.println("Ingrese el valor que desee convertir: ");
                        int cantidadMonedas = lectura.nextInt();
                        lectura.nextLine();

                        System.out.println("La conversion de " + cantidadMonedas + " (USD) a (COP) es: "
                                + String.format("%.4f", cantidadMonedas * tasaCambio));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
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
