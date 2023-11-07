package src.software.ulpgc.kata2;

public class ElectricVehicle {
    private final String county_city;
    private final String model_year;
    private final String make;
    private final String model;

    public ElectricVehicle(String county_city, String model_year, String make, String model) {
        this.county_city = county_city;
        this.model_year = model_year;
        this.make = make;
        this.model = model;
    }

    public String getCounty_city() {
        return county_city;
    }

    public String getModel_year() {
        return model_year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    

}
