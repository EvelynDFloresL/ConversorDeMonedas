import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Monedas{
    public double obtenerTasaCambio(String codigoMoneda, String codigoMonedaDestino) throws Exception{

        String direccion = "https://v6.exchangerate-api.com/v6/40beafb4ebcfa87030744b4e/latest/"+codigoMoneda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
        JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");

        // Obtener la tasa de cambio específica
        if (conversionRates.has(codigoMonedaDestino)) {
            return conversionRates.get(codigoMonedaDestino).getAsDouble();
        } else {
            throw new Exception("No se encontró la tasa de cambio para la moneda destino especificada.");
        }
    }
}
