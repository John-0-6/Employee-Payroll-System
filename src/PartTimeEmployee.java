public class PartTimeEmployee extends Employees{

  int attendance;
  int overtime;

  public PartTimeEmployee(String id, String name, int attendance, int overtime) {
    super(id, name);
    this.attendance = attendance;
    this.overtime = overtime;
  }

  @Override
  public String getEmployeeType() {
    return "PART TIME";
  }

  @Override
  public double getSalary() {
    return 0;
  }

  @Override
  public SalaryBreakdown calculateSalary() {
    double hourlyRate = 90;
    double overtimeRate = hourlyRate * 0.25;
    double monthlySalary;
    double thirteenthMonth;
    double overtimeBonus;

    monthlySalary = attendance * 8 * hourlyRate;
    thirteenthMonth = (monthlySalary / 12) * ((double) attendance / 22);
    overtimeBonus = overtimeRate * overtime;

    return new SalaryBreakdown(monthlySalary, thirteenthMonth, overtimeBonus);
  }
}