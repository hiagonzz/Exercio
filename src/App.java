import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entites.Employee;
import entites.OutsourceEmployee;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> List = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + "data: ");
            System.out.print("Outsourced (Y/N)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per Hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("additional Charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourceEmployee(name, hours, valuePerHour,
                        additionalCharge);
                List.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                List.add(emp);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp : List) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
