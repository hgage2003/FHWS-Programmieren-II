package ueb19.aufgabe3;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Browser {
    public static void main(String[] args) {
        Response response = ClientBuilder.newClient()
                .target("https://jsonplaceholder.typicode.com/")
                .path("posts/1")
                .request(MediaType.APPLICATION_JSON)
                .get();
        String s = response.readEntity(String.class);
        System.out.println(s);
    }
}
