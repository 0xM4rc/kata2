package src.software.ulpgc.kata2;

import java.io.File;
import java.util.List;

public class CsvFileElectricVehicleLoader implements Loader{

    private File file;

    public static OrganizationLoader with(File file) {
        return new CsvFileOrganizationLoader(file);
    }

    private CsvFileOrganizationLoader(File file) {
        this.file = file;
    }

    @Override
    public List<ElectricVehicle> load() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
