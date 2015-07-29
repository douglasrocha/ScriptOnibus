package domain.services;

import infra.JacksonService;
import infra.NetworkService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import domain.entities.Bus;
import domain.entities.Wrapper;

public class BusService
{
    private static final String _urlString = "http://dadosabertos.rio.rj.gov.br/apiTransporte/apresentacao/rest/index.cfm/obterPosicoesDaLinha/";
    
    public static String getLineJson(Integer line) throws IOException
    {
        String urlString = _urlString + line.toString();
        return NetworkService.getContentFromUrl(urlString);
    }
    
    public static List<Bus> getListOfBusFromJson(String content) 
           throws JsonParseException, JsonMappingException, IOException
    {
        Wrapper wrapper = JacksonService.getObjectFromJson(content, Wrapper.class);
        ArrayList<Bus> listBus = new ArrayList<>(wrapper.getData().length);
        
        for (Object[] obj : wrapper.getData())
        {
            Bus tempBus = new Bus();
            tempBus.setDataHora(obj[0].toString());
            tempBus.setOrdem(obj[1].toString());
            tempBus.setLinha(obj[2].toString());
            tempBus.setLatitude((double) obj[3]);
            tempBus.setLongitude((double) obj[4]);
            tempBus.setVelocidade((double) obj[5]);
            
            listBus.add(tempBus);
        }
        
        return listBus;
    }
}
