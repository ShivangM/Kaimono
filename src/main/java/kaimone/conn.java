
package kaimone;

/**
 *
 * @author nano
 */
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    
    public conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///kaimonodb","root","");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
