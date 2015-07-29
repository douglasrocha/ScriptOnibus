package domain.entities;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bus
{
    private String DATAHORA;

    private String ORDEM;
    
    private String LINHA;
    
    private double LATITUDE;
    
    private double LONGITUDE;
    
    private double VELOCIDADE;

    /**
     * @return the dATAHORA
     */
    public String getDataHora()
    {
        return DATAHORA;
    }

    /**
     * @param dATAHORA the dATAHORA to set
     */
    public void setDataHora(String dataHora)
    {
        DATAHORA = dataHora;
    }

    /**
     * @return the oRDEM
     */
    public String getOrdem()
    {
        return ORDEM;
    }

    /**
     * @param oRDEM the oRDEM to set
     */
    public void setOrdem(String ordem)
    {
        ORDEM = ordem;
    }

    /**
     * @return the lINHA
     */
    public String getLinha()
    {
        return LINHA;
    }

    /**
     * @param lINHA the lINHA to set
     */
    public void setLinha(String linha)
    {
        LINHA = linha;
    }

    /**
     * @return the lATITUDE
     */
    public double getLatidude()
    {
        return LATITUDE;
    }

    /**
     * @param lATITUDE the lATITUDE to set
     */
    public void setLatitude(double latitude)
    {
        LATITUDE = latitude;
    }

    /**
     * @return the lONGITUDE
     */
    public double getLongitude()
    {
        return LONGITUDE;
    }

    /**
     * @param lONGITUDE the lONGITUDE to set
     */
    public void setLongitude(double longitude)
    {
        LONGITUDE = longitude;
    }

    /**
     * @return the vELOCIDADE
     */
    public double getVelocidade()
    {
        return VELOCIDADE;
    }

    /**
     * @param vELOCIDADE the vELOCIDADE to set
     */
    public void setVelocidade(double velocidade)
    {
        VELOCIDADE = velocidade;
    }
}
