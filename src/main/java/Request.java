import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class Request {
    public static final String KEY = "$1$12309856$euBrWcjT767K2sP9MHcVS/";
    private String echo;

    public Request(String echo) {
        this.echo = echo;
    }

    public String getEcho() {
        return echo;
    }

    public void setEcho(String echo) {
        this.echo = echo;
    }


    }

