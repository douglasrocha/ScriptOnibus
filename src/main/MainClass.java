package main;

import java.io.IOException;
import java.util.List;

import application.BusApplication;
import domain.entities.Bus;

public class MainClass
{

    public static void main(String[] args)
    {
        try
        {
            List<Bus> list570 = BusApplication.get(570);
            List<Bus> list583 = BusApplication.get(583);
            
            System.out.println("Linha 570");
            
            for (Bus bus : list570)
            {
                System.out.println("Ordem -> " + bus.getOrdem() + 
                                   "; Latitude -> " + bus.getLatidude() + 
                                   "; Longitude -> " + bus.getLongitude());
            }
            
            System.out.println("--------------");
            
            System.out.println("Linha 583");
            
            for (Bus bus : list583)
            {
                System.out.println("Ordem -> " + bus.getOrdem() + 
                                   "; Latitude -> " + bus.getLatidude() + 
                                   "; Longitude -> " + bus.getLongitude());
            }
            
            System.out.println();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
