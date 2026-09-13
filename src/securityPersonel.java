import  java.util.Scanner;

public class securityPersonel {
    Scanner sc = new Scanner(System.in);
    public void SpDashboard(String registeredName){
        while(true){
            System.out.println("===================================");
            System.out.println("Welcome, " + registeredName + "!");
            System.out.println("===================================");
            System.out.println("=== Security Personel Dashboard ===");
            System.out.println("===================================");

            System.out.println("1. View pending visitors");
            System.out.println("2. Verify visitors");
            System.out.println("3. Record Visitor Entry");
            System.out.println("4. Record visitor Exit");
            System.out.println("5. View Access Logs");
            System.out.println("6. Logout");
            System.out.print("Choose: ");
            int choose = sc.nextInt();
            System.out.println("===================================");

            switch (choose){
                case 1:
                    //Display all pending visitor requests
                    break;
                case 2:
                    //verify and approve visitor requests
                    break;
                case 3:
                    //Record the visitor's entry into the property
                    break;
                case 4:
                    // Record when the visitor leaves the property
                    break;
                case 5:
                    //Display all visitor access records
                    break;
                case 6: //Log out and return to the main menu
                    System.out.println("Logging out...");
                    return;
            }


        }
    }
}