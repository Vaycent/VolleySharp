package vaycent.volleysharp;

/**
 * Created by Vaycent on 16/9/5.
 */
public class Location {

    private String lon;
    private String lat;

    private String level;
    private String address;
    private String cityName;
    private String alevel;



    public String getLon() {
        return lon;
    }
    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }
    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public String getAlevel() {
        return alevel;
    }
    public void setAlevel(String alevel) {
        this.alevel = alevel;
    }
}
