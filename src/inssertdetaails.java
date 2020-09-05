import java.sql.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inssertdetaails {
    //Scanner scan= new Scanner(System.in);

    public void inssertdetaails(){
        try{
            Connection conc = DriverManager.getConnection("jdbc:mysql://localhost:3306/heros", "root", "Goksravi99.");
            PreparedStatement ins = conc.prepareStatement("insert into employee (id, firstname, lastname, address,email,salary) values ( ? , ? , ? , ? , ? , ? );");

            System.out.println("Provide the details");
            BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

            System.out.println("\nenter id");
            //int id =scan.nextInt();
            int id = Integer.parseInt(reader.readLine());

            System.out.println("\nenter first name:");
            //String firstname= scan.nextLine();
            String firstname = reader.readLine();

            System.out.println("\nenter Last name:");
            //String lastname= scan.nextLine();
            String lastname = reader.readLine();

            System.out.println("\nenter Address or country:");
            //String address= scan.nextLine();
            String address = reader.readLine();

            System.out.println("\nenter the mail id:");
            //String mail= scan.nextLine();
            String mail = reader.readLine();

            System.out.println("\nenter Salary:");
            //int salary= scan.nextInt();
            int salary = Integer.parseInt(reader.readLine());

            ins.setInt(1,id);
            ins.setString(2, firstname);
            ins.setString(3,lastname);
            ins.setString(4, address);
            ins.setString(5,mail);
            ins.setInt(6,salary);
            ins.executeUpdate();

            //String insert = "insert into employee (id, firstname, lastname, address,email,salary)
            // values ( 738263,'tony','stark','newyork','tonystark@gmail.com',567000);";
            //ins.executeUpdate(insert);
            System.out.println("done");
        }
        catch(SQLException | IOException err)
        {
            System.out.println(err.getMessage());
        }
    }

}