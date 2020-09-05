import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class deletedetails {
    public static void delete(){
        try {
            Connection conc = DriverManager.getConnection("jdbc:mysql://localhost:3306/heros", "root", "Goksravi99.");
            PreparedStatement stat = conc.prepareStatement("delete from employee where id= ?;");
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the employee id to delete their detail");
            int id= Integer.parseInt(bf.readLine());
            stat.setInt(1, id);
            int res=stat.executeUpdate();
            if(res==1)
            { System.out.println("Details of the user is deleted");
            }
            else{
                System.out.println("no result found");
                return;
            }
            /*if(stat.next()){
                int id = result.getInt("id");
                System.out.println("user exist");
            }
            else{
                System.out.println("no result found");
                return;
            }*/
        }
        catch (SQLException | IOException err)
        {
            System.out.println(err.getMessage());

        }
    }
}
