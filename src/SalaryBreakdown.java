public class SalaryBreakdown {

  double monthlySalary;
  double thirteenthMonth;
  double overtimeBonus;

  public SalaryBreakdown(double monthlySalary, double thirteenthMonth, double overtimeBonus){
    this.monthlySalary = monthlySalary;
    this.thirteenthMonth = thirteenthMonth;
    this.overtimeBonus = overtimeBonus;
  }

  public String toString(){
    if(overtimeBonus == 0.0){
      return "\nYour Month Salary: " + monthlySalary + " | Your Accumulated 13th month pay: " + thirteenthMonth;
    }
    else {
      return "\nYour Month Salary: " + monthlySalary + " | Your Overtime Bonus: " + overtimeBonus + " | Your Accumulated 13th month pay: " + thirteenthMonth;
    }
  }

}