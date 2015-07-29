package infra;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

public class JacksonService
{
    public static <T> T getObjectFromJson(String json, Class<T> type) 
           throws JsonParseException, JsonMappingException, IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        return (T) mapper.readValue(json, type);
    }
    
    @SuppressWarnings("unchecked")
    public static <T> List<T> getListObjectFromJson(String json, Class<T> type) 
           throws JsonParseException, JsonMappingException, IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory factory = mapper.getTypeFactory();
        
        return (List<T>) mapper.readValue(json, factory.constructType(List.class ,type));
    }
    
    public static <T> String getJsonFromObject(T obj) 
           throws JsonGenerationException, JsonMappingException, IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }
}
