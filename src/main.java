import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int options;

        try {
            while(true)
            {
                System.out.println("\nselect the operation to perform\n" +
                        "1. Insert employee detials\n" +
                        "2. Update the employee details \n" +
                        "3. Delete an employee\n" +
                        "4. Get details of an employee\n" +
                        "5. exit");

                options= scan.nextInt();

                switch (options) {
                    case 1:
                        inssertdetaails in = new inssertdetaails();
                        in.inssertdetaails();
                        break;
                    case 2:
                        updatedetails up = new updatedetails();
                        up.updatedetils();
                        break;
                    case 3:
                        deletedetails de = new deletedetails();
                        de.delete();
                        break;
                    case 4:
                        getdetails ge = new getdetails();
                        ge.getgetail();
                        break;
                    case 5:
                        System.out.println("exiting......\ndone.");
                        return;
                    default:
                        System.out.println("invalid - enter valid operation");
                }
            }
            /*Statement sta = conc.createStatement();
            ResultSet res = sta.executeQuery("Select * from employee;");
            while (res.next())
            {
                System.out.println(res.getString("name")+" "+ res.getString("age"));
            }*/
        }
        catch (Exception err)
        {
            System.out.println(err.getMessage());
        }
    }
}
