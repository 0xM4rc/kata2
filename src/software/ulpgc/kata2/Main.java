package src.software.ulpgc.kata2;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<ElectricVehicle> vehicles = CsvFileElectricVehicleLoader.with(
                new File(
                        "C:/Users/marc/Desktop/Tercero/IS2/katas/kata2/assets/csvFiles/Electric_Vehicle_Population_Data_simplified.csv"))
                .load();
        
        
        ElectricVehicleStatistic statisctic = new YearsElectricVehicleStatic();
        Map<String, Integer> map = statisctic.calculate(vehicles);
        for (String key : map.keySet()) {
            System.out.println(key+" = "+map.get(key));
        }

        // GraphicalRepresentation histogram = new HistogramRepresentation(map);
        // histogram.show();
        
        // TODO : remove GraphicalRepresentation and HistogramRepresentation
    }
}
