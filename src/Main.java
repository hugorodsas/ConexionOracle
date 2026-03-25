import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="RIBERA";
        String password="ribera";

        try (Connection conn = DriverManager.getConnection(url,user,password)){
            System.out.println("Conectado");
        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
