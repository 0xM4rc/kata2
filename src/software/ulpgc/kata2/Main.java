package software.ulpgc.kata2;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<ElectricVehicle> vehicles = CsvFileElectricVehicleLoader.with(
                new File("src/resources/Electric_Vehicle_Population_Data_simplified.csv")
        ).load();

        ElectricVehicleStatistic statistic = new YearsCountElectricVehicleStatistic();
        Map<String, Integer> map = statistic.calculate(vehicles);
        for (String year:
                map.keySet()) {
            System.out.println(year+" = "+map.get(year));
        }
    }
}
