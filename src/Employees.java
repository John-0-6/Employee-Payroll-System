public abstract class Employees {

  protected String id;
  protected String name;

  public Employees(String id, String name){
    this.id = id;
    this.name = name;
  }

  public String getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public abstract String getEmployeeType();

  public abstract double getSalary();

  @Override
  public String toString() {
    return "\nID: " + id +
      "| Name: " + name +
      "| Type: " + getEmployeeType() + calculateSalary();
  }

  public abstract SalaryBreakdown calculateSalary();

}