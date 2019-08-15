import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {

    public static final String DEFAULT_URL= "http://my-json-server.typicode.com/flowacademyhu/java-mock-data/resturnat";

    public static void main(String[] args) throws IOException, InterruptedException {
        var url = DEFAULT_URL;
        if (args.length > 1){
            url = args[0];
        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        //  System.out.println(response.body());

        Gson gson = new Gson();
        Restaurant restaurant = gson.fromJson(response.body(), Restaurant.class);
        System.out.println(restaurant.toString());

        /*client.sendAsync(request, BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();*/


    }
}
