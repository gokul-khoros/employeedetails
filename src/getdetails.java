import java.sql.*;

public class getdetails {
    public static void getgetail(){
        try {
            Connection conc = DriverManager.getConnection("jdbc:mysql://localhost:3306/heros", "root", "Goksravi99.");
            Statement stat= conc.createStatement();
            ResultSet res=stat.executeQuery("select *  from employee;");
            while(res.next()){
                System.out.println(res.getString("firstname")+
                        " "+res.getString("email")+
                        " "+ res.getString("salary") );
            }
        }
        catch (SQLException err){
            System.out.println(err.getMessage());
        }

    }

}
