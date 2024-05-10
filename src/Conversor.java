import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {


    public static double obterTaxasDeConversao(String valorPrimario, String valorSecundario) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/b5b1e7fb0fd3be529a943180/latest/"+ valorPrimario))
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

            if (jsonObject.has("conversion_rates")) {
                JsonObject dadoDoRates = jsonObject.getAsJsonObject("conversion_rates");

                if (dadoDoRates.has(valorSecundario)) {
                    JsonElement rateElement = dadoDoRates.get(valorSecundario);
                    return rateElement.getAsDouble();
                }
            }
        } catch (IOException | InterruptedException e) {
            e.getMessage();
        }


        return -1;
    }
}
