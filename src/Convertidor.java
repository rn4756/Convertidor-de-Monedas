import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Convertidor{

    public static double convertidor(String busqueda, String cambio){

            String direccion = "https://v6.exchangerate-api.com/v6/3fa5986a3b0934ac5beb6215/pair/" + busqueda + "/" + cambio;
        ;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());


                JsonObject jsonobj = JsonParser.parseString(response.body()).getAsJsonObject();

                // Accedemos a la tasa de cambio directamente
                return jsonobj.get("conversion_rate").getAsDouble();
            } catch (IOException | InterruptedException e) {
                System.out.println("Ocurrió un error al realizar la conversión:");
                System.out.println(e.getMessage());
                e.printStackTrace(); // Esto es útil para depuración
            }


        return 0;
    }
}