import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;
import java.sql.*;
import java.util.Scanner;

public class updatedetails {
    public static void updatedetils(){
        try{
            Connection conc = DriverManager.getConnection("jdbc:mysql://localhost:3306/heros", "root", "Goksravi99.");
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the first name to fetch details of the user");
            String name=bf.readLine();

            PreparedStatement pstat = conc.prepareStatement("select * from employee where firstname= ?; ");
            pstat.setString(1,name);
            ResultSet result=pstat.executeQuery();

            if(result.next()){
                int id = result.getInt("id");
                System.out.println("user exist");
            }
            else{
                System.out.println("no result found");
                return;
            }
            int id = result.getInt("id");

                System.out.println("select the Update to perform\n" +
                        "1. Firstname change\n" +
                        "2. Lastname change \n" +
                        "3. Change address\n" +
                        "4. Change email\n" +
                        "5. update salary\n");

                Scanner scan = new Scanner(System.in);
                int option = scan.nextInt();


                switch (option) {
                    case 1:
                        PreparedStatement stat = conc.prepareStatement("update employee set firstname = ? where id=?;");
                        System.out.println("\nEnter the first name to change");
                        String firstname = bf.readLine();
                        stat.setString(1, firstname);
                        stat.setInt(2, id);
                        stat.executeUpdate();
                        break;
                    case 2:
                        PreparedStatement stat2 = conc.prepareStatement("update employee set lastname = ? where id=?;");
                        System.out.println("\nEnter the last name to change");
                        String lastname = bf.readLine();
                        stat2.setString(1, lastname);
                        stat2.setInt(2, id);
                        stat2.executeUpdate();
                        break;
                    case 3:
                        PreparedStatement stat3 = conc.prepareStatement("update employee set address = ? where id=?;");
                        System.out.println("\nEnter the address to change");
                        String address = bf.readLine();
                        stat3.setString(1, address);
                        stat3.setInt(2, id);
                        stat3.executeUpdate();
                        break;
                    case 4:
                        PreparedStatement stat4 = conc.prepareStatement("update employee set email = ? where id=?;");
                        System.out.println("\nEnter the email to change");
                        String email = bf.readLine();
                        stat4.setString(1, email);
                        stat4.setInt(2, id);
                        stat4.executeUpdate();
                        break;
                    case 5:
                        PreparedStatement stat5 = conc.prepareStatement("update employee set salary = ? where id=?;");
                        System.out.println("\nEnter the new salary to change");
                        int salary = Integer.parseInt(bf.readLine());
                        stat5.setInt(1, salary);
                        stat5.setInt(2, id);
                        stat5.executeUpdate();
                        break;
                    default:
                        System.out.println("invalid");

                }
                System.out.println("done");

        }
        catch(SQLException | IOException err)
        {
            System.out.println(err.getMessage());
        }


    }

}
