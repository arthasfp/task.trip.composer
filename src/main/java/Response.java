
public class Response {
    private Long time;
    private Country[] countries;
    private String echo;

    public Response(Long time, Country[] countries, String echo) {
        this.time = time;
        this.countries = countries;
        this.echo = echo;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Country[] getCountries() {
        return countries;
    }

    public void setCountries(Country[] countries) {
        this.countries = countries;
    }

    public String getEcho() {
        return echo;
    }

    public void setEcho(String echo) {
        this.echo = echo;
    }
}
