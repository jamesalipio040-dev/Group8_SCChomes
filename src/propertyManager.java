import java.util.Scanner;

public class propertyManager {
    Scanner sc = new Scanner(System.in);
    public void pmDashboard(String registeredName){
        while (true) {
            System.out.println("==================================");
            System.out.println("Welcome, Admin " + registeredName + "!");
            System.out.println("==================================");
            System.out.println("=== Property Manager Dashboard ===");
            System.out.println("==================================");

            System.out.println("1. View Homeowners information");
            System.out.println("2. Delete Homeowner");
            System.out.println("3. View Dues");
            System.out.println("4. Set Community Fees");
            System.out.println("5. View Payments History");
            System.out.println("6. View Access Logs");
            System.out.println("7. View visitor Records");
            System.out.println("8. Logout");
            System.out.print("Choose: ");
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    //Display homeowner information
                    break;
                case 2:
                    //Remove a homeowner from the system
                    break;
                case 3:
                    //Display homeowner maintenance dues
                    break;
                case 4:
                    //Set or update the maintenance fee
                case 5:
                    //Display the payment history
                    break;
                case 6:
                    //Display visitor access logs
                    break;
                case 7:
                    // Display records of visitors who entered the property
                    break;
                case 8: //Log out and return to the main menu
                    System.out.println("Logging out...");
                    return;
            }
        }
    }
}