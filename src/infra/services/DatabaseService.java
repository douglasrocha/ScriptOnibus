package infra.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DatabaseService
{
    public static boolean ExecuteQuery(String query)
    {
        Connection connect = null;
        Statement st = null;
        
        try 
        {
            Class.forName("org.mariadb.jdbc.Driver");
            connect =  DriverManager.getConnection
                    (
                            "jdbc:mariadb://localhost/mydatabase?user=root&password=root"
                    );
            
            connect.setAutoCommit(false);
            
            st = connect.createStatement();
            
            return st.execute(query);
        }
        catch (Exception e) 
        {

            if (connect != null) 
            {
                try 
                {
                    st.close();
                    connect.rollback();
                } 
                catch(SQLException e2) 
                {
                    e2.printStackTrace();
                }
            }
            
        } 
        finally 
        {
            if (st != null) 
            {
                try 
                {
                    st.close();
                    connect.setAutoCommit(true);
                } 
                catch(SQLException e) 
                {
                    e.printStackTrace();
                }
            }
        }

        try 
        {
            connect.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        return false;
    }

    public static boolean ExecuteQuery(List<String> query)
    {
        Connection connect = null;
        Statement st = null;
        
        try 
        {
            Class.forName("org.mariadb.jdbc.Driver");
            connect =  DriverManager.getConnection
                    (
                            "jdbc:mariadb://localhost/mydatabase?user=root&password=root"
                    );
            
            connect.setAutoCommit(false);
            
            st = connect.createStatement();

            for (String sql : query)
            {
                st.addBatch(sql);
            }
            
            st.executeBatch();
            
            return true;
        }
        catch (Exception e) 
        {

            if (connect != null) 
            {
                try 
                {
                    st.close();
                    connect.rollback();
                } 
                catch(SQLException e2) 
                {
                    e2.printStackTrace();
                }
            }
            
        } 
        finally 
        {
            if (st != null) 
            {
                try 
                {
                    st.close();
                    connect.setAutoCommit(true);
                } 
                catch(SQLException e) 
                {
                    e.printStackTrace();
                }
            }
        }

        try 
        {
            connect.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        return false;
    }
    
}
