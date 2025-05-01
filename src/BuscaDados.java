import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaDados {
    public Moeda buscaMoeda(String base_code, String target_code) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/5faac952d383569b59dc6c30/pair/"
                + base_code + "/" +target_code);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível achar a cotação desta MOEDA !!!");
        }
    }
    public Moeda buscaCotacao (String base_code, String target_code) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/5faac952d383569b59dc6c30/pair/"
                + base_code + "/" + target_code);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível achar a cotação desta MOEDA !!!");
        }
    }
}