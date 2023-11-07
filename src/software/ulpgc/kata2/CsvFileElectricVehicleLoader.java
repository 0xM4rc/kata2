package src.software.ulpgc.kata2;

import java.io.File;
import java.util.List;

public class CsvFileElectricVehicleLoader implements ElectricVehicleLoader{

    private File file;

    public static ElectricVehicleLoader with(File file) {
        return new CsvFileElectricVehicleLoader(file);
    }

    private CsvFileElectricVehicleLoader(File file) {
        this.file = file;
    }

    @Override
    public List<ElectricVehicle> load() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
