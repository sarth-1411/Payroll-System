import java.sql.*;
import javax.lang.model.SourceVersion;

public class conn {
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///payrol","root","pass@123");
            s = c.createStatement();
            
        
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}
 