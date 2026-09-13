import java.util.Scanner;

public class Homeowner {
    Scanner sc = new Scanner(System.in);
    public void homeOwnerDashboard(String registeredName){
        while(true){
            System.out.println("===================================");
            System.out.println("Welcome, " + registeredName + "!");
            System.out.println("===================================");
            System.out.println("======= Homeowner Dashboard =======");
            System.out.println("===================================");

            System.out.println("1. View my Information");
            System.out.println("2. View my Maintenance Fee");
            System.out.println("3. Pay maintenance Fee");
            System.out.println("4. Register Visitor");
            System.out.println("5. View My Visitors");
            System.out.println("6. Logout");
            System.out.print("Choose: ");
            int choose = sc.nextInt();
            System.out.println("===================================");

            switch (choose){
                case 1:
                    //Display the homeowner's account information
                    break;
                case 2:
                    //Display the current maintenance fee and balance
                    break;
                case 3:
                    //Process the maintenance fee payment
                    break;
                case 4:
                    //Register a visitor for property access
                    break;
                case 5:
                    //Display the homeowner's registered visitors
                    break;
                case 6: //Log out and return to the main menu
                    System.out.println("Logging out...");
                    return;
            }
        }
    }
}