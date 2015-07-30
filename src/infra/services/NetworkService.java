package infra.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkService
{   
    public static String getContentFromUrl(String urlString) throws IOException
    {
        String content = "";
        URL url = new URL(urlString);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        
        String line;
        
        while ((line = br.readLine()) != null)
        {
            content += line + "\n";
        }
        
        return content.trim();
    }
}
