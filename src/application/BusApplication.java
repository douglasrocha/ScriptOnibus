package application;

import java.io.IOException;
import java.util.List;

import domain.entities.Bus;
import domain.services.BusService;

public class BusApplication
{
    public static List<Bus> get(int linha) throws IOException
    {       
        // Jackson does not accept uppercase properties
        String content = BusService.getLineJson(linha).replace("COLUMNS", "columns")
                                                      .replace("DATA", "data");
        
        return BusService.getListOfBusFromJson(content);
    }
}
