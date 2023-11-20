import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Employee;

public class App {
    public static void main(String[] args){



        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();

        List<Employee> List = new ArrayList<>();

        for(int i = 0; i<=n; i++){
                System.out.println("Employee #" + i + "data: ");
                System.out.print("Outsourced (Y/N)? ");
                char ch = sc.next() .charAt(0);
                System.out.print("Name: " );
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per Hour: ");
                double valuePerHour = sc.nextDouble();


                if (ch == 'y'){
                
                }

                

        }



        sc.close();
    }
}
