import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("Eliga una una conversion");
        System.out.println("""
                1. ARS (peso argentino) --> COP (peso colombiano)
                2. ARS (peso argentino) --> USD (dolar estadounidense)
                3. COP (peso colombiano) --> ARS (peso argentino)
                4. COP (peso colombiano) --> USD (dolar estadounidense)
                5. USD (dolar estadounidense) --> ARS (peso argentino)
                6. USD (dolar estadounidense) --> COP (peso colombiano)
                """);
        String eleccion=lectura.nextLine();
        switch (eleccion){
            case "1":
                String codigoMoneda = "ARS"; //codigo de moneda argentino
                System.out.println("ARS (peso argentino) --> COP (peso colombiano)");
                System.out.println("Ingrese el valor que desee convertir: ");
                int cantidadMonedas = lectura.nextInt();
                System.out.println("El número ingresado es: " + cantidadMonedas);
                String direccion = "https://v6.exchangerate-api.com/v6/40beafb4ebcfa87030744b4e/latest/"+codigoMoneda;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());

                ///////////////////////////////////////////
               /* String json = response.body();
                System.out.println(json);

                MonedaOmdb miTituloOmdb = gson.fromJson(json, MonedaOmdb.class);
                System.out.println(miTituloOmdb);

                Monedas miTitulo = new Monedas(miTituloOmdb);
                System.out.println("Titulo ya convertido: " + miTitulo);

                monedas.add(miTitulo);*/

            break;
            case "2":
                System.out.println("ARS (peso argentino) --> USD (dolar estadounidense)");
                break;
            case "3":
                System.out.println("COP (peso colombiano) --> ARS (peso argentino)");
            break;
            case "4":
                System.out.println("COP (peso colombiano) --> USD (dolar estadounidense)");
                break;
            case "5":
                System.out.println("USD (dolar estadounidense) --> ARS (peso argentino)");
            break;
            case "6":
                System.out.println("USD (dolar estadounidense) --> COP (peso colombiano)");
            break;
            default:
                System.out.println("Opción no válida.");
            break;

        }


    }
}
