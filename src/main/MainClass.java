package main;

import java.util.List;

import application.BusApplication;
import domain.entities.Bus;

public class MainClass
{

    public static void main(String[] args)
    {        
        while (true)
        {
        
            List<Bus> list570 = BusApplication.get(570);
            List<Bus> list583 = BusApplication.get(583);
            
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

}
