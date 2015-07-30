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
            while (true)
            {
            
                List<Bus> list570 = BusApplication.get(570);
                List<Bus> list583 = BusApplication.get(583);
                
                /*
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
                */
                
                for (Bus bus : list570)
                {
                    BusApplication.insert(bus);
                }
                
                for (Bus bus : list583)
                {
                    BusApplication.insert(bus);
                }
                
                try 
                {
                    Thread.sleep(300000);
                    //Thread.sleep(5000);
                } 
                catch(InterruptedException ex) 
                {
                    Thread.currentThread().interrupt();
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
