import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    System.out.println("""
     ~~~~~~~~~~~~~~~~~~~~~~~~~
      Employee Payroll System
     ~~~~~~~~~~~~~~~~~~~~~~~~~""");

    Scanner scanner = new Scanner(System.in);
    EmployeeManager employeeManager = new EmployeeManager();

    boolean running = true;

    while(running){    System.out.println("\n1. Show All Employees");
      System.out.println("2. Show Full Time Employees");
      System.out.println("3. Show Part Time Employees");
      System.out.println("4. Add Employee");
      System.out.println("5. Exit Program");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch(choice){
        case 1 :
          employeeManager.displayEmployees();
          break;

        case 2:
          employeeManager.displayFullTimeEmployee();
          break;

        case 3:
          employeeManager.displayPartTimeEmployee();
          break;

        case 4:
          System.out.print("Enter ID: ");
          String id = scanner.nextLine();

          System.out.print("Enter Name: ");
          String name = scanner.nextLine().toUpperCase();

          System.out.print("Enter Employee Type (Full Time / Part Time):");
          String employeeType = scanner.nextLine().toUpperCase();

          System.out.print("Enter the number of Present Attendance (22 working days): ");
          int attendance = scanner.nextInt();
          scanner.nextLine();

          System.out.print("Enter the number of Overtime (hourly): ");
          int overtime = scanner.nextInt();
          scanner.nextLine();

          if(employeeType.equals("FULL TIME")){
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(id, name, attendance, overtime);
            employeeManager.addEmployee(fullTimeEmployee);
          }
          else if(employeeType.equals("PART TIME")){
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(id, name, attendance, overtime);
            employeeManager.addEmployee(partTimeEmployee);
          }
          break;

        case 5:
          running = false;
          System.out.println("\n --- Exiting Program...");
          break;
      }
    }

    scanner.close();
  }
}