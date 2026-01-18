import java.util.ArrayList;

public class EmployeeManager {

  ArrayList<Employees> employees;

  public EmployeeManager(){
    this.employees = new ArrayList<>();
  }

  public void displayEmployees(){
    for(Employees e : employees){
      System.out.println(e);
    }
  }

  public void displayFullTimeEmployee(){
    for(Employees e : employees){
      if(e.getEmployeeType().equals("FULL TIME")){
        System.out.println(e);
      }
    }
  }

  public void displayPartTimeEmployee(){
    for(Employees e : employees){
      if(e.getEmployeeType().equals("PART TIME")){
        System.out.println(e);
      }
    }
  }

  public void addEmployee(Employees employee){
    employees.add(employee);
    System.out.println("Employee added successfully");
  }

}