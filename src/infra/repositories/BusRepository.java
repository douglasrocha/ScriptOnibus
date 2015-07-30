package infra.repositories;

import infra.services.DatabaseService;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

import domain.entities.Bus;

public class BusRepository
{    
    @SuppressWarnings("resource")
    private static String getInsertQuery(Bus bus)
    {
        String query = new Formatter(Locale.US)
                               .format("INSERT INTO bus (ORDEM, LINHA, DATAHORA, LATITUDE, LONGITUDE, VELOCIDADE) "
                                     + "VALUES ('%s', '%s', '%s', %.6f, %.6f, %.6f)",
                                     bus.getOrdem(), 
                                     bus.getLinha(), 
                                     bus.getDataHora(), 
                                     bus.getLatidude(),
                                     bus.getLongitude(), 
                                     bus.getVelocidade()).toString();
        
        return query;
    }
    
    public static boolean insert(Bus bus)
    {
        String query = getInsertQuery(bus);
        
        return DatabaseService.ExecuteQuery(query);
        
    }
    
    public static boolean insert(List<Bus> listBus)
    {
        ArrayList<String> listQuery = new ArrayList<String>(listBus.size());
        
        for (Bus bus : listBus)
        {
            listQuery.add(getInsertQuery(bus));
        }
        
        return DatabaseService.ExecuteQuery(listQuery);
    }

}
