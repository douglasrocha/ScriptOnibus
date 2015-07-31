package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import domain.entities.Bus;
import domain.services.BusService;

public class BusApplication
{
    public static List<Bus> get(int linha)
    {       
        // Jackson does not accept uppercase properties
        String content;
        try
        {
            content = BusService.getLineJson(linha).replace("COLUMNS", "columns")
                                                          .replace("DATA", "data");
            
            return BusService.getListOfBusFromJson(content);
        }
        catch (IOException e)
        {
            return new ArrayList<Bus>();
        }
    }
    
    public static boolean insert(Bus bus)
    {
        return BusService.insert(bus);
    }
    
    public static boolean insert(List<Bus> bus)
    {
        return BusService.insert(bus);
    }
}
