
public class Country {
    private String countryName;
    private String countryISOCode;
//код страны согласно ISO 31661  alpha2
    private City[] cities;

    public Country(String countryName, String countryISOCode, City[] cities) {
        this.countryName = countryName;
        this.countryISOCode = countryISOCode;
        this.cities = cities;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }
}
