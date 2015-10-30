import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HttpURLConnectionExample {

    private final String USER_AGENT = "Chrome";

    public static void main(String[] args) throws Exception {
        HttpURLConnectionExample http = new HttpURLConnectionExample();
        System.out.println("\nTesting 2 - Send Http POST request");
        http.sendPost();
    }

    private void sendPost() throws Exception {
        String url = "http://tripcomposer.net/rest/test/countries/get";
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        post.setHeader("User-Agent", USER_AGENT);
        Request request = new Request("test29102015");
        post.setEntity(new StringEntity("{\"key\":\"" + Request.KEY + "\",\"echo\":\"" + request.getEcho() + "\"}",
                ContentType.create("application/json")));
        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String line = "";
        while ((line = rd.readLine()) != null) {
            JSONParser jsonParser = new JSONParser();
            JSONObject object = (JSONObject) jsonParser.parse(line);
        System.out.println(object);
        }
    }
}

