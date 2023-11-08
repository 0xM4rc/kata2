package src.software.ulpgc.kata2;

public class ElectricVehicle {
    private final String county;
    private final String city;
    private final String model_Year;
    private final String make;
    private final String model;
    
    public ElectricVehicle(String county, String city, String model_Year, String make, String model) {
        this.county = county;
        this.city = city;
        this.model_Year = model_Year;
        this.make = make;
        this.model = model;
    }

    public String getCounty() {
        return county;
    }

    public String getCity() {
        return city;
    }

    public String getModel_Year() {
        return model_Year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

}
