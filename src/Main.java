import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Account information
        String registeredName = "";
        String registeredEmail = "";
        String registeredPassword = "";

        while (true) {
            System.out.println("=====================");
            System.out.println("===== SCC HOMES =====");
            System.out.println("=====================");
            System.out.println("1. Sign up");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("=====================");
            System.out.print("Select: ");
            int select = sc.nextInt();
            sc.nextLine();
            System.out.println("=====================");


            while (select > 3 || select < 1) {
                System.out.print("Invalid Choice! \nSelect Again: ");
                select = sc.nextInt();
            }

            if (select == 1) {
                System.out.println("=====================");
                System.out.println("= SCC HOMES Sign up =");
                System.out.println("=====================");
                System.out.print("Enter name: ");
                registeredName = sc.nextLine();
                System.out.print("Enter Email: ");
                registeredEmail = sc.nextLine();
                System.out.print("Enter Password: ");
                registeredPassword = sc.nextLine();

                System.out.println("Account Registered Successfully!");
                System.out.println("Welcome, " + registeredName + "!");
                System.out.println("Press any key to continue.");
                sc.nextLine();
            } else if (select == 2) {
                System.out.println("=====================");
                System.out.println(" Login your Account ");
                System.out.println("=====================");
                System.out.print("Enter your Email: ");
                registeredEmail = sc.nextLine();
                System.out.print("Enter your Password: ");
                registeredPassword = sc.nextLine();

                if (registeredEmail.contains("admin")) {
                    propertyManager pmanager = new propertyManager();
                    pmanager.pmDashboard(registeredName);
                }else if (registeredEmail.contains("security")){
                    securityPersonel spersonel = new securityPersonel();
                    spersonel.SpDashboard(registeredName);
                }else{
                    Homeowner hOwner = new Homeowner();
                    hOwner.homeOwnerDashboard(registeredName);
                }
            }else{
                System.out.println("Thank you for visiting SCC Homes!");
                return;
            }

        }
    }
}