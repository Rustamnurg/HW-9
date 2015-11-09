public class Weather {
    private String sky;
    private String precipitation;
    private int temp;
    private double wind;
    private int humidity;
    private int pressure;
    public int rating;

    public Weather(String sky, String precipitation, double wind, int temp,int humidity, int pressure, int rating){
        this.sky = sky;
        this.precipitation = precipitation;
        this.wind = wind;
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.rating = rating;
    }

    public void changeWeatherToCold(){
        this.wind = 2;
        this.temp = -20;
        this.rating -= 5;
    }

    public void changeWeatherToWindy(){
        this.wind = 20;
        this.rating -= 5;
    }

    public void changeWeatherToSunny(){
        this.sky = "Солнечно";
        this.precipitation = "Ясно";
        this.rating += 20;
    }

    public void changeWeatherToRain(){
        this.sky = "Облачно";
        this.precipitation = "Ливень";
        this.rating -= 20;
    }

    public int getTemp(){
        return temp;
    }

    public void setTemp(int t){
        this.temp = t;
        this.rating += t * 0.3;
    }

    public String toString() {
        return sky +  "\nосадки: " + precipitation + "\nветер: " + wind  + "  м/с"  + "\nтемпература: " + Integer.toString(temp) + " C" +
                "\nвлажност: " + humidity + " %" + "\nдавление: " + pressure + "\nоценка комфорта: " + rating;
    }
}
