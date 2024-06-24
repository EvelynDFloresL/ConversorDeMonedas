import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class prueba {

    public static void main(String[] args) {
        String codigoMoneda = "USD"; // Código de la moneda base
        String codigoMonedaDestino = "EUR"; // Código de la moneda destino
        String apiKey = "40beafb4ebcfa87030744b4e"; // Tu clave de API

        String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + codigoMoneda;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Parsear la respuesta JSON
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");

            // Obtener la tasa de cambio específica
            if (conversionRates.has(codigoMonedaDestino)) {
                double tasaCambio = conversionRates.get(codigoMonedaDestino).getAsDouble();
                System.out.println("La tasa de cambio de " + codigoMoneda + " a " + codigoMonedaDestino + " es: " + tasaCambio);
            } else {
                System.out.println("No se encontró la tasa de cambio para la moneda destino especificada.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
