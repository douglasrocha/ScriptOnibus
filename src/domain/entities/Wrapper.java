package domain.entities;

public class Wrapper
{
    private String[] COLUMNS;
    
    private Object[][] DATA;

    /**
     * @return the cOLUMNS
     */
    public String[] getColumns()
    {
        return COLUMNS;
    }

    /**
     * @param cOLUMNS the cOLUMNS to set
     */
    public void setColumns(String[] columns)
    {
        COLUMNS = columns;
    }

    /**
     * @return the dATA
     */
    public Object[][] getData()
    {
        return DATA;
    }

    /**
     * @param dATA the dATA to set
     */
    public void setData(Object[][] dATA)
    {
        DATA = dATA;
    } 

}
