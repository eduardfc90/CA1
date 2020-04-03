package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author eduar
 */
public class DataSource {
    
    
    private String db= "jdbc:mysql://apontejaj.com:3306/world";
    private String un= "cctstudent";
    private String pw="Pass1234!";
    
    
   private  Connection conn;
   private  Statement stmt;
   private ResultSet rs=null;
    
    public DataSource(){
        try{
            //get a connection to the database
            Connection conn= DriverManager.getConnection(db,un,pw);
            //get a statement fro the connection
            Statement stmt = conn.createStatement();
            
            // #Execute the query
            ResultSet rs= stmt.executeQuery("SELECT * FROM country");
            //loop the result
            while (rs.next())
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            
            //close everything
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(SQLException se ){
            System.out.println("SQL Exception:");
            
            ///loop through the SQL Exception
            
            while (se!= null)
            {
                 System.out.println("State:"+se.getSQLState());
                  System.out.println("Message:"+ se.getMessage());
                   System.out.println("Error:"+ se.getErrorCode());
                   
                   se= se.getNextException();
            }
            
        }
        
        catch(Exception e ){
             System.out.println(e);
        }
    }
    
    public boolean save( String query)
    {
          try {
            stmt.execute(query);
              return true;
        } catch (SQLException e) {
           e.printStackTrace();
           return false;
        }
    }
    
    public ResultSet select (String query){
            // #Execute the query
            
        try {
            rs = stmt.executeQuery(query);
                        
        } catch (SQLException e) {
           e.printStackTrace();
        }
           return rs;
    }
           public void closing(){
        try {
            //close everything
            rs.close();
             stmt.close();
            conn.close();
        } catch (SQLException e) {
               e.printStackTrace();
        }
           
           
           }
}
