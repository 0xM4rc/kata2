package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YearsCountElectricVehicleStatistic implements ElectricVehicleStatistic{
    @Override
    public Map<String, Integer> calculate(List<ElectricVehicle> vehicles) {
        Map<String, Integer> result = new HashMap<>();

        for (ElectricVehicle vehicle :
                vehicles) {
            String year = vehicle.modelYear();
            if(result.containsKey(year)){
                result.put(year, result.get(year)+1);
            }else {
                result.put(year, 1);
            }
        }
        return result;
    }
}
